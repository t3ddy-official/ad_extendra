package net.teddy0008.ad_extendra.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(Tags.Items.RAW_MATERIALS)
                .add(ModItems.RAW_JUPERIUM.get());
        this.tag(ItemTags.STAIRS)
                .add(ModBlocks.JUPITER_STONE_STAIRS.get().asItem())
                .add(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get().asItem())
                .add(ModBlocks.CERES_STONE_STAIRS.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_CERES_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_CERES_STONE_STAIRS.get().asItem());
        this.tag(ItemTags.SLABS)
                .add(ModBlocks.JUPITER_STONE_SLAB.get().asItem())
                .add(ModBlocks.JUPITER_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get().asItem())
                .add(ModBlocks.CERES_STONE_SLAB.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_CERES_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_CERES_STONE_SLAB.get().asItem());
        this.tag(ItemTags.WALLS)
                .add(ModBlocks.JUPITER_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_WALL.get().asItem());
    }
}
