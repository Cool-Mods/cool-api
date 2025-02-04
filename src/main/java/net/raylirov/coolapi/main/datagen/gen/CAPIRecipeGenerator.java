package net.raylirov.coolapi.main.datagen.gen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.content.CAPITemplates;
import net.raylirov.coolapi.main.datagen.prov.CAPIRecipeProvider;

import java.util.function.Consumer;

public class CAPIRecipeGenerator extends CAPIRecipeProvider {
    public CAPIRecipeGenerator(FabricDataOutput output) {
        super(output, CoolApi.MOD_ID);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        upgradeCopying(consumer, CAPITemplates.LEATHER_UPGRADE_SMITHING_TEMPLATE, Items.LEATHER);
        upgradeCopying(consumer, CAPITemplates.TURTLE_UPGRADE_SMITHING_TEMPLATE, Items.SCUTE);
        upgradeCopying(consumer, CAPITemplates.GILDED_UPGRADE_SMITHING_TEMPLATE, Items.GOLD_INGOT);
        upgradeCopying(consumer, CAPITemplates.TINTED_UPGRADE_SMITHING_TEMPLATE, Items.AMETHYST_SHARD);
        upgradeCopying(consumer, CAPITemplates.WOOLED_UPGRADE_SMITHING_TEMPLATE, ItemTags.WOOL);
    }
}
