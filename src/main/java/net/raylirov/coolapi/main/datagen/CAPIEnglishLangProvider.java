package net.raylirov.coolapi.main.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.raylirov.coolapi.main.datagen.lang.CAPITranslationKeyProvider;

public class CAPIEnglishLangProvider extends FabricLanguageProvider {
    public CAPIEnglishLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        
        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("leather_upgrade"), "Leather Upgrade");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Add Leather");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "All armor, except leather");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Add any armor, except leather");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Leather");
        
        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("turtle_upgrade"), "Turtle Upgrade");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Add scute or turtle shell");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Netherite armor");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Add netherite armor");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Scute, turtle shell");
        
        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("gilded_upgrade"), "Gilded Upgrade");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Add Gold Ingot");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Netherite armor");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Add netherite armor");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Gold Ingot");
        
        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("wooled_upgrade"), "Wooled Upgrade");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Add Wool");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Iron boots");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Add Iron boots");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Wool");
        
        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("tinted_upgrade"), "Tinted Upgrade");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Add amethyst shard");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Any helmet");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Add helmet");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Amethyst shard");
    }
}
