package net.raylirov.coolapi.main.datagen.prov;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.raylirov.coolapi.content.CAPITemplates;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public abstract class CAPIRecipeProvider extends FabricRecipeProvider {

    protected static String modID;

    public CAPIRecipeProvider(FabricDataOutput output, String _modID) {
        super(output);
        modID = _modID;
    }

    protected static void upgradeCopying(Consumer<RecipeJsonProvider> consumer, Item smithingTemplate, Item item) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, smithingTemplate, 2)
                .pattern("DTD")
                .pattern("DID")
                .pattern("DDD")
                .input('T', smithingTemplate)
                .input('D', Items.DIAMOND)
                .input('I', item)
                .criterion(FabricRecipeProvider.hasItem(smithingTemplate), FabricRecipeProvider.conditionsFromItem(smithingTemplate))
                .offerTo(consumer);
    }

    protected static void upgradeCopying(Consumer<RecipeJsonProvider> consumer, Item smithingTemplate, TagKey<Item> tag) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, smithingTemplate, 2)
                .pattern("DTD")
                .pattern("DID")
                .pattern("DDD")
                .input('T', smithingTemplate)
                .input('D', Items.DIAMOND)
                .input('I', tag)
                .criterion(FabricRecipeProvider.hasItem(smithingTemplate), FabricRecipeProvider.conditionsFromItem(smithingTemplate))
                .offerTo(consumer);
    }

    protected static void netheriteSmithing(@NotNull Consumer<RecipeJsonProvider> consumer, @NotNull Item ingredientItem, @NotNull RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ingredientItem),
                        Ingredient.ofItems(Items.NETHERITE_INGOT), category, result)
                .criterion("has_netherite_ingot", conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(consumer, new Identifier(modID, "smithing/netherite/" + getItemPath(result) + "_smithing"));
    }

    protected static void leatherSmithing(@NotNull Consumer<RecipeJsonProvider> consumer, @NotNull Item ingredientItem, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(CAPITemplates.LEATHER_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ingredientItem),
                        Ingredient.ofItems(Items.LEATHER), RecipeCategory.COMBAT, result)
                .criterion("has_leather", conditionsFromItem(Items.LEATHER))
                .offerTo(consumer, new Identifier(modID, "smithing/leathered/" + getItemPath(result) + "_smithing"));
    }

    protected static void turtleSmithing(@NotNull Consumer<RecipeJsonProvider> consumer, @NotNull Item ingredientItem, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(CAPITemplates.TURTLE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ingredientItem),
                        Ingredient.ofItems(Items.SCUTE), RecipeCategory.COMBAT, result)
                .criterion("has_scute", conditionsFromItem(Items.SCUTE))
                .offerTo(consumer, new Identifier(modID, "smithing/turtle/" + getItemPath(result) + "_smithing"));
    }

    protected static void turtleHelmetSmithing(@NotNull Consumer<RecipeJsonProvider> consumer, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(CAPITemplates.TURTLE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_HELMET),
                        Ingredient.ofItems(Items.TURTLE_HELMET), RecipeCategory.COMBAT, result)
                .criterion("has_scute", conditionsFromItem(Items.TURTLE_HELMET))
                .offerTo(consumer, new Identifier(modID, "smithing/turtle/" + getItemPath(result) + "_smithing"));
    }

    protected static void gildedSmithing(@NotNull Consumer<RecipeJsonProvider> consumer, @NotNull Item ingredientItem, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(CAPITemplates.GILDED_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ingredientItem),
                        Ingredient.ofItems(Items.GOLD_INGOT), RecipeCategory.COMBAT, result)
                .criterion("has_gold", conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(consumer, new Identifier(modID, "smithing/gilded/" + getItemPath(result) + "_smithing"));
    }

    protected static void wooledSmithing(@NotNull Consumer<RecipeJsonProvider> consumer, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(CAPITemplates.WOOLED_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(Items.IRON_BOOTS),
                        Ingredient.fromTag(ItemTags.WOOL), RecipeCategory.COMBAT, result)
                .criterion("has_wool", conditionsFromTag(ItemTags.WOOL))
                .offerTo(consumer, new Identifier(modID, "smithing/wooled/" + getItemPath(result) + "_smithing"));
    }

    protected static void tintedSmithing(@NotNull Consumer<RecipeJsonProvider> consumer, @NotNull Item ingredientItem, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(CAPITemplates.TINTED_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.ofItems(ingredientItem),
                        Ingredient.ofItems(Items.AMETHYST_SHARD), RecipeCategory.COMBAT, result)
                .criterion("has_amethyst_shard", conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(consumer, new Identifier(modID, "smithing/tinted/" + getItemPath(result) + "_smithing"));
    }
}
