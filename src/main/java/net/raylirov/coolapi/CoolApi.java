package net.raylirov.coolapi;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.raylirov.coolapi.content.CAPIItems;
import net.raylirov.coolapi.main.utils.loot.CAPILootModifiers;
import org.slf4j.Logger;

@Mod(CoolApi.MOD_ID)
public class CoolApi {
    public static final String MOD_ID = "coolapi";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CoolApi()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CAPIItems.register(eventBus);
        CAPILootModifiers.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
