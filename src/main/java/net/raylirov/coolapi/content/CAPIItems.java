package net.raylirov.coolapi.content;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.main.utils.CAPIHelper;

public class CAPIItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoolApi.MOD_ID);

    public static final RegistryObject<Item> LEATHER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("leather_upgrade_smithing_template",
            () -> new SmithingTemplateItem(CAPIHelper.LEATHER_UPGRADE_APPLIES_TO,
                    CAPIHelper.LEATHER_UPGRADE_INGREDIENTS,
                    CAPIHelper.LEATHER_UPGRADE,
                    CAPIHelper.LEATHER_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.LEATHER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeFullArmorIconList,
                    CAPIHelper.createLeatherUpgradeMaterialList));

    public static final RegistryObject<Item> TURTLE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("turtle_upgrade_smithing_template",
            () -> new SmithingTemplateItem(CAPIHelper.TURTLE_UPGRADE_APPLIES_TO,
                    CAPIHelper.TURTLE_UPGRADE_INGREDIENTS,
                    CAPIHelper.TURTLE_UPGRADE,
                    CAPIHelper.TURTLE_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.TURTLE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeFullArmorIconList,
                    CAPIHelper.createTurtleUpgradeMaterialList));

    public static final RegistryObject<Item> GILDED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("gilded_upgrade_smithing_template",
            () -> new SmithingTemplateItem(CAPIHelper.GILDED_UPGRADE_APPLIES_TO,
                    CAPIHelper.GILDED_UPGRADE_INGREDIENTS,
                    CAPIHelper.GILDED_UPGRADE,
                    CAPIHelper.GILDED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.GILDED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeFullArmorIconList,
                    CAPIHelper.createIngotUpgradeMaterialList));

    public static final RegistryObject<Item> WOOLED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("wooled_upgrade_smithing_template",
            () -> new SmithingTemplateItem(CAPIHelper.WOOLED_UPGRADE_APPLIES_TO,
                    CAPIHelper.WOOLED_UPGRADE_INGREDIENTS,
                    CAPIHelper.WOOLED_UPGRADE,
                    CAPIHelper.WOOLED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.WOOLED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeBootsIconList,
                    CAPIHelper.createBlockUpgradeMaterialList));

    public static final RegistryObject<Item> TINTED_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("tinted_upgrade_smithing_template",
            () -> new SmithingTemplateItem(CAPIHelper.TINTED_UPGRADE_APPLIES_TO,
                    CAPIHelper.TINTED_UPGRADE_INGREDIENTS,
                    CAPIHelper.TINTED_UPGRADE,
                    CAPIHelper.TINTED_UPGRADE_BASE_SLOT_DESCRIPTION,
                    CAPIHelper.TINTED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                    CAPIHelper.createUpgradeHelmetIconList,
                    CAPIHelper.createAmethystUpgradeMaterialList));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
