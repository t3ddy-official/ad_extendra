package net.teddy0008.ad_extendra.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
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
                .add(ModBlocks.JUPERIUM_PLATING.get())
                .add(ModBlocks.JUPERIUM_PLATING_STAIRS.get())
                .add(ModBlocks.JUPERIUM_PLATING_SLAB.get())
                .add(ModBlocks.JUPERIUM_PILLAR.get())
                .add(ModBlocks.GLOWING_JUPERIUM_PILLAR.get())
                .add(ModBlocks.JUPERIUM_PLATING_BUTTON.get())
                .add(ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get())
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
                .add(ModBlocks.CERES_IRON_ORE.get())

                // Saturn
                .add(ModBlocks.SATURN_STONE.get())
                .add(ModBlocks.SATURN_STONE_STAIRS.get())
                .add(ModBlocks.SATURN_STONE_SLAB.get())
                .add(ModBlocks.SATURN_COBBLESTONE.get())
                .add(ModBlocks.SATURN_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.SATURN_COBBLESTONE_SLAB.get())
                .add(ModBlocks.SATURN_STONE_BRICKS.get())
                .add(ModBlocks.SATURN_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.SATURN_STONE_BRICK_SLAB.get())
                .add(ModBlocks.SATURN_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_SATURN_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_SATURN_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_SATURN_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_SATURN_STONE.get())
                .add(ModBlocks.POLISHED_SATURN_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_SATURN_STONE_SLAB.get())
                .add(ModBlocks.SATURN_PILLAR.get())

                // Uranus
                .add(ModBlocks.URANUS_ICE_SHARD_ORE.get())
                .add(ModBlocks.URANUS_STONE.get())
                .add(ModBlocks.URANUS_STONE_STAIRS.get())
                .add(ModBlocks.URANUS_STONE_SLAB.get())
                .add(ModBlocks.URANUS_COBBLESTONE.get())
                .add(ModBlocks.URANUS_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.URANUS_COBBLESTONE_SLAB.get())
                .add(ModBlocks.URANUS_STONE_BRICKS.get())
                .add(ModBlocks.URANUS_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.URANUS_STONE_BRICK_SLAB.get())
                .add(ModBlocks.URANUS_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_URANUS_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_URANUS_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_URANUS_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_URANUS_STONE.get())
                .add(ModBlocks.POLISHED_URANUS_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_URANUS_STONE_SLAB.get())
                .add(ModBlocks.URANUS_PILLAR.get())

                // Neptune
                .add(ModBlocks.NEPTUNE_STONE.get())
                .add(ModBlocks.NEPTUNE_STONE_STAIRS.get())
                .add(ModBlocks.NEPTUNE_STONE_SLAB.get())
                .add(ModBlocks.NEPTUNE_COBBLESTONE.get())
                .add(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get())
                .add(ModBlocks.NEPTUNE_STONE_BRICKS.get())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE.get())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get())
                .add(ModBlocks.NEPTUNE_PILLAR.get())

                // Orcus
                .add(ModBlocks.ORCUS_STONE.get())
                .add(ModBlocks.ORCUS_STONE_STAIRS.get())
                .add(ModBlocks.ORCUS_STONE_SLAB.get())
                .add(ModBlocks.ORCUS_COBBLESTONE.get())
                .add(ModBlocks.ORCUS_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.ORCUS_COBBLESTONE_SLAB.get())
                .add(ModBlocks.ORCUS_STONE_BRICKS.get())
                .add(ModBlocks.ORCUS_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.ORCUS_STONE_BRICK_SLAB.get())
                .add(ModBlocks.ORCUS_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_ORCUS_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_ORCUS_STONE.get())
                .add(ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_ORCUS_STONE_SLAB.get())
                .add(ModBlocks.ORCUS_PILLAR.get())

                // Pluto
                .add(ModBlocks.PLUTO_SAND.get())
                .add(ModBlocks.PLUTO_STONE.get())
                .add(ModBlocks.PLUTO_STONE_STAIRS.get())
                .add(ModBlocks.PLUTO_STONE_SLAB.get())
                .add(ModBlocks.PLUTO_COBBLESTONE.get())
                .add(ModBlocks.PLUTO_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.PLUTO_COBBLESTONE_SLAB.get())
                .add(ModBlocks.PLUTO_STONE_BRICKS.get())
                .add(ModBlocks.PLUTO_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.PLUTO_STONE_BRICK_SLAB.get())
                .add(ModBlocks.PLUTO_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_PLUTO_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_PLUTO_STONE.get())
                .add(ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_PLUTO_STONE_SLAB.get())
                .add(ModBlocks.PLUTO_PILLAR.get())

                // Haumea
                .add(ModBlocks.HAUMEA_STONE.get())
                .add(ModBlocks.HAUMEA_STONE_STAIRS.get())
                .add(ModBlocks.HAUMEA_STONE_SLAB.get())
                .add(ModBlocks.HAUMEA_COBBLESTONE.get())
                .add(ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.HAUMEA_COBBLESTONE_SLAB.get())
                .add(ModBlocks.HAUMEA_STONE_BRICKS.get())
                .add(ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get())
                .add(ModBlocks.HAUMEA_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_HAUMEA_STONE.get())
                .add(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get())
                .add(ModBlocks.HAUMEA_PILLAR.get())

                // Quaoar
                .add(ModBlocks.QUAOAR_STONE.get())
                .add(ModBlocks.QUAOAR_STONE_STAIRS.get())
                .add(ModBlocks.QUAOAR_STONE_SLAB.get())
                .add(ModBlocks.QUAOAR_COBBLESTONE.get())
                .add(ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.QUAOAR_COBBLESTONE_SLAB.get())
                .add(ModBlocks.QUAOAR_STONE_BRICKS.get())
                .add(ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get())
                .add(ModBlocks.QUAOAR_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_QUAOAR_STONE.get())
                .add(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get())
                .add(ModBlocks.QUAOAR_PILLAR.get())

                // Makemake
                .add(ModBlocks.MAKEMAKE_STONE.get())
                .add(ModBlocks.MAKEMAKE_STONE_STAIRS.get())
                .add(ModBlocks.MAKEMAKE_STONE_SLAB.get())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE.get())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get())
                .add(ModBlocks.MAKEMAKE_STONE_BRICKS.get())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE.get())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get())
                .add(ModBlocks.MAKEMAKE_PILLAR.get())

                // Gonggong
                .add(ModBlocks.GONGGONG_STONE.get())
                .add(ModBlocks.GONGGONG_STONE_STAIRS.get())
                .add(ModBlocks.GONGGONG_STONE_SLAB.get())
                .add(ModBlocks.GONGGONG_COBBLESTONE.get())
                .add(ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.GONGGONG_COBBLESTONE_SLAB.get())
                .add(ModBlocks.GONGGONG_STONE_BRICKS.get())
                .add(ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get())
                .add(ModBlocks.GONGGONG_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_GONGGONG_STONE.get())
                .add(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get())
                .add(ModBlocks.GONGGONG_PILLAR.get())

                // Eris
                .add(ModBlocks.ERIS_STONE.get())
                .add(ModBlocks.ERIS_STONE_STAIRS.get())
                .add(ModBlocks.ERIS_STONE_SLAB.get())
                .add(ModBlocks.ERIS_COBBLESTONE.get())
                .add(ModBlocks.ERIS_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.ERIS_COBBLESTONE_SLAB.get())
                .add(ModBlocks.ERIS_STONE_BRICKS.get())
                .add(ModBlocks.ERIS_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.ERIS_STONE_BRICK_SLAB.get())
                .add(ModBlocks.ERIS_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_ERIS_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_ERIS_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_ERIS_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_ERIS_STONE.get())
                .add(ModBlocks.POLISHED_ERIS_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_ERIS_STONE_SLAB.get())
                .add(ModBlocks.ERIS_PILLAR.get())

                // Sedna
                .add(ModBlocks.SEDNA_STONE.get())
                .add(ModBlocks.SEDNA_STONE_STAIRS.get())
                .add(ModBlocks.SEDNA_STONE_SLAB.get())
                .add(ModBlocks.SEDNA_COBBLESTONE.get())
                .add(ModBlocks.SEDNA_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.SEDNA_COBBLESTONE_SLAB.get())
                .add(ModBlocks.SEDNA_STONE_BRICKS.get())
                .add(ModBlocks.SEDNA_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.SEDNA_STONE_BRICK_SLAB.get())
                .add(ModBlocks.SEDNA_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_SEDNA_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_SEDNA_STONE.get())
                .add(ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_SEDNA_STONE_SLAB.get())
                .add(ModBlocks.SEDNA_PILLAR.get())

                // Proxima Centauri b
                .add(ModBlocks.B_SAND.get())
                .add(ModBlocks.B_STONE.get())
                .add(ModBlocks.B_STONE_STAIRS.get())
                .add(ModBlocks.B_STONE_SLAB.get())
                .add(ModBlocks.B_COBBLESTONE.get())
                .add(ModBlocks.B_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.B_COBBLESTONE_SLAB.get())
                .add(ModBlocks.B_STONE_BRICKS.get())
                .add(ModBlocks.B_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.B_STONE_BRICK_SLAB.get())
                .add(ModBlocks.B_STONE_BRICK_WALL.get())
                .add(ModBlocks.CRACKED_B_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_B_STONE_BRICKS.get())
                .add(ModBlocks.CHISELED_B_STONE_STAIRS.get())
                .add(ModBlocks.CHISELED_B_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_B_STONE.get())
                .add(ModBlocks.POLISHED_B_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_B_STONE_SLAB.get())
                .add(ModBlocks.B_PILLAR.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.JUPITER_SAND.get())
                .add(ModBlocks.CERES_SAND.get())
                .add(ModBlocks.SATURN_SAND.get())
                .add(ModBlocks.PLUTO_SAND.get())
                .add(ModBlocks.B_SAND.get());
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
                .add(ModBlocks.CERES_SAND.get())
                .add(ModBlocks.SATURN_SAND.get())
                .add(ModBlocks.PLUTO_SAND.get())
                .add(ModBlocks.B_SAND.get());
        this.tag(BlockTags.ICE)
                .add(ModBlocks.SATURN_ICE.get());
        this.tag(BlockTags.STAIRS)
                // Jupiter
                .add(ModBlocks.JUPERIUM_PLATING_STAIRS.get())
                .add(ModBlocks.JUPITER_STONE_STAIRS.get())
                .add(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get())

                // Ceres
                .add(ModBlocks.CERES_STONE_STAIRS.get())
                .add(ModBlocks.CERES_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.CERES_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_CERES_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_CERES_STONE_STAIRS.get())

                // Saturn
                .add(ModBlocks.SATURN_STONE_STAIRS.get())
                .add(ModBlocks.SATURN_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.SATURN_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_SATURN_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_SATURN_STONE_STAIRS.get())

                // Uranus
                .add(ModBlocks.URANUS_STONE_STAIRS.get())
                .add(ModBlocks.URANUS_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.URANUS_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_URANUS_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_URANUS_STONE_STAIRS.get())

                // Neptune
                .add(ModBlocks.NEPTUNE_STONE_STAIRS.get())
                .add(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get())

                // Orcus
                .add(ModBlocks.ORCUS_STONE_STAIRS.get())
                .add(ModBlocks.ORCUS_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.ORCUS_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get())

                // Pluto
                .add(ModBlocks.PLUTO_STONE_STAIRS.get())
                .add(ModBlocks.PLUTO_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.PLUTO_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get())

                // Haumea
                .add(ModBlocks.HAUMEA_STONE_STAIRS.get())
                .add(ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get())

                // Quaoar
                .add(ModBlocks.QUAOAR_STONE_STAIRS.get())
                .add(ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get())

                // Makemake
                .add(ModBlocks.MAKEMAKE_STONE_STAIRS.get())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get())

                // Gonggong
                .add(ModBlocks.GONGGONG_STONE_STAIRS.get())
                .add(ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get())

                // Eris
                .add(ModBlocks.ERIS_STONE_STAIRS.get())
                .add(ModBlocks.ERIS_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.ERIS_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_ERIS_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_ERIS_STONE_STAIRS.get())

                // Sedna
                .add(ModBlocks.SEDNA_STONE_STAIRS.get())
                .add(ModBlocks.SEDNA_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.SEDNA_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get())

                // Proxima Centauri b
                .add(ModBlocks.B_STONE_STAIRS.get())
                .add(ModBlocks.B_COBBLESTONE_STAIRS.get())
                .add(ModBlocks.B_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.CHISELED_B_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_B_STONE_STAIRS.get());
        this.tag(BlockTags.SLABS)
                // Jupiter
                .add(ModBlocks.JUPERIUM_PLATING_SLAB.get())
                .add(ModBlocks.JUPITER_STONE_SLAB.get())
                .add(ModBlocks.JUPITER_COBBLESTONE_SLAB.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get())

                // Ceres
                .add(ModBlocks.CERES_STONE_SLAB.get())
                .add(ModBlocks.CERES_COBBLESTONE_SLAB.get())
                .add(ModBlocks.CERES_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_CERES_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_CERES_STONE_SLAB.get())

                // Saturn
                .add(ModBlocks.SATURN_STONE_SLAB.get())
                .add(ModBlocks.SATURN_COBBLESTONE_SLAB.get())
                .add(ModBlocks.SATURN_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_SATURN_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_SATURN_STONE_SLAB.get())

                // Uranus
                .add(ModBlocks.URANUS_STONE_SLAB.get())
                .add(ModBlocks.URANUS_COBBLESTONE_SLAB.get())
                .add(ModBlocks.URANUS_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_URANUS_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_URANUS_STONE_SLAB.get())

                // Neptune
                .add(ModBlocks.NEPTUNE_STONE_SLAB.get())
                .add(ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get())

                // Orcus
                .add(ModBlocks.ORCUS_STONE_SLAB.get())
                .add(ModBlocks.ORCUS_COBBLESTONE_SLAB.get())
                .add(ModBlocks.ORCUS_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_ORCUS_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_ORCUS_STONE_SLAB.get())

                // Pluto
                .add(ModBlocks.PLUTO_STONE_SLAB.get())
                .add(ModBlocks.PLUTO_COBBLESTONE_SLAB.get())
                .add(ModBlocks.PLUTO_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_PLUTO_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_PLUTO_STONE_SLAB.get())

                // Haumea
                .add(ModBlocks.HAUMEA_STONE_SLAB.get())
                .add(ModBlocks.HAUMEA_COBBLESTONE_SLAB.get())
                .add(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get())

                // Quaoar
                .add(ModBlocks.QUAOAR_STONE_SLAB.get())
                .add(ModBlocks.QUAOAR_COBBLESTONE_SLAB.get())
                .add(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get())

                // Makemake
                .add(ModBlocks.MAKEMAKE_STONE_SLAB.get())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get())

                // Gonggong
                .add(ModBlocks.GONGGONG_STONE_SLAB.get())
                .add(ModBlocks.GONGGONG_COBBLESTONE_SLAB.get())
                .add(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get())

                // Eris
                .add(ModBlocks.ERIS_STONE_SLAB.get())
                .add(ModBlocks.ERIS_COBBLESTONE_SLAB.get())
                .add(ModBlocks.ERIS_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_ERIS_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_ERIS_STONE_SLAB.get())

                // Sedna
                .add(ModBlocks.SEDNA_STONE_SLAB.get())
                .add(ModBlocks.SEDNA_COBBLESTONE_SLAB.get())
                .add(ModBlocks.SEDNA_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_SEDNA_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_SEDNA_STONE_SLAB.get())

                // Proxima Centauri b
                .add(ModBlocks.B_STONE_SLAB.get())
                .add(ModBlocks.B_COBBLESTONE_SLAB.get())
                .add(ModBlocks.B_STONE_BRICK_SLAB.get())
                .add(ModBlocks.CHISELED_B_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_B_STONE_SLAB.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.JUPITER_STONE_BRICK_WALL.get())
                .add(ModBlocks.CERES_STONE_BRICK_WALL.get())
                .add(ModBlocks.SATURN_STONE_BRICK_WALL.get())
                .add(ModBlocks.URANUS_STONE_BRICK_WALL.get())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_WALL.get())
                .add(ModBlocks.ORCUS_STONE_BRICK_WALL.get())
                .add(ModBlocks.PLUTO_STONE_BRICK_WALL.get())
                .add(ModBlocks.HAUMEA_STONE_BRICK_WALL.get())
                .add(ModBlocks.QUAOAR_STONE_BRICK_WALL.get())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get())
                .add(ModBlocks.GONGGONG_STONE_BRICK_WALL.get())
                .add(ModBlocks.ERIS_STONE_BRICK_WALL.get())
                .add(ModBlocks.SEDNA_STONE_BRICK_WALL.get())
                .add(ModBlocks.B_STONE_BRICK_WALL.get());
        this.tag(BlockTags.BUTTONS)
                .add(ModBlocks.JUPERIUM_PLATING_BUTTON.get());
        this.tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get());
        this.tag(ModBlockTags.JUPERIUM_BLOCKS)
                .add(ModBlocks.JUPERIUM_BLOCK.get());
        this.tag(ModBlockTags.JUPERIUM_ORES)
                .add(ModBlocks.JUPITER_JUPERIUM_ORE.get());
        this.tag(ModBlockTags.ICE_SHARD_ORES)
                .add(ModBlocks.URANUS_ICE_SHARD_ORE.get());
    }
}
