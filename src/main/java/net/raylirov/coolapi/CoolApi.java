package net.raylirov.coolapi;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.raylirov.coolapi.content.CAPITemplates;
import net.raylirov.coolapi.main.utils.CAPILootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolApi implements ModInitializer {
	public static final String MOD_ID = "coolapi";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isModLoaded("coolarmor") || FabricLoader.getInstance().isModLoaded("coolarmorexperiments")) {
			CAPITemplates.registerModItems();
			CAPILootTableModifiers.modifyLootTables();
		}
	}
}