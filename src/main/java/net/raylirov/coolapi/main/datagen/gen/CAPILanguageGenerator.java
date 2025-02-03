package net.raylirov.coolapi.main.datagen.gen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.main.datagen.prov.CAPITranslationKeyProvider;

import java.util.HashMap;
import java.util.Map;

public class CAPILanguageGenerator extends LanguageProvider {

    private final String lang;
    private final Map<String, String> keyMap = new HashMap<>();

    public CAPILanguageGenerator(PackOutput output, String locale) {
        super(output, CoolApi.MOD_ID, locale);
        this.lang = locale;
    }

    @Override
    protected void addTranslations() {
        this.gatherKeyMapData();
        keyMap.forEach(this::add);
    }

    private void gatherKeyMapData(){
        if (lang.equals("en_us")) {
            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("leather_upgrade"), "Leather Upgrade");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Add Leather");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "All armor, except leather");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Add any armor, except leather");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Leather");

            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("turtle_upgrade"), "Turtle Upgrade");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Add scute or turtle shell");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Netherite armor");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Scute, turtle shell");

            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("gilded_upgrade"), "Gilded Upgrade");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Add Gold Ingot");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Netherite armor");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Gold Ingot");

            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("wooled_upgrade"), "Wooled Upgrade");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Add Wool");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Iron boots");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Add Iron boots");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Wool");

            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("tinted_upgrade"), "Tinted Upgrade");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Add amethyst shard");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Any helmet");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Add helmet");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Amethyst shard");
        }

        if (lang.equals("ru_ru")) {
            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("leather_upgrade"), "Кожаное улучшение");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Поместите кожу");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "Любой броне, кроме кожаной");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Поместите любую броню, кроме кожаной");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Кожа");

            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("turtle_upgrade"), "Черепашье улучшение");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Поместите щиток или черепаший панцирь");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Щиток, черепаший панцирь");

            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("gilded_upgrade"), "Золочёное улучшение");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Поместите золотой слиток");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Золотой слиток");

            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("wooled_upgrade"), "Шерстяное улучшение");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Поместите шерсть");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Железным ботинкам");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Поместите железные ботинки");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Шерсть");

            keyMap.put(CAPITranslationKeyProvider.upgradeTranslationKeyFor("tinted_upgrade"), "Тонированое улучшение");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Поместите осколок аметиста");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Любому шлему");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Поместите шлем");
            keyMap.put(CAPITranslationKeyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Осколок аметиста");
        }
    }
}