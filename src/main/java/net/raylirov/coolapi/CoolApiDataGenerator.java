package net.raylirov.coolapi;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.raylirov.coolapi.main.datagen.*;

public class CoolApiDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(CAPITagGenerator::new);
		pack.addProvider(CAPIItemModelGenerator::new);
		pack.addProvider(CAPIEnglishLangProvider::new);
		pack.addProvider(CAPIRussianLangProvider::new);
		pack.addProvider(CAPIRecipeProvider::new);
	}
}
