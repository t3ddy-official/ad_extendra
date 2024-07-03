package net.teddy0008.ad_extendra.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // this.tag(ModTags.Blocks.TAG).add(ModBlocks.BLOCK.get()).addTags(Tags.Blocks.TAG);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.JUPERIUM_BLOCK.get())
                .add(ModBlocks.JUPITER_JUPERIUM_ORE.get())
                .add(ModBlocks.RAW_JUPERIUM_BLOCK.get());
        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.JUPITER_COAL_ORE.get())
                .add(ModBlocks.CERES_IRON_ORE.get())
                .add(ModBlocks.CERES_COPPER_ORE.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.JUPITER_DIAMOND_ORE.get())
                .add(ModBlocks.JUPITER_GOLD_ORE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Jupiter
                .add(ModBlocks.JUPERIUM_BLOCK.get())
                .add(ModBlocks.JUPITER_JUPERIUM_ORE.get())
                .add(ModBlocks.RAW_JUPERIUM_BLOCK.get())
                .add(ModBlocks.JUPITER_STONE.get())
                .add(ModBlocks.JUPITER_STONE_STAIRS.get())
                .add(ModBlocks.JUPITER_STONE_SLAB.get())
                .add(ModBlocks.JUPITER_COBBLESTONE.get())
                .add(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.JUPITER_COBBLESTONE_SLAB.get())
                .add(ModBlocks.JUPITER_STONE_BRICKS.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_JUPITER_STONE.get())
                .add(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get())
                .add(ModBlocks.JUPITER_PILLAR.get())
                .add(ModBlocks.JUPITER_COAL_ORE.get())
                .add(ModBlocks.JUPITER_DIAMOND_ORE.get())
                .add(ModBlocks.JUPITER_GOLD_ORE.get())
                
                // Ceres
                .add(ModBlocks.CERES_STONE.get())
                .add(ModBlocks.CERES_STONE_STAIRS.get())
                .add(ModBlocks.CERES_STONE_SLAB.get())
                .add(ModBlocks.CERES_COBBLESTONE.get())
                .add(ModBlocks.CERES_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.CERES_COBBLESTONE_SLAB.get())
                .add(ModBlocks.CERES_STONE_BRICKS.get())
                .add(ModBlocks.CERES_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CERES_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CERES_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_CERES_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_CERES_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_CERES_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_CERES_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_CERES_STONE.get())
                .add(ModBlocks.POLISHED_CERES_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_CERES_STONE_SLAB.get())
                .add(ModBlocks.CERES_PILLAR.get())
                .add(ModBlocks.CERES_COPPER_ORE.get())
                .add(ModBlocks.CERES_IRON_ORE.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.JUPITER_SAND.get())
                .add(ModBlocks.CERES_SAND.get());
        this.tag(BlockTags.DIAMOND_ORES)
                .add(ModBlocks.JUPITER_DIAMOND_ORE.get());
        this.tag(BlockTags.COAL_ORES)
                .add(ModBlocks.JUPITER_COAL_ORE.get());
        this.tag(BlockTags.GOLD_ORES)
                .add(ModBlocks.JUPITER_GOLD_ORE.get());
        this.tag(BlockTags.COPPER_ORES)
                .add(ModBlocks.CERES_COPPER_ORE.get());
        this.tag(BlockTags.IRON_ORES)
                .add(ModBlocks.CERES_IRON_ORE.get());
        this.tag(BlockTags.SAND)
                .add(ModBlocks.JUPITER_SAND.get())
                .add(ModBlocks.CERES_SAND.get());
        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.JUPITER_STONE_STAIRS.get())
                .add(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get())
                .add(ModBlocks.CERES_STONE_STAIRS.get())
                .add(ModBlocks.CERES_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.CERES_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_CERES_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_CERES_STONE_STAIRS.get());
        this.tag(BlockTags.SLABS)
                .add(ModBlocks.JUPITER_STONE_SLAB.get())
                .add(ModBlocks.JUPITER_COBBLESTONE_SLAB.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get())
                .add(ModBlocks.CERES_STONE_SLAB.get())
                .add(ModBlocks.CERES_COBBLESTONE_SLAB.get())
                .add(ModBlocks.CERES_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_CERES_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_CERES_STONE_SLAB.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.JUPITER_STONE_BRICK_WALL.get())
                .add(ModBlocks.CERES_STONE_BRICK_WALL.get());
    }
}
