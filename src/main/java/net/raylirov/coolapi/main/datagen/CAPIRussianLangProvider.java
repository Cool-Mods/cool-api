package net.raylirov.coolapi.main.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.raylirov.coolapi.main.datagen.lang.CAPITranslationKeyProvider;

public class CAPIRussianLangProvider extends FabricLanguageProvider {
    public CAPIRussianLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "ru_ru");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("leather_upgrade"), "Кожаное улучшение");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Поместите кожу");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "Любой броне, кроме кожаной");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Поместите любую броню, кроме кожаной");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Кожа");

        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("turtle_upgrade"), "Черепашье улучшение");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Поместите щиток или черепаший панцирь");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Незеритовой броне");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Поместите незеритовый доспех");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Щиток, черепаший панцирь");

        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("gilded_upgrade"), "Золочёное улучшение");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Поместите золотой слиток");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Незеритовой броне");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Поместите незеритовый доспех");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Золотой слиток");

        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("wooled_upgrade"), "Шерстяное улучшение");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Поместите шерсть");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Железным ботинкам");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Поместите железные ботинки");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Шерсть");

        translationBuilder.add(CAPITranslationKeyProvider.upgrTranslationKeyFor("tinted_upgrade"), "Тонированое улучшение");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Поместите осколок аметиста");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Любому шлему");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Поместите шлем");
        translationBuilder.add(CAPITranslationKeyProvider.itmTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Осколок аметиста");
    }
}
