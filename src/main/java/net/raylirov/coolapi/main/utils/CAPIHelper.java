package net.raylirov.coolapi.main.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.raylirov.coolapi.CoolApi;

import java.util.List;

public class CAPIHelper {

    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;

    public static final Component LEATHER_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.leather_upgrade.base_slot_description");
    public static final Component TURTLE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.turtle_upgrade.base_slot_description");
    public static final Component GILDED_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.gilded_upgrade.base_slot_description");
    public static final Component WOOLED_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.wooled_upgrade.base_slot_description");
    public static final Component TINTED_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.tinted_upgrade.base_slot_description");

    public static final Component LEATHER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.leather_upgrade.additions_slot_description");
    public static final Component TURTLE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.turtle_upgrade.additions_slot_description");
    public static final Component GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.gilded_upgrade.additions_slot_description");
    public static final Component WOOLED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.wooled_upgrade.additions_slot_description");
    public static final Component TINTED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.tinted_upgrade.additions_slot_description");

    public static final Component LEATHER_UPGRADE = Component.translatable("upgrade." + CoolApi.MOD_ID + ".leather_upgrade").withStyle(TITLE_FORMAT);
    public static final Component TURTLE_UPGRADE = Component.translatable("upgrade." + CoolApi.MOD_ID + ".turtle_upgrade").withStyle(TITLE_FORMAT);
    public static final Component GILDED_UPGRADE = Component.translatable("upgrade." + CoolApi.MOD_ID + ".gilded_upgrade").withStyle(TITLE_FORMAT);
    public static final Component WOOLED_UPGRADE = Component.translatable("upgrade." + CoolApi.MOD_ID + ".wooled_upgrade").withStyle(TITLE_FORMAT);
    public static final Component TINTED_UPGRADE = Component.translatable("upgrade." + CoolApi.MOD_ID + ".tinted_upgrade").withStyle(TITLE_FORMAT);

    public static final Component LEATHER_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.leather_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    public static final Component TURTLE_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.turtle_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    public static final Component GILDED_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.gilded_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    public static final Component WOOLED_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.wooled_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);
    public static final Component TINTED_UPGRADE_APPLIES_TO = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.tinted_upgrade.applies_to").withStyle(DESCRIPTION_FORMAT);

    public static final Component LEATHER_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.leather_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
    public static final Component TURTLE_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.turtle_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
    public static final Component GILDED_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.gilded_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
    public static final Component WOOLED_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.wooled_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);
    public static final Component TINTED_UPGRADE_INGREDIENTS = Component.translatable("item." + CoolApi.MOD_ID + ".smithing_template.tinted_upgrade.ingredients").withStyle(DESCRIPTION_FORMAT);

    public static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    public static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    public static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    public static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");

    public static final ResourceLocation EMPTY_SLOT_LEATHER = new ResourceLocation(CoolApi.MOD_ID,"item/empty_slot_leather");
    public static final ResourceLocation EMPTY_SLOT_AMETHYST_SHARD = new ResourceLocation(CoolApi.MOD_ID, "item/empty_slot_amethyst_shard");
    public static final ResourceLocation EMPTY_SLOT_SCUTE = new ResourceLocation(CoolApi.MOD_ID, "item/empty_slot_scute");
    public static final ResourceLocation EMPTY_SLOT_BLOCK = new ResourceLocation(CoolApi.MOD_ID,"item/empty_slot_block");
    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");

    public static final List<ResourceLocation> createUpgradeFullArmorIconList = List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    public static final List<ResourceLocation> createUpgradeHelmetIconList = List.of(EMPTY_SLOT_HELMET);
    public static final List<ResourceLocation> createUpgradeBootsIconList = List.of(EMPTY_SLOT_BOOTS);
    public static final List<ResourceLocation> createLeatherUpgradeMaterialList = List.of(EMPTY_SLOT_LEATHER);
    public static final List<ResourceLocation> createIngotUpgradeMaterialList = List.of(EMPTY_SLOT_INGOT);
    public static final List<ResourceLocation> createTurtleUpgradeMaterialList = List.of(EMPTY_SLOT_SCUTE, EMPTY_SLOT_HELMET);
    public static final List<ResourceLocation> createBlockUpgradeMaterialList = List.of(EMPTY_SLOT_BLOCK);
    public static final List<ResourceLocation> createAmethystUpgradeMaterialList = List.of(EMPTY_SLOT_AMETHYST_SHARD);

    public static boolean trimArmor(ArmorItem armorItem, List<ArmorMaterial> firstList, ArmorMaterial material, List<ArmorMaterial> secondList) {
        return isOneOfArmor(armorItem, firstList) ||
                isNeededArmorPiece(armorItem, material) ||
                isOneOfArmor(armorItem, secondList);
    }

    public static boolean isNeededFullArmor(LivingEntity entity, ArmorMaterial material) {
        if (entity == null) return false;

        Iterable<ItemStack> iterable = entity.getArmorSlots();

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
            for (ArmorMaterial mat : materials) {
                if (material == mat) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNeededArmorPiece(Item item, ArmorMaterial material) {
        return item instanceof ArmorItem armor && armor.getMaterial() == material;
    }

}
