package net.raylirov.coolapi.main.datagen.gen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.content.CAPITemplates;
import net.raylirov.coolapi.main.datagen.prov.CAPIItemModelProvider;

public class CAPIItemModelGenerator extends CAPIItemModelProvider {

    public CAPIItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CoolApi.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(CAPITemplates.TINTED_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAPITemplates.WOOLED_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAPITemplates.LEATHER_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAPITemplates.TURTLE_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAPITemplates.GILDED_UPGRADE_SMITHING_TEMPLATE);
    }
}
