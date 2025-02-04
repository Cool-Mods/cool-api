package net.raylirov.coolapi.main.datagen.gen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.main.datagen.prov.CAPITranslationKeyProvider;

public class CAPIEnglishLangGenerator extends FabricLanguageProvider {
    public CAPIEnglishLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        CAPITranslationKeyProvider keyProvider = new CAPITranslationKeyProvider(CoolApi.MOD_ID);
        
        translationBuilder.add(keyProvider.upgrTranslationKeyFor("leather_upgrade"), "Leather Upgrade");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Add Leather");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "All armor, except leather");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Add any armor, except leather");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Leather");
        
        translationBuilder.add(keyProvider.upgrTranslationKeyFor("turtle_upgrade"), "Turtle Upgrade");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Add scute or turtle shell");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Netherite armor");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Add netherite armor");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Scute, turtle shell");
        
        translationBuilder.add(keyProvider.upgrTranslationKeyFor("gilded_upgrade"), "Gilded Upgrade");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Add Gold Ingot");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Netherite armor");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Add netherite armor");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Gold Ingot");
        
        translationBuilder.add(keyProvider.upgrTranslationKeyFor("wooled_upgrade"), "Wooled Upgrade");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Add Wool");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Iron boots");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Add Iron boots");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Wool");
        
        translationBuilder.add(keyProvider.upgrTranslationKeyFor("tinted_upgrade"), "Tinted Upgrade");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Add amethyst shard");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Any helmet");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Add helmet");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Amethyst shard");
    }
}
