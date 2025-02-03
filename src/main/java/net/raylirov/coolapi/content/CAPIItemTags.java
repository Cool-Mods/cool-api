package net.raylirov.coolapi.content;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.raylirov.coolapi.CoolApi;

public class CAPIItemTags {
    public static final TagKey<Item> NETHERITE_ARMOR_HELMET = CAPIItemTags.of("netherite_armor_helmet");
    public static final TagKey<Item> NETHERITE_ARMOR_CHESTPLATE = CAPIItemTags.of("netherite_armor_chestplate");
    public static final TagKey<Item> NETHERITE_ARMOR_LEGGINGS = CAPIItemTags.of("netherite_armor_leggings");
    public static final TagKey<Item> NETHERITE_ARMOR_BOOTS = CAPIItemTags.of("netherite_armor_boots");
    public static final TagKey<Item> IRON_ARMOR = CAPIItemTags.of("iron_armor");
    public static final TagKey<Item> DIAMOND_ARMOR = CAPIItemTags.of("diamond_armor");

    public static final TagKey<Item> LEATHER_ARMOR_BOOTS = CAPIItemTags.of("leather_armor_boots");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(CoolApi.MOD_ID, id));
    }
}
