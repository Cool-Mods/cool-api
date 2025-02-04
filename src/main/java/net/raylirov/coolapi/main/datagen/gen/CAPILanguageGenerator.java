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
        CAPITranslationKeyProvider keyProvider = new CAPITranslationKeyProvider(CoolApi.MOD_ID);
        
        if (lang.equals("en_us")) {
            keyMap.put(keyProvider.upgradeTranslationKeyFor("leather_upgrade"), "Leather Upgrade");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Add Leather");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "All armor, except leather");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Add any armor, except leather");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Leather");

            keyMap.put(keyProvider.upgradeTranslationKeyFor("turtle_upgrade"), "Turtle Upgrade");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Add scute or turtle shell");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Netherite armor");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Scute, turtle shell");

            keyMap.put(keyProvider.upgradeTranslationKeyFor("gilded_upgrade"), "Gilded Upgrade");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Add Gold Ingot");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Netherite armor");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Add netherite armor");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Gold Ingot");

            keyMap.put(keyProvider.upgradeTranslationKeyFor("wooled_upgrade"), "Wooled Upgrade");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Add Wool");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Iron boots");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Add Iron boots");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Wool");

            keyMap.put(keyProvider.upgradeTranslationKeyFor("tinted_upgrade"), "Tinted Upgrade");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Add amethyst shard");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Any helmet");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Add helmet");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Amethyst shard");
        }

        if (lang.equals("ru_ru")) {
            keyMap.put(keyProvider.upgradeTranslationKeyFor("leather_upgrade"), "Кожаное улучшение");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.additions_slot_description"), "Поместите кожу");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.applies_to"), "Любой броне, кроме кожаной");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.base_slot_description"), "Поместите любую броню, кроме кожаной");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.leather_upgrade.ingredients"), "Кожа");

            keyMap.put(keyProvider.upgradeTranslationKeyFor("turtle_upgrade"), "Черепашье улучшение");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.additions_slot_description"), "Поместите щиток или черепаший панцирь");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.turtle_upgrade.ingredients"), "Щиток, черепаший панцирь");

            keyMap.put(keyProvider.upgradeTranslationKeyFor("gilded_upgrade"), "Золочёное улучшение");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.additions_slot_description"), "Поместите золотой слиток");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.applies_to"), "Незеритовой броне");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.base_slot_description"), "Поместите незеритовый доспех");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.gilded_upgrade.ingredients"), "Золотой слиток");

            keyMap.put(keyProvider.upgradeTranslationKeyFor("wooled_upgrade"), "Шерстяное улучшение");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.additions_slot_description"), "Поместите шерсть");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.applies_to"), "Железным ботинкам");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.base_slot_description"), "Поместите железные ботинки");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.wooled_upgrade.ingredients"), "Шерсть");

            keyMap.put(keyProvider.upgradeTranslationKeyFor("tinted_upgrade"), "Тонированое улучшение");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.additions_slot_description"), "Поместите осколок аметиста");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.applies_to"), "Любому шлему");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.base_slot_description"), "Поместите шлем");
            keyMap.put(keyProvider.itemTranslationKeyFor("smithing_template.tinted_upgrade.ingredients"), "Осколок аметиста");
        }
    }
}