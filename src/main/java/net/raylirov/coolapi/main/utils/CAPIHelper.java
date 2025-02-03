package net.raylirov.coolapi.main.utils;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.raylirov.coolapi.CoolApi;

import java.util.List;

public class CAPIHelper {

    private static final Formatting DESCRIPTION_FORMAT = Formatting.BLUE;
    private static final Formatting TITLE_FORMAT = Formatting.GRAY;

    public static final Text LEATHER_UPGRADE_BASE_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.leather_upgrade.base_slot_description");
    public static final Text TURTLE_UPGRADE_BASE_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.turtle_upgrade.base_slot_description");
    public static final Text GILDED_UPGRADE_BASE_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.gilded_upgrade.base_slot_description");
    public static final Text WOOLED_UPGRADE_BASE_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.wooled_upgrade.base_slot_description");
    public static final Text TINTED_UPGRADE_BASE_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.tinted_upgrade.base_slot_description");

    public static final Text LEATHER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.leather_upgrade.additions_slot_description");
    public static final Text TURTLE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.turtle_upgrade.additions_slot_description");
    public static final Text GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.gilded_upgrade.additions_slot_description");
    public static final Text WOOLED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.wooled_upgrade.additions_slot_description");
    public static final Text TINTED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.tinted_upgrade.additions_slot_description");

    public static final Text LEATHER_UPGRADE = Text.translatable("upgrade." + CoolApi.MOD_ID + ".leather_upgrade").formatted(TITLE_FORMAT);
    public static final Text TURTLE_UPGRADE = Text.translatable("upgrade." + CoolApi.MOD_ID + ".turtle_upgrade").formatted(TITLE_FORMAT);
    public static final Text GILDED_UPGRADE = Text.translatable("upgrade." + CoolApi.MOD_ID + ".gilded_upgrade").formatted(TITLE_FORMAT);
    public static final Text WOOLED_UPGRADE = Text.translatable("upgrade." + CoolApi.MOD_ID + ".wooled_upgrade").formatted(TITLE_FORMAT);
    public static final Text TINTED_UPGRADE = Text.translatable("upgrade." + CoolApi.MOD_ID + ".tinted_upgrade").formatted(TITLE_FORMAT);

    public static final Text LEATHER_UPGRADE_APPLIES_TO = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.leather_upgrade.applies_to").formatted(DESCRIPTION_FORMAT);
    public static final Text TURTLE_UPGRADE_APPLIES_TO = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.turtle_upgrade.applies_to").formatted(DESCRIPTION_FORMAT);
    public static final Text GILDED_UPGRADE_APPLIES_TO = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.gilded_upgrade.applies_to").formatted(DESCRIPTION_FORMAT);
    public static final Text WOOLED_UPGRADE_APPLIES_TO = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.wooled_upgrade.applies_to").formatted(DESCRIPTION_FORMAT);
    public static final Text TINTED_UPGRADE_APPLIES_TO = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.tinted_upgrade.applies_to").formatted(DESCRIPTION_FORMAT);

    public static final Text LEATHER_UPGRADE_INGREDIENTS = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.leather_upgrade.ingredients").formatted(DESCRIPTION_FORMAT);
    public static final Text TURTLE_UPGRADE_INGREDIENTS = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.turtle_upgrade.ingredients").formatted(DESCRIPTION_FORMAT);
    public static final Text GILDED_UPGRADE_INGREDIENTS = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.gilded_upgrade.ingredients").formatted(DESCRIPTION_FORMAT);
    public static final Text WOOLED_UPGRADE_INGREDIENTS = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.wooled_upgrade.ingredients").formatted(DESCRIPTION_FORMAT);
    public static final Text TINTED_UPGRADE_INGREDIENTS = Text.translatable("item." + CoolApi.MOD_ID + ".smithing_template.tinted_upgrade.ingredients").formatted(DESCRIPTION_FORMAT);

    public static final Identifier EMPTY_SLOT_HELMET = new Identifier("item/empty_armor_slot_helmet");
    public static final Identifier EMPTY_SLOT_CHESTPLATE = new Identifier("item/empty_armor_slot_chestplate");
    public static final Identifier EMPTY_SLOT_LEGGINGS = new Identifier("item/empty_armor_slot_leggings");
    public static final Identifier EMPTY_SLOT_BOOTS = new Identifier("item/empty_armor_slot_boots");

    public static final Identifier EMPTY_SLOT_LEATHER = new Identifier(CoolApi.MOD_ID,"item/empty_slot_leather");
    public static final Identifier EMPTY_SLOT_AMETHYST_SHARD = new Identifier(CoolApi.MOD_ID, "item/empty_slot_amethyst_shard");
    public static final Identifier EMPTY_SLOT_SCUTE = new Identifier(CoolApi.MOD_ID, "item/empty_slot_scute");
    public static final Identifier EMPTY_SLOT_BLOCK = new Identifier(CoolApi.MOD_ID,"item/empty_slot_block");
    private static final Identifier EMPTY_SLOT_INGOT = new Identifier("item/empty_slot_ingot");

    public static final List<Identifier> createUpgradeFullArmorIconList = List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    public static final List<Identifier> createUpgradeHelmetIconList = List.of(EMPTY_SLOT_HELMET);
    public static final List<Identifier> createUpgradeBootsIconList = List.of(EMPTY_SLOT_BOOTS);
    public static final List<Identifier> createLeatherUpgradeMaterialList = List.of(EMPTY_SLOT_LEATHER);
    public static final List<Identifier> createIngotUpgradeMaterialList = List.of(EMPTY_SLOT_INGOT);
    public static final List<Identifier> createTurtleUpgradeMaterialList = List.of(EMPTY_SLOT_SCUTE, EMPTY_SLOT_HELMET);
    public static final List<Identifier> createBlockUpgradeMaterialList = List.of(EMPTY_SLOT_BLOCK);
    public static final List<Identifier> createAmethystUpgradeMaterialList = List.of(EMPTY_SLOT_AMETHYST_SHARD);

    public static boolean trimArmor(ArmorItem armorItem, List<ArmorMaterial> firstList, ArmorMaterial material, List<ArmorMaterial> secondList) {
        return isOneOfArmor(armorItem, firstList) ||
                isNeededArmorPiece(armorItem, material) ||
                isOneOfArmor(armorItem, secondList);
    }

    public static boolean isNeededFullArmor(LivingEntity entity, ArmorMaterial material) {
        if (entity == null) return false;

        Iterable<ItemStack> iterable = entity.getArmorItems();

        for (ItemStack itemStack : iterable) {
            Item item = itemStack.getItem();

            if (!(item instanceof ArmorItem armorItem) || armorItem.getMaterial() != material) {
                return false;
            }
        }

        return true;
    }

    public static boolean isOneOfArmor(Item item, List<ArmorMaterial> materials) {
        if (item instanceof ArmorItem armor) {
            ArmorMaterial material = armor.getMaterial();
            return materials.contains(material);
        }
        return false;
    }

    public static boolean isOneFromAllArmor(LivingEntity entity, List<ArmorMaterial> materials) {
        if (entity == null) return false;

        Iterable<ItemStack> iterable = entity.getArmorItems();

        for (ItemStack itemStack : iterable) {
            Item item = itemStack.getItem();

            if (item instanceof ArmorItem armor) {
                return materials.contains(armor.getMaterial());
            }
        }
        return false;
    }

    public static boolean isNeededArmorPiece(Item item, ArmorMaterial material) {
        return item instanceof ArmorItem armor && armor.getMaterial() == material;
    }
}
