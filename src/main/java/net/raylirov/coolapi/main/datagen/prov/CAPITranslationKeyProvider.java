package net.raylirov.coolapi.main.datagen.prov;

public class CAPITranslationKeyProvider {

    protected final String modID;

    public CAPITranslationKeyProvider(String _modID) {
        modID = _modID;
    }

    //ITEMS
    public String itmTranslationKeyFor(String name) {
        String key = CAPITranslationKeyTypeProvider.ITEM + "." + modID + "." + name;
        return key.toLowerCase();
    }
    //ITEMS

    //ADVANCEMENT
    public String advtranslationKeyFor(String name, CAPITranslationKeyTypeProvider.TranslationKeySubType subType) {
        String key = modID + "." + CAPITranslationKeyTypeProvider.ADVANCEMENT + "." + (subType != null ? subType + "." : "") + name;
        return key.toLowerCase();
    }
    //ADVANCEMENT

    //CREATIVE_TAB
    public String tabTranslationKeyFor(String name) {
        String key = CAPITranslationKeyTypeProvider.CREATIVETAB + "." + name;
        return key.toLowerCase();
    }
    //CREATIVE_TAB

    //UPGRADE
    public String upgrTranslationKeyFor(String name) {
        String key = CAPITranslationKeyTypeProvider.UPGRADE + "." + modID + "." + name;
        return key.toLowerCase();
    }
    //UPGRADE
}
