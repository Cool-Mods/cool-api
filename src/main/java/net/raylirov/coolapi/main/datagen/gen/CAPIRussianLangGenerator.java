package net.raylirov.coolapi.main.datagen.gen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.main.datagen.prov.CAPITranslationKeyProvider;

public class CAPIRussianLangGenerator extends FabricLanguageProvider {
    public CAPIRussianLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "ru_ru");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        CAPITranslationKeyProvider keyProvider = new CAPITranslationKeyProvider(CoolApi.MOD_ID);

        translationBuilder.add(keyProvider.upgrTranslationKeyFor("leather_upgrade"), "Кожаное улучшение");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Поместите кожу");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "Любой броне, кроме кожаной");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Поместите любую броню, кроме кожаной");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Кожа");

        translationBuilder.add(keyProvider.upgrTranslationKeyFor("turtle_upgrade"), "Черепашье улучшение");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Поместите щиток или черепаший панцирь");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Незеритовой броне");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Поместите незеритовый доспех");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Щиток, черепаший панцирь");

        translationBuilder.add(keyProvider.upgrTranslationKeyFor("gilded_upgrade"), "Золочёное улучшение");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Поместите золотой слиток");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Незеритовой броне");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Поместите незеритовый доспех");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Золотой слиток");

        translationBuilder.add(keyProvider.upgrTranslationKeyFor("wooled_upgrade"), "Шерстяное улучшение");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Поместите шерсть");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Железным ботинкам");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Поместите железные ботинки");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Шерсть");

        translationBuilder.add(keyProvider.upgrTranslationKeyFor("tinted_upgrade"), "Тонированое улучшение");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Поместите осколок аметиста");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Любому шлему");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Поместите шлем");
        translationBuilder.add(keyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Осколок аметиста");
    }
}
