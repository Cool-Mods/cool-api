package net.raylirov.coolapi.main.datagen.gen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.raylirov.coolapi.CoolApi;
import net.raylirov.coolapi.content.CAPIItemTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CAPIItemTagGenerator extends ItemTagsProvider {

    public CAPIItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, CoolApi.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        this.tag(CAPIItemTags.NETHERITE_ARMOR_HELMET)
                .add(Items.NETHERITE_HELMET);

        this.tag(CAPIItemTags.NETHERITE_ARMOR_CHESTPLATE)
                .add(Items.NETHERITE_CHESTPLATE);

        this.tag(CAPIItemTags.NETHERITE_ARMOR_LEGGINGS)
                .add(Items.NETHERITE_LEGGINGS);

        this.tag(CAPIItemTags.NETHERITE_ARMOR_BOOTS)
                .add(Items.NETHERITE_BOOTS);

        this.tag(CAPIItemTags.IRON_ARMOR)
                .add(Items.IRON_HELMET)
                .add(Items.IRON_CHESTPLATE)
                .add(Items.IRON_LEGGINGS)
                .add(Items.IRON_BOOTS);

        this.tag(CAPIItemTags.DIAMOND_ARMOR)
                .add(Items.DIAMOND_HELMET)
                .add(Items.DIAMOND_CHESTPLATE)
                .add(Items.DIAMOND_LEGGINGS)
                .add(Items.DIAMOND_BOOTS);

        this.tag(CAPIItemTags.LEATHER_ARMOR_BOOTS)
                .add(Items.LEATHER_BOOTS);
    }
}
