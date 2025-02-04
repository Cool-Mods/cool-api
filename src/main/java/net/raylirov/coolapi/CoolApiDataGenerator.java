package net.raylirov.coolapi;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.raylirov.coolapi.main.datagen.*;
import net.raylirov.coolapi.main.datagen.gen.CAPIEnglishLangGenerator;
import net.raylirov.coolapi.main.datagen.gen.CAPIModelGenerator;
import net.raylirov.coolapi.main.datagen.gen.CAPIRecipeGenerator;
import net.raylirov.coolapi.main.datagen.gen.CAPIRussianLangGenerator;

public class CoolApiDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(CAPITagGenerator::new);
		pack.addProvider(CAPIModelGenerator::new);
		pack.addProvider(CAPIEnglishLangGenerator::new);
		pack.addProvider(CAPIRussianLangGenerator::new);
		pack.addProvider(CAPIRecipeGenerator::new);
	}
}
