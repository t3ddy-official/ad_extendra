package net.teddy0008.ad_extendra.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;

public class ModBlockStateGenerator extends BlockStateProvider {
    public ModBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Main.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Jupiter
        blockWithItem(ModBlocks.JUPERIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_JUPERIUM_BLOCK);
        blockWithItem(ModBlocks.JUPITER_JUPERIUM_ORE);
        blockWithItem(ModBlocks.JUPITER_COAL_ORE);
        blockWithItem(ModBlocks.JUPITER_DIAMOND_ORE);
        blockWithItem(ModBlocks.JUPITER_GOLD_ORE);
        fallingBlockWithItem(ModBlocks.JUPITER_SAND);
        blockWithItem(ModBlocks.JUPITER_STONE);
        stairsBlock(((StairBlock) ModBlocks.JUPITER_STONE_STAIRS.get()), blockTexture(ModBlocks.JUPITER_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.JUPITER_STONE_SLAB.get()), blockTexture(ModBlocks.JUPITER_STONE.get()), blockTexture(ModBlocks.JUPITER_STONE.get()));
        blockWithItem(ModBlocks.JUPITER_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.JUPITER_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.JUPITER_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.JUPITER_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.JUPITER_COBBLESTONE.get()), blockTexture(ModBlocks.JUPITER_COBBLESTONE.get()));
        blockWithItem(ModBlocks.JUPITER_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.JUPITER_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.JUPITER_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.JUPITER_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.JUPITER_STONE_BRICKS.get()), blockTexture(ModBlocks.JUPITER_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.JUPITER_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.JUPITER_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_JUPITER_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_JUPITER_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_JUPITER_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_JUPITER_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_JUPITER_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_JUPITER_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_JUPITER_STONE.get()), blockTexture(ModBlocks.POLISHED_JUPITER_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.JUPITER_PILLAR.get()), blockTexture(ModBlocks.JUPITER_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/jupiter_pillar_top"));

        // Ceres
        blockWithItem(ModBlocks.CERES_COPPER_ORE);
        blockWithItem(ModBlocks.CERES_IRON_ORE);
        fallingBlockWithItem(ModBlocks.CERES_SAND);
        blockWithItem(ModBlocks.CERES_STONE);
        stairsBlock(((StairBlock) ModBlocks.CERES_STONE_STAIRS.get()), blockTexture(ModBlocks.CERES_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.CERES_STONE_SLAB.get()), blockTexture(ModBlocks.CERES_STONE.get()), blockTexture(ModBlocks.CERES_STONE.get()));
        blockWithItem(ModBlocks.CERES_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.CERES_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.CERES_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.CERES_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.CERES_COBBLESTONE.get()), blockTexture(ModBlocks.CERES_COBBLESTONE.get()));
        blockWithItem(ModBlocks.CERES_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CERES_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.CERES_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CERES_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.CERES_STONE_BRICKS.get()), blockTexture(ModBlocks.CERES_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.CERES_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.CERES_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_CERES_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_CERES_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_CERES_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_CERES_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_CERES_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_CERES_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_CERES_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_CERES_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_CERES_STONE.get()), blockTexture(ModBlocks.POLISHED_CERES_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CERES_PILLAR.get()), blockTexture(ModBlocks.CERES_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/ceres_pillar_top"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void fallingBlockWithItem(RegistryObject<FallingBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
