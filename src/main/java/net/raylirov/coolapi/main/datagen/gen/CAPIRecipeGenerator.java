package net.raylirov.coolapi.main.datagen.gen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.content.CAPITemplates;
import net.raylirov.coolapi.main.datagen.prov.CAPIRecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CAPIRecipeGenerator extends CAPIRecipeProvider {
    public CAPIRecipeGenerator(PackOutput output) {
        super(output, CoolApi.MOD_ID);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        upgradeCopying(consumer, CAPITemplates.LEATHER_UPGRADE_SMITHING_TEMPLATE.get(), Items.LEATHER);
        upgradeCopying(consumer, CAPITemplates.TURTLE_UPGRADE_SMITHING_TEMPLATE.get(), Items.SCUTE);
        upgradeCopying(consumer, CAPITemplates.GILDED_UPGRADE_SMITHING_TEMPLATE.get(), Items.GOLD_INGOT);
        upgradeCopying(consumer, CAPITemplates.TINTED_UPGRADE_SMITHING_TEMPLATE.get(), Items.AMETHYST_SHARD);
        upgradeCopying(consumer, CAPITemplates.WOOLED_UPGRADE_SMITHING_TEMPLATE.get(), ItemTags.WOOL);
    }
}
