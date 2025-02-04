package net.raylirov.coolapi.content;

import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.main.utils.*;

public class CAPITemplates {

    public static final Item LEATHER_UPGRADE_SMITHING_TEMPLATE = registerTemplateItem("leather_upgrade_smithing_template",
            new SmithingTemplateItem(CAPIHelper.LEATHER_UPGRADE_APPLIES_TO,
                    CAPIHelper.LEATHER_UPGRADE_INGREDIENTS,
                    CAPIHelper.LEATHER_UPGRADE,
                    CAPIHelper.LEATHER_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.LEATHER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeFullArmorIconList,
                    CAPIHelper.createLeatherUpgradeMaterialList));

    public static final Item TURTLE_UPGRADE_SMITHING_TEMPLATE = registerTemplateItem("turtle_upgrade_smithing_template",
            new SmithingTemplateItem(CAPIHelper.TURTLE_UPGRADE_APPLIES_TO,
                    CAPIHelper.TURTLE_UPGRADE_INGREDIENTS,
                    CAPIHelper.TURTLE_UPGRADE,
                    CAPIHelper.TURTLE_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.TURTLE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeFullArmorIconList,
                    CAPIHelper.createTurtleUpgradeMaterialList));

    public static final Item GILDED_UPGRADE_SMITHING_TEMPLATE = registerTemplateItem("gilded_upgrade_smithing_template",
            new SmithingTemplateItem(CAPIHelper.GILDED_UPGRADE_APPLIES_TO,
                    CAPIHelper.GILDED_UPGRADE_INGREDIENTS,
                    CAPIHelper.GILDED_UPGRADE,
                    CAPIHelper.GILDED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeFullArmorIconList,
                    CAPIHelper.createIngotUpgradeMaterialList));

    public static final Item WOOLED_UPGRADE_SMITHING_TEMPLATE = registerTemplateItem("wooled_upgrade_smithing_template",
            new SmithingTemplateItem(CAPIHelper.WOOLED_UPGRADE_APPLIES_TO,
                    CAPIHelper.WOOLED_UPGRADE_INGREDIENTS,
                    CAPIHelper.WOOLED_UPGRADE,
                    CAPIHelper.WOOLED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.WOOLED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeBootsIconList,
                    CAPIHelper.createBlockUpgradeMaterialList));

    public static final Item TINTED_UPGRADE_SMITHING_TEMPLATE = registerTemplateItem("tinted_upgrade_smithing_template",
            new SmithingTemplateItem(CAPIHelper.TINTED_UPGRADE_APPLIES_TO,
                    CAPIHelper.TINTED_UPGRADE_INGREDIENTS,
                    CAPIHelper.TINTED_UPGRADE,
                    CAPIHelper.TINTED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.TINTED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeHelmetIconList,
                    CAPIHelper.createAmethystUpgradeMaterialList));

    public static Item registerTemplateItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CoolApi.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoolApi.LOGGER.info("Registering Mod Items for " + CoolApi.MOD_ID);
    }
}
