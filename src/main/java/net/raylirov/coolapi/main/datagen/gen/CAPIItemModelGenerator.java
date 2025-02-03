package net.raylirov.coolapi.main.datagen.gen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.content.CAPIItems;
import net.raylirov.coolapi.main.utils.CAPIHelper;

import java.util.LinkedHashMap;
import java.util.List;

public class CAPIItemModelGenerator extends ItemModelProvider {
    
    private final String MOD_ID;

    public CAPIItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper, String mod_id) {
        super(output, CoolApi.MOD_ID, existingFileHelper);
        MOD_ID = mod_id;
    }

    private static final LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    @Override
    protected void registerModels() {
        simpleItem(CAPIItems.TINTED_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAPIItems.WOOLED_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAPIItems.LEATHER_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAPIItems.TURTLE_UPGRADE_SMITHING_TEMPLATE);
        simpleItem(CAPIItems.GILDED_UPGRADE_SMITHING_TEMPLATE);
    }
    
    public void trimmedArmorItem(List<RegistryObject<Item>> items, List<ArmorMaterial> leatherList, ArmorMaterial leatherTintedMaterial, List<ArmorMaterial> tintedList, ArmorMaterial wooledMaterial) {
        for (RegistryObject<Item> itemRegistryObject : items) {
            if (itemRegistryObject.get() instanceof ArmorItem armorItem) {
                trimMaterials.forEach((trimMaterial, value) -> {
                    float trimValue = value;
                    String armorType = switch (armorItem.getEquipmentSlot()) {
                        case HEAD -> "helmet";
                        case CHEST -> "chestplate";
                        case LEGS -> "leggings";
                        case FEET -> "boots";
                        default -> "";
                    };

                    String armorItemPath = "item/" + armorItem;
                    String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                    String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                    ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                    ResourceLocation trimResLoc = new ResourceLocation(trimPath);
                    ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);
                    existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                    if (CAPIHelper.trimArmor(armorItem, leatherList, wooledMaterial, tintedList)) {

                        String tintedoverlay = "item/tinted_" + armorType + "_overlay";
                        ResourceLocation tintedoverlayResLoc = new ResourceLocation(MOD_ID, tintedoverlay);

                        if (CAPIHelper.isOneOfArmor(armorItem, leatherList)) {
                            if (CAPIHelper.isNeededArmorPiece(armorItem, leatherTintedMaterial)) {
                                String tintedleatheroverlay = "item/leather_tinted_" + armorType + "_overlay";
                                ResourceLocation tintedleatheroverlayResLoc = new ResourceLocation(MOD_ID, tintedleatheroverlay);
                                getBuilder(currentTrimName)
                                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                        .texture("layer0", armorItemResLoc)
                                        .texture("layer1", tintedleatheroverlayResLoc)
                                        .texture("layer2", tintedoverlayResLoc)
                                        .texture("layer3", trimResLoc);

                                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                                mcLoc("item/generated"))
                                        .override()
                                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                        .predicate(mcLoc("trim_type"), trimValue).end()
                                        .texture("layer0", armorItemResLoc)
                                        .texture("layer1", tintedleatheroverlayResLoc)
                                        .texture("layer2", tintedoverlayResLoc);
                            } else {
                                String leatheroverlay = "item/leathered_" + armorType + "_overlay";
                                ResourceLocation leatheroverlayResLoc = new ResourceLocation(MOD_ID, leatheroverlay);
                                getBuilder(currentTrimName)
                                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                        .texture("layer0", leatheroverlayResLoc)
                                        .texture("layer1", armorItemResLoc)
                                        .texture("layer2", trimResLoc);

                                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                                mcLoc("item/generated"))
                                        .override()
                                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                        .predicate(mcLoc("trim_type"), trimValue).end()
                                        .texture("layer0", leatheroverlayResLoc)
                                        .texture("layer1", armorItemResLoc);
                            }
                        } else if (CAPIHelper.isOneOfArmor(armorItem, tintedList)) {
                            getBuilder(currentTrimName)
                                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                    .texture("layer0", armorItemResLoc)
                                    .texture("layer1", tintedoverlayResLoc)
                                    .texture("layer2", trimResLoc);

                            this.withExistingParent(itemRegistryObject.getId().getPath(),
                                            mcLoc("item/generated"))
                                    .override()
                                    .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                    .predicate(mcLoc("trim_type"), trimValue).end()
                                    .texture("layer0", armorItemResLoc)
                                    .texture("layer1", tintedoverlayResLoc);
                        } else if (CAPIHelper.isNeededArmorPiece(armorItem, wooledMaterial)) {
                            String wooledoverlay = "item/wooled_" + armorType + "_overlay";
                            ResourceLocation wooledoverlayResLoc = new ResourceLocation(MOD_ID, wooledoverlay);
                            getBuilder(currentTrimName)
                                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                    .texture("layer0", wooledoverlayResLoc)
                                    .texture("layer1", armorItemResLoc)
                                    .texture("layer2", trimResLoc);

                            this.withExistingParent(itemRegistryObject.getId().getPath(),
                                            mcLoc("item/generated"))
                                    .override()
                                    .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                    .predicate(mcLoc("trim_type"), trimValue).end()
                                    .texture("layer0", wooledoverlayResLoc)
                                    .texture("layer1", armorItemResLoc);

                        }
                    } else {
                        getBuilder(currentTrimName)
                                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                                .texture("layer0", armorItemResLoc)
                                .texture("layer1", trimResLoc);

                        this.withExistingParent(itemRegistryObject.getId().getPath(),
                                        mcLoc("item/generated"))
                                .override()
                                .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                                .predicate(mcLoc("trim_type"), trimValue).end()
                                .texture("layer0", armorItemResLoc);
                    }
                });
            }
        }
    }

    public void simpleItem(RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MOD_ID, "item/" + item.getId().getPath()));
    }

}
