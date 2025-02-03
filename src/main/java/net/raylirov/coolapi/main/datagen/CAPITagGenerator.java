package net.raylirov.coolapi.main.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.raylirov.coolapi.content.CAPIItemTags;

import java.util.concurrent.CompletableFuture;

public class CAPITagGenerator extends FabricTagProvider.ItemTagProvider {

    public CAPITagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(CAPIItemTags.NETHERITE_ARMOR_HELMET)
                .add(Items.NETHERITE_HELMET);

        getOrCreateTagBuilder(CAPIItemTags.NETHERITE_ARMOR_CHESTPLATE)
                .add(Items.NETHERITE_CHESTPLATE);
        
        getOrCreateTagBuilder(CAPIItemTags.NETHERITE_ARMOR_LEGGINGS)
                .add(Items.NETHERITE_LEGGINGS);

        getOrCreateTagBuilder(CAPIItemTags.NETHERITE_ARMOR_BOOTS)
                .add(Items.NETHERITE_BOOTS);

        getOrCreateTagBuilder(CAPIItemTags.IRON_ARMOR)
                .add(Items.IRON_HELMET)
                .add(Items.IRON_CHESTPLATE)
                .add(Items.IRON_LEGGINGS)
                .add(Items.IRON_BOOTS);

        getOrCreateTagBuilder(CAPIItemTags.DIAMOND_ARMOR)
                .add(Items.DIAMOND_HELMET)
                .add(Items.DIAMOND_CHESTPLATE)
                .add(Items.DIAMOND_LEGGINGS)
                .add(Items.DIAMOND_BOOTS);

        getOrCreateTagBuilder(CAPIItemTags.LEATHER_ARMOR_BOOTS)
                .add(Items.LEATHER_BOOTS);
    }
}
