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

        // Saturn
        fallingBlockWithItem(ModBlocks.SATURN_SAND);
        blockWithItem(ModBlocks.SATURN_STONE);
        stairsBlock(((StairBlock) ModBlocks.SATURN_STONE_STAIRS.get()), blockTexture(ModBlocks.SATURN_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.SATURN_STONE_SLAB.get()), blockTexture(ModBlocks.SATURN_STONE.get()), blockTexture(ModBlocks.SATURN_STONE.get()));
        blockWithItem(ModBlocks.SATURN_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.SATURN_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.SATURN_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.SATURN_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.SATURN_COBBLESTONE.get()), blockTexture(ModBlocks.SATURN_COBBLESTONE.get()));
        blockWithItem(ModBlocks.SATURN_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.SATURN_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.SATURN_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.SATURN_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.SATURN_STONE_BRICKS.get()), blockTexture(ModBlocks.SATURN_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.SATURN_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.SATURN_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_SATURN_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_SATURN_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_SATURN_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_SATURN_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_SATURN_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_SATURN_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_SATURN_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_SATURN_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_SATURN_STONE.get()), blockTexture(ModBlocks.POLISHED_SATURN_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURN_PILLAR.get()), blockTexture(ModBlocks.SATURN_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/saturn_pillar_top"));

        // Uranus
        blockWithItem(ModBlocks.URANUS_STONE);
        stairsBlock(((StairBlock) ModBlocks.URANUS_STONE_STAIRS.get()), blockTexture(ModBlocks.URANUS_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.URANUS_STONE_SLAB.get()), blockTexture(ModBlocks.URANUS_STONE.get()), blockTexture(ModBlocks.URANUS_STONE.get()));
        blockWithItem(ModBlocks.URANUS_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.URANUS_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.URANUS_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.URANUS_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.URANUS_COBBLESTONE.get()), blockTexture(ModBlocks.URANUS_COBBLESTONE.get()));
        blockWithItem(ModBlocks.URANUS_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.URANUS_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.URANUS_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.URANUS_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.URANUS_STONE_BRICKS.get()), blockTexture(ModBlocks.URANUS_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.URANUS_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.URANUS_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_URANUS_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_URANUS_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_URANUS_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_URANUS_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_URANUS_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_URANUS_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_URANUS_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_URANUS_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_URANUS_STONE.get()), blockTexture(ModBlocks.POLISHED_URANUS_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.URANUS_PILLAR.get()), blockTexture(ModBlocks.URANUS_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/uranus_pillar_top"));

        // Neptune
        blockWithItem(ModBlocks.NEPTUNE_STONE);
        stairsBlock(((StairBlock) ModBlocks.NEPTUNE_STONE_STAIRS.get()), blockTexture(ModBlocks.NEPTUNE_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NEPTUNE_STONE_SLAB.get()), blockTexture(ModBlocks.NEPTUNE_STONE.get()), blockTexture(ModBlocks.NEPTUNE_STONE.get()));
        blockWithItem(ModBlocks.NEPTUNE_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.NEPTUNE_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.NEPTUNE_COBBLESTONE.get()), blockTexture(ModBlocks.NEPTUNE_COBBLESTONE.get()));
        blockWithItem(ModBlocks.NEPTUNE_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.NEPTUNE_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.NEPTUNE_STONE_BRICKS.get()), blockTexture(ModBlocks.NEPTUNE_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.NEPTUNE_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.NEPTUNE_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_NEPTUNE_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_NEPTUNE_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_NEPTUNE_STONE.get()), blockTexture(ModBlocks.POLISHED_NEPTUNE_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.NEPTUNE_PILLAR.get()), blockTexture(ModBlocks.NEPTUNE_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/neptune_pillar_top"));

        // Orcus
        blockWithItem(ModBlocks.ORCUS_STONE);
        stairsBlock(((StairBlock) ModBlocks.ORCUS_STONE_STAIRS.get()), blockTexture(ModBlocks.ORCUS_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.ORCUS_STONE_SLAB.get()), blockTexture(ModBlocks.ORCUS_STONE.get()), blockTexture(ModBlocks.ORCUS_STONE.get()));
        blockWithItem(ModBlocks.ORCUS_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.ORCUS_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.ORCUS_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.ORCUS_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.ORCUS_COBBLESTONE.get()), blockTexture(ModBlocks.ORCUS_COBBLESTONE.get()));
        blockWithItem(ModBlocks.ORCUS_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.ORCUS_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.ORCUS_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.ORCUS_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.ORCUS_STONE_BRICKS.get()), blockTexture(ModBlocks.ORCUS_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.ORCUS_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.ORCUS_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_ORCUS_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_ORCUS_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_ORCUS_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_ORCUS_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_ORCUS_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_ORCUS_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_ORCUS_STONE.get()), blockTexture(ModBlocks.POLISHED_ORCUS_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ORCUS_PILLAR.get()), blockTexture(ModBlocks.ORCUS_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/orcus_pillar_top"));

        // Pluto
        fallingBlockWithItem(ModBlocks.PLUTO_SAND);
        blockWithItem(ModBlocks.PLUTO_STONE);
        stairsBlock(((StairBlock) ModBlocks.PLUTO_STONE_STAIRS.get()), blockTexture(ModBlocks.PLUTO_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.PLUTO_STONE_SLAB.get()), blockTexture(ModBlocks.PLUTO_STONE.get()), blockTexture(ModBlocks.PLUTO_STONE.get()));
        blockWithItem(ModBlocks.PLUTO_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.PLUTO_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.PLUTO_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.PLUTO_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.PLUTO_COBBLESTONE.get()), blockTexture(ModBlocks.PLUTO_COBBLESTONE.get()));
        blockWithItem(ModBlocks.PLUTO_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.PLUTO_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.PLUTO_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.PLUTO_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.PLUTO_STONE_BRICKS.get()), blockTexture(ModBlocks.PLUTO_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.PLUTO_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.PLUTO_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_PLUTO_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_PLUTO_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_PLUTO_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_PLUTO_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_PLUTO_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_PLUTO_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_PLUTO_STONE.get()), blockTexture(ModBlocks.POLISHED_PLUTO_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PLUTO_PILLAR.get()), blockTexture(ModBlocks.PLUTO_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/pluto_pillar_top"));

        // Haumea
        blockWithItem(ModBlocks.HAUMEA_STONE);
        stairsBlock(((StairBlock) ModBlocks.HAUMEA_STONE_STAIRS.get()), blockTexture(ModBlocks.HAUMEA_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.HAUMEA_STONE_SLAB.get()), blockTexture(ModBlocks.HAUMEA_STONE.get()), blockTexture(ModBlocks.HAUMEA_STONE.get()));
        blockWithItem(ModBlocks.HAUMEA_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.HAUMEA_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.HAUMEA_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.HAUMEA_COBBLESTONE.get()), blockTexture(ModBlocks.HAUMEA_COBBLESTONE.get()));
        blockWithItem(ModBlocks.HAUMEA_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.HAUMEA_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.HAUMEA_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.HAUMEA_STONE_BRICKS.get()), blockTexture(ModBlocks.HAUMEA_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.HAUMEA_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.HAUMEA_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_HAUMEA_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_HAUMEA_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_HAUMEA_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_HAUMEA_STONE.get()), blockTexture(ModBlocks.POLISHED_HAUMEA_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.HAUMEA_PILLAR.get()), blockTexture(ModBlocks.HAUMEA_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/haumea_pillar_top"));

        // Quaoar
        blockWithItem(ModBlocks.QUAOAR_STONE);
        stairsBlock(((StairBlock) ModBlocks.QUAOAR_STONE_STAIRS.get()), blockTexture(ModBlocks.QUAOAR_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.QUAOAR_STONE_SLAB.get()), blockTexture(ModBlocks.QUAOAR_STONE.get()), blockTexture(ModBlocks.QUAOAR_STONE.get()));
        blockWithItem(ModBlocks.QUAOAR_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.QUAOAR_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.QUAOAR_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.QUAOAR_COBBLESTONE.get()), blockTexture(ModBlocks.QUAOAR_COBBLESTONE.get()));
        blockWithItem(ModBlocks.QUAOAR_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.QUAOAR_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.QUAOAR_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.QUAOAR_STONE_BRICKS.get()), blockTexture(ModBlocks.QUAOAR_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.QUAOAR_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.QUAOAR_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_QUAOAR_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_QUAOAR_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_QUAOAR_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_QUAOAR_STONE.get()), blockTexture(ModBlocks.POLISHED_QUAOAR_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.QUAOAR_PILLAR.get()), blockTexture(ModBlocks.QUAOAR_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/quaoar_pillar_top"));

        // Makemake
        blockWithItem(ModBlocks.MAKEMAKE_STONE);
        stairsBlock(((StairBlock) ModBlocks.MAKEMAKE_STONE_STAIRS.get()), blockTexture(ModBlocks.MAKEMAKE_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.MAKEMAKE_STONE_SLAB.get()), blockTexture(ModBlocks.MAKEMAKE_STONE.get()), blockTexture(ModBlocks.MAKEMAKE_STONE.get()));
        blockWithItem(ModBlocks.MAKEMAKE_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.MAKEMAKE_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.MAKEMAKE_COBBLESTONE.get()), blockTexture(ModBlocks.MAKEMAKE_COBBLESTONE.get()));
        blockWithItem(ModBlocks.MAKEMAKE_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.MAKEMAKE_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), blockTexture(ModBlocks.MAKEMAKE_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.MAKEMAKE_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_MAKEMAKE_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_MAKEMAKE_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_MAKEMAKE_STONE.get()), blockTexture(ModBlocks.POLISHED_MAKEMAKE_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAKEMAKE_PILLAR.get()), blockTexture(ModBlocks.MAKEMAKE_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/makemake_pillar_top"));

        // Gonggong
        blockWithItem(ModBlocks.GONGGONG_STONE);
        stairsBlock(((StairBlock) ModBlocks.GONGGONG_STONE_STAIRS.get()), blockTexture(ModBlocks.GONGGONG_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.GONGGONG_STONE_SLAB.get()), blockTexture(ModBlocks.GONGGONG_STONE.get()), blockTexture(ModBlocks.GONGGONG_STONE.get()));
        blockWithItem(ModBlocks.GONGGONG_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.GONGGONG_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.GONGGONG_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.GONGGONG_COBBLESTONE.get()), blockTexture(ModBlocks.GONGGONG_COBBLESTONE.get()));
        blockWithItem(ModBlocks.GONGGONG_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.GONGGONG_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GONGGONG_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.GONGGONG_STONE_BRICKS.get()), blockTexture(ModBlocks.GONGGONG_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.GONGGONG_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.GONGGONG_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_GONGGONG_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_GONGGONG_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_GONGGONG_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_GONGGONG_STONE.get()), blockTexture(ModBlocks.POLISHED_GONGGONG_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GONGGONG_PILLAR.get()), blockTexture(ModBlocks.GONGGONG_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/gonggong_pillar_top"));

        // Eris
        blockWithItem(ModBlocks.ERIS_STONE);
        stairsBlock(((StairBlock) ModBlocks.ERIS_STONE_STAIRS.get()), blockTexture(ModBlocks.ERIS_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.ERIS_STONE_SLAB.get()), blockTexture(ModBlocks.ERIS_STONE.get()), blockTexture(ModBlocks.ERIS_STONE.get()));
        blockWithItem(ModBlocks.ERIS_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.ERIS_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.ERIS_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.ERIS_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.ERIS_COBBLESTONE.get()), blockTexture(ModBlocks.ERIS_COBBLESTONE.get()));
        blockWithItem(ModBlocks.ERIS_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.ERIS_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.ERIS_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.ERIS_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.ERIS_STONE_BRICKS.get()), blockTexture(ModBlocks.ERIS_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.ERIS_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.ERIS_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_ERIS_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_ERIS_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_ERIS_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_ERIS_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_ERIS_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_ERIS_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_ERIS_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_ERIS_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_ERIS_STONE.get()), blockTexture(ModBlocks.POLISHED_ERIS_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ERIS_PILLAR.get()), blockTexture(ModBlocks.ERIS_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/eris_pillar_top"));

        // Sedna
        blockWithItem(ModBlocks.SEDNA_STONE);
        stairsBlock(((StairBlock) ModBlocks.SEDNA_STONE_STAIRS.get()), blockTexture(ModBlocks.SEDNA_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.SEDNA_STONE_SLAB.get()), blockTexture(ModBlocks.SEDNA_STONE.get()), blockTexture(ModBlocks.SEDNA_STONE.get()));
        blockWithItem(ModBlocks.SEDNA_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.SEDNA_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.SEDNA_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.SEDNA_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.SEDNA_COBBLESTONE.get()), blockTexture(ModBlocks.SEDNA_COBBLESTONE.get()));
        blockWithItem(ModBlocks.SEDNA_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.SEDNA_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.SEDNA_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.SEDNA_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.SEDNA_STONE_BRICKS.get()), blockTexture(ModBlocks.SEDNA_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.SEDNA_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.SEDNA_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_SEDNA_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_SEDNA_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_SEDNA_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_SEDNA_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_SEDNA_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_SEDNA_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_SEDNA_STONE.get()), blockTexture(ModBlocks.POLISHED_SEDNA_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SEDNA_PILLAR.get()), blockTexture(ModBlocks.SEDNA_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/sedna_pillar_top"));

        // Proxima Centauri b
        fallingBlockWithItem(ModBlocks.B_SAND);
        blockWithItem(ModBlocks.B_STONE);
        stairsBlock(((StairBlock) ModBlocks.B_STONE_STAIRS.get()), blockTexture(ModBlocks.B_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.B_STONE_SLAB.get()), blockTexture(ModBlocks.B_STONE.get()), blockTexture(ModBlocks.B_STONE.get()));
        blockWithItem(ModBlocks.B_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.B_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.B_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.B_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.B_COBBLESTONE.get()), blockTexture(ModBlocks.B_COBBLESTONE.get()));
        blockWithItem(ModBlocks.B_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.B_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.B_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.B_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.B_STONE_BRICKS.get()), blockTexture(ModBlocks.B_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.B_STONE_BRICK_WALL.get()), blockTexture(ModBlocks.B_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.CRACKED_B_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_B_STONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.CHISELED_B_STONE_STAIRS.get()), blockTexture(ModBlocks.CHISELED_B_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHISELED_B_STONE_SLAB.get()), blockTexture(ModBlocks.CHISELED_B_STONE_BRICKS.get()), blockTexture(ModBlocks.CHISELED_B_STONE_BRICKS.get()));
        blockWithItem(ModBlocks.POLISHED_B_STONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_B_STONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_B_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_B_STONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_B_STONE.get()), blockTexture(ModBlocks.POLISHED_B_STONE.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.B_PILLAR.get()), blockTexture(ModBlocks.B_PILLAR.get()),
                new ResourceLocation(Main.MOD_ID, "block/b_pillar_top"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void fallingBlockWithItem(RegistryObject<FallingBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
