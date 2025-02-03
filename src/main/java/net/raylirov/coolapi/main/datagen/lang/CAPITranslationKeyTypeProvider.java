package net.raylirov.coolapi.main.datagen.lang;

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
