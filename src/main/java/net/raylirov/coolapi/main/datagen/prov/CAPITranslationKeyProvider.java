package net.raylirov.coolapi.main.datagen.prov;

import net.raylirov.coolapi.CoolApi;

public abstract class CAPITranslationKeyProvider {

    //ITEMS
    public static String itemTranslationKeyFor(String name) {
        String key = CAPITranslationKeyTypeProvider.ITEM + "." + CoolApi.MOD_ID + "." + name;
        return key.toLowerCase();
    }
    //ITEMS

    //ADVANCEMENT
    public static String advancementsTranslationKeyFor(CAPITranslationKeyTypeProvider.TranslationKeySubType subType, String name) {
        String key = CoolApi.MOD_ID + "." + CAPITranslationKeyTypeProvider.ADVANCEMENT + "." + (subType != null ? subType + "." : "") + name;
        return key.toLowerCase();
    }

    //ADVANCEMENT

    //CREATIVE_TAB
    public static String tabTranslationKeyFor(String name) {
        String key = CAPITranslationKeyTypeProvider.CREATIVETAB + "." + name;
        return key.toLowerCase();
    }
    //CREATIVE_TAB

    //UPGRADE
    public static String upgradeTranslationKeyFor(String name) {
        String key = CAPITranslationKeyTypeProvider.UPGRADE + "." + CoolApi.MOD_ID + "." + name;
        return key.toLowerCase();
    }
    //UPGRADE
}
