package net.raylirov.coolapi.main.datagen.lang;

import net.raylirov.coolapi.CoolApi;

public abstract class CAPITranslationKeyProvider {

    //ITEMS
    public static String itmTranslationKeyFor(String name) {
        String key = CAPITranslationKeyTypeProvider.ITEM + "." + CoolApi.MOD_ID + "." + name;
        return key.toLowerCase();
    }
    //ITEMS

    //ADVANCEMENT
    public static String advtranslationKeyFor(String name, CAPITranslationKeyTypeProvider.TranslationKeySubType subType) {
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
    public static String upgrTranslationKeyFor(String name) {
        String key = CAPITranslationKeyTypeProvider.UPGRADE + "." + CoolApi.MOD_ID + "." + name;
        return key.toLowerCase();
    }
    //UPGRADE
}
