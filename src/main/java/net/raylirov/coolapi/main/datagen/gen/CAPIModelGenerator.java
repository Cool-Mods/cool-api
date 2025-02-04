package net.raylirov.coolapi.main.datagen.gen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.client.*;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.content.CAPITemplates;
import net.raylirov.coolapi.main.datagen.prov.CAPIModelProvider;

public class CAPIModelGenerator extends CAPIModelProvider {

    public CAPIModelGenerator(FabricDataOutput output) {
        super(output, CoolApi.MOD_ID);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        simpleItem(CAPITemplates.GILDED_UPGRADE_SMITHING_TEMPLATE, itemModelGenerator.writer);
        simpleItem(CAPITemplates.TURTLE_UPGRADE_SMITHING_TEMPLATE, itemModelGenerator.writer);
        simpleItem(CAPITemplates.LEATHER_UPGRADE_SMITHING_TEMPLATE, itemModelGenerator.writer);
        simpleItem(CAPITemplates.TINTED_UPGRADE_SMITHING_TEMPLATE, itemModelGenerator.writer);
        simpleItem(CAPITemplates.WOOLED_UPGRADE_SMITHING_TEMPLATE, itemModelGenerator.writer);
    }
}
