package net.raylirov.coolapi.main.datagen.gen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.content.CAPITemplates;
import net.raylirov.coolapi.main.utils.loot.CAPIAddItemModifier;

public class CAPIGlobalLootModifiersGenerator extends GlobalLootModifierProvider {
    public CAPIGlobalLootModifiersGenerator(PackOutput output) {
        super(output, CoolApi.MOD_ID);
    }

    @Override
    protected void start() {
        add("leather_upgrade_smithing_template_from_igloo", new CAPIAddItemModifier(new LootItemCondition[] {
            new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build() },
                CAPITemplates.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()));

        add("turtle_upgrade_smithing_template_from_ruin", new CAPIAddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build() },
                CAPITemplates.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()));

        add("gilded_upgrade_smithing_template_from_bastion", new CAPIAddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build() },
                CAPITemplates.GILDED_UPGRADE_SMITHING_TEMPLATE.get()));

        add("tinted_upgrade_smithing_template_from_dragon", new CAPIAddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build() },
                CAPITemplates.TINTED_UPGRADE_SMITHING_TEMPLATE.get()));

        add("wooled_upgrade_smithing_template_from_warden", new CAPIAddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build() },
                CAPITemplates.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()));
    }
}
