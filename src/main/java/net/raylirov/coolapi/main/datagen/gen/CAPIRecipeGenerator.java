package net.raylirov.coolapi.main.datagen.gen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.content.CAPIItems;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CAPIRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public CAPIRecipeGenerator(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        upgradeCopying(consumer, CAPIItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get(), Items.LEATHER);
        upgradeCopying(consumer, CAPIItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get(), Items.SCUTE);
        upgradeCopying(consumer, CAPIItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get(), Items.GOLD_INGOT);
        upgradeCopying(consumer, CAPIItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get(), Items.AMETHYST_SHARD);
        upgradeCopying(consumer, CAPIItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get(), ItemTags.WOOL);

    }

    public static void upgradeCopying(@NotNull Consumer<FinishedRecipe> consumer, Item smithingTemplate, Item item) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, smithingTemplate, 2)
                .pattern("DTD")
                .pattern("DID")
                .pattern("DDD")
                .define('T', smithingTemplate)
                .define('D', Items.DIAMOND)
                .define('I', item)
                .unlockedBy(getHasName(smithingTemplate), has(smithingTemplate))
                .save(consumer);
    }

    public static void upgradeCopying(@NotNull Consumer<FinishedRecipe> consumer, Item smithingTemplate, TagKey<Item> item) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, smithingTemplate, 2)
                .pattern("DTD")
                .pattern("DID")
                .pattern("DDD")
                .define('T', smithingTemplate)
                .define('D', Items.DIAMOND)
                .define('I', item)
                .unlockedBy(getHasName(smithingTemplate), has(smithingTemplate))
                .save(consumer);
    }

    public static void netheriteSmithing(@NotNull Consumer<FinishedRecipe> consumer, @NotNull Item ingredientItem, @NotNull RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.of(ingredientItem),
                Ingredient.of(Items.NETHERITE_INGOT), category, result)
                .unlocks("has_netherite_ingot",
                        has(Items.NETHERITE_INGOT))
                .save(consumer,
                        new ResourceLocation(CoolApi.MOD_ID, "smithing/netherite/" + getItemName(result) + "_smithing"));
    }

    public static void leatherSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAPIItems.LEATHER_UPGRADE_SMITHING_TEMPLATE.get()),
                Ingredient.of(ingredientItem),
                Ingredient.of(Items.LEATHER), RecipeCategory.COMBAT, result)
                .unlocks("has_leather",
                        has(Items.LEATHER))
                .save(consumer,
                        new ResourceLocation(CoolApi.MOD_ID, "smithing/leathered/" + getItemName(result) + "_smithing"));
    }

    public static void turtleSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAPIItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.SCUTE), RecipeCategory.COMBAT, result)
                .unlocks("has_scute",
                        has(Items.SCUTE))
                .save(consumer,
                        new ResourceLocation(CoolApi.MOD_ID, "smithing/turtle/" + getItemName(result) + "_smithing"));
    }

    public static void turtleHelmetSmithing(Consumer<FinishedRecipe> consumer, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAPIItems.TURTLE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.NETHERITE_HELMET),
                        Ingredient.of(Items.TURTLE_HELMET), RecipeCategory.COMBAT, result)
                .unlocks("has_scute",
                        has(Items.TURTLE_HELMET))
                .save(consumer,
                        new ResourceLocation(CoolApi.MOD_ID, "smithing/turtle/" + getItemName(result) + "_smithing"));
    }

    public static void gildedSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAPIItems.GILDED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, result)
                .unlocks("has_gold",
                        has(Items.GOLD_INGOT))
                .save(consumer,
                        new ResourceLocation(CoolApi.MOD_ID, "smithing/gilded/" + getItemName(result) + "_smithing"));
    }

    public static void wooledSmithing(Consumer<FinishedRecipe> consumer, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAPIItems.WOOLED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(Items.IRON_BOOTS),
                        Ingredient.of(ItemTags.WOOL), RecipeCategory.COMBAT, result)
                .unlocks("has_wool",
                        has(ItemTags.WOOL))
                .save(consumer,
                        new ResourceLocation(CoolApi.MOD_ID, "smithing/wooled/" + getItemName(result) + "_smithing"));
    }

    public static void tintedSmithing(Consumer<FinishedRecipe> consumer, Item ingredientItem, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(CAPIItems.TINTED_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(ingredientItem),
                        Ingredient.of(Items.AMETHYST_SHARD), RecipeCategory.COMBAT, result)
                .unlocks("has_amethyst_shard",
                        has(Items.AMETHYST_SHARD))
                .save(consumer,
                        new ResourceLocation(CoolApi.MOD_ID, "smithing/tinted/" + getItemName(result) + "_smithing"));
    }

}
