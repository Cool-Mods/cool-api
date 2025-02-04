package net.raylirov.coolapi.main.datagen.prov;

public enum CAPITranslationKeyTypeProvider {
    ADVANCEMENT,
    ITEM,
    CREATIVETAB,
    UPGRADE;

    public interface TranslationKeySubType{}

    public enum AdvancementKeySubType implements TranslationKeySubType{
        TITLE,
        DESCRIPTION
    }
}