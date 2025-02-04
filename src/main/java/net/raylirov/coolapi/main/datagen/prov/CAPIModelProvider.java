package net.raylirov.coolapi.main.datagen.prov;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.raylirov.coolapi.main.utils.CAPIHelper;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public abstract class CAPIModelProvider extends FabricModelProvider {
    
    public static final TextureKey LAYER3 = TextureKey.of("layer3");
    public static final Model GENERATED_FOUR_LAYERS = item("generated", TextureKey.LAYER0, TextureKey.LAYER1, TextureKey.LAYER2, LAYER3);
    protected final String modID;
    
    public CAPIModelProvider(FabricDataOutput output, String _modID) {
        super(output);
        modID = _modID;
    }
    
    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("minecraft", "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static final List<CAPIModelProvider.TrimMaterial> TRIM_MATERIALS = List.of(
            new CAPIModelProvider.TrimMaterial("quartz", 0.1F, Map.of()),
            new CAPIModelProvider.TrimMaterial("iron", 0.2F, Map.of(ArmorMaterials.IRON, "iron_darker")),
            new CAPIModelProvider.TrimMaterial("netherite", 0.3F, Map.of(ArmorMaterials.NETHERITE, "netherite_darker")),
            new CAPIModelProvider.TrimMaterial("redstone", 0.4F, Map.of()),
            new CAPIModelProvider.TrimMaterial("copper", 0.5F, Map.of()),
            new CAPIModelProvider.TrimMaterial("gold", 0.6F, Map.of(ArmorMaterials.GOLD, "gold_darker")),
            new CAPIModelProvider.TrimMaterial("emerald", 0.7F, Map.of()),
            new CAPIModelProvider.TrimMaterial("diamond", 0.8F, Map.of(ArmorMaterials.DIAMOND, "diamond_darker")),
            new CAPIModelProvider.TrimMaterial("lapis", 0.9F, Map.of()),
            new CAPIModelProvider.TrimMaterial("amethyst", 1.0F, Map.of())
    );

    record TrimMaterial(String name, float itemModelIndex, Map<ArmorMaterial, String> overrideArmorMaterials) {
        public String getAppliedName(ArmorMaterial armorMaterial) {
            return this.overrideArmorMaterials.getOrDefault(armorMaterial, this.name);
        }
    }

    protected void trimmedArmorItem(List<Item> items, List<ArmorMaterial> leatherList, ArmorMaterial leatherTintedMaterial, List<ArmorMaterial> tintedList, ArmorMaterial wooledMaterial, BiConsumer<Identifier, Supplier<JsonElement>> writer) {
        for (Item item : items)
        {
            if (item instanceof ArmorItem armorItem) {
                Identifier identifier = ModelIds.getItemModelId(armorItem);
                Identifier identifier2 = TextureMap.getId(armorItem);
                if (CAPIHelper.trimArmor(armorItem, leatherList, wooledMaterial, tintedList)) {
                    Identifier identifier3 = TextureMap.getSubId(armorItem, "_overlay");
                    Identifier identifierTintedHelmet = new Identifier(modID, "item/tinted_helmet_overlay");
                    if (CAPIHelper.isOneOfArmor(armorItem, leatherList)) {
                        if (CAPIHelper.isNeededArmorPiece(armorItem, leatherTintedMaterial)) {
                            Models.GENERATED_THREE_LAYERS
                                    .upload(identifier, TextureMap.layered(identifier2, identifier3, identifierTintedHelmet), writer, (id, textures) -> this.createArmorJson(id, textures, armorItem.getMaterial()));
                            for (CAPIModelProvider.TrimMaterial trimMaterial : TRIM_MATERIALS) {
                                String string = trimMaterial.getAppliedName(armorItem.getMaterial());
                                Identifier identifier4 = this.suffixTrim(identifier, string);
                                String string2 = armorItem.getType().getName() + "_trim_" + string;
                                Identifier identifier5 = new Identifier(string2).withPrefixedPath("trims/items/");
                                uploadArmor(identifier4, identifier2, identifier3, identifierTintedHelmet, identifier5, writer);
                            }
                        } else {
                            Identifier identifierLeathered = new Identifier(modID, "item/leathered_" + armorItem.getType().toString().toLowerCase() +  "_overlay");
                            Models.GENERATED_TWO_LAYERS
                                    .upload(identifier, TextureMap.layered(identifierLeathered, identifier2, identifier3), writer, (id, textures) -> this.createArmorJson(id, textures, armorItem.getMaterial()));
                            for (CAPIModelProvider.TrimMaterial trimMaterial : TRIM_MATERIALS) {
                                String string = trimMaterial.getAppliedName(armorItem.getMaterial());
                                Identifier identifier4 = this.suffixTrim(identifier, string);
                                String string2 = armorItem.getType().getName() + "_trim_" + string;
                                Identifier identifier5 = new Identifier(string2).withPrefixedPath("trims/items/");
                                uploadArmor(identifier4, identifierLeathered, identifier2, identifier5, writer);
                            }

                        }
                    } else if (CAPIHelper.isOneOfArmor(armorItem, tintedList)) {
                        Models.GENERATED_TWO_LAYERS
                                .upload(identifier, TextureMap.layered(identifier2, identifierTintedHelmet), writer, (id, textures) -> this.createArmorJson(id, textures, armorItem.getMaterial()));
                        for (CAPIModelProvider.TrimMaterial trimMaterial : TRIM_MATERIALS) {
                            String string = trimMaterial.getAppliedName(armorItem.getMaterial());
                            Identifier identifier4 = this.suffixTrim(identifier, string);
                            String string2 = armorItem.getType().getName() + "_trim_" + string;
                            Identifier identifier5 = new Identifier(string2).withPrefixedPath("trims/items/");
                            uploadArmor(identifier4, identifier2, identifierTintedHelmet, identifier5, writer);
                        }
                    } else if (CAPIHelper.isNeededArmorPiece(armorItem, wooledMaterial)) {
                        Identifier identifierWooledBoots = new Identifier(modID, "item/wooled_boots_overlay");
                        Models.GENERATED_TWO_LAYERS
                                .upload(identifier, TextureMap.layered(identifierWooledBoots, identifier2), writer, (id, textures) -> this.createArmorJson(id, textures, armorItem.getMaterial()));
                        for (CAPIModelProvider.TrimMaterial trimMaterial : TRIM_MATERIALS) {
                            String string = trimMaterial.getAppliedName(armorItem.getMaterial());
                            Identifier identifier4 = this.suffixTrim(identifier, string);
                            String string2 = armorItem.getType().getName() + "_trim_" + string;
                            Identifier identifier5 = new Identifier(string2).withPrefixedPath("trims/items/");
                            uploadArmor(identifier4, identifierWooledBoots, identifier2, identifier5, writer);
                        }
                    }
                } else {
                    Models.GENERATED
                            .upload(identifier, TextureMap.layer0(identifier2), writer, (id, textures) -> this.createArmorJson(id, textures, armorItem.getMaterial()));
                    for (CAPIModelProvider.TrimMaterial trimMaterial : TRIM_MATERIALS) {
                        String string = trimMaterial.getAppliedName(armorItem.getMaterial());
                        Identifier identifier4 = this.suffixTrim(identifier, string);
                        String string2 = armorItem.getType().getName() + "_trim_" + string;
                        Identifier identifier5 = new Identifier(string2).withPrefixedPath("trims/items/");

                        uploadArmor(identifier4, identifier2, identifier5, writer);
                    }
                }
            }
        }
    }

    public static TextureMap layered(Identifier layer0, Identifier layer1, Identifier layer2, Identifier layer3) {
        return new TextureMap().put(TextureKey.LAYER0, layer0).put(TextureKey.LAYER1, layer1).put(TextureKey.LAYER2, layer2).put(LAYER3, layer3);
    }

    public final void uploadArmor(Identifier id, Identifier layer0, Identifier layer1, BiConsumer<Identifier, Supplier<JsonElement>> writer) {
        Models.GENERATED_TWO_LAYERS.upload(id, TextureMap.layered(layer0, layer1), writer);
    }

    public final void uploadArmor(Identifier id, Identifier layer0, Identifier layer1, Identifier layer2, BiConsumer<Identifier, Supplier<JsonElement>> writer) {
        Models.GENERATED_THREE_LAYERS.upload(id, TextureMap.layered(layer0, layer1, layer2), writer);
    }

    public final void uploadArmor(Identifier id, Identifier layer0, Identifier layer1, Identifier layer2, Identifier layer3, BiConsumer<Identifier, Supplier<JsonElement>> writer) {
        GENERATED_FOUR_LAYERS.upload(id, layered(layer0, layer1, layer2, layer3), writer);
    }

    public final Identifier suffixTrim(Identifier id, String trimMaterialName) {
        return id.withSuffixedPath("_" + trimMaterialName + "_trim");
    }

    public final JsonObject createArmorJson(Identifier id, Map<TextureKey, Identifier> textures, ArmorMaterial armorMaterial) {
        JsonObject jsonObject = Models.GENERATED_TWO_LAYERS.createJson(id, textures);
        JsonArray jsonArray = new JsonArray();
        for (CAPIModelProvider.TrimMaterial trimMaterial : TRIM_MATERIALS) {
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(ItemModelGenerator.TRIM_TYPE.getPath(), trimMaterial.itemModelIndex());
            jsonObject2.add("predicate", jsonObject3);
            jsonObject2.addProperty("model", this.suffixTrim(id, trimMaterial.getAppliedName(armorMaterial)).toString());
            jsonArray.add(jsonObject2);
        }
        jsonObject.add("overrides", jsonArray);
        return jsonObject;
    }

    protected void simpleItem(Item item, BiConsumer<Identifier, Supplier<JsonElement>> writer) {
        Models.GENERATED.upload(ModelIds.getItemModelId(item), TextureMap.layer0(item), writer);
    }

}
