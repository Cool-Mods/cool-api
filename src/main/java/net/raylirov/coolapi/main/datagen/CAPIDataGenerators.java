package net.raylirov.coolapi.main.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.main.datagen.gen.*;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = CoolApi.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CAPIDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new CAPILanguageGenerator(packOutput,  "en_us"));
        generator.addProvider(event.includeClient(), new CAPILanguageGenerator(packOutput,  "ru_ru"));
        generator.addProvider(event.includeServer(), new CAPIRecipeGenerator(packOutput));
        generator.addProvider(event.includeServer(), new CAPIItemModelGenerator(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new CAPIGlobalLootModifiersGenerator(packOutput));

        CAPIBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new CAPIBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new CAPIItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));


    }
}
