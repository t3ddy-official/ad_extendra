package net.teddy0008.ad_extendra.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.datagen.ModItemModelGenerator;
import net.teddy0008.ad_extendra.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // Jupiter
        this.dropSelf(ModBlocks.JUPERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_JUPERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING_STAIRS.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING_SLAB.get());
        this.dropSelf(ModBlocks.JUPERIUM_PILLAR.get());
        this.dropSelf(ModBlocks.GLOWING_JUPERIUM_PILLAR.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING_BUTTON.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.JUPITER_SAND.get());
        this.dropSelf(ModBlocks.JUPITER_STONE.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_SLAB.get());
        this.dropSelf(ModBlocks.JUPITER_COBBLESTONE.get());
        this.dropSelf(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get());
        this.dropSelf(ModBlocks.JUPITER_PILLAR.get());
        this.add(ModBlocks.JUPITER_JUPERIUM_ORE.get(), createOreDrop(ModBlocks.JUPITER_JUPERIUM_ORE.get(), ModItems.RAW_JUPERIUM.get()));
        this.add(ModBlocks.JUPITER_COAL_ORE.get(), createOreDrop(ModBlocks.JUPITER_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.JUPITER_DIAMOND_ORE.get(), createOreDrop(ModBlocks.JUPITER_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.JUPITER_GOLD_ORE.get(), createOreDrop(ModBlocks.JUPITER_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.JUPITER_STONE.get(), createStoneLikeDrop(ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_COBBLESTONE.get()));

        // Ceres
        this.dropSelf(ModBlocks.CERES_SAND.get());
        this.dropSelf(ModBlocks.CERES_STONE.get());
        this.dropSelf(ModBlocks.CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_STONE_SLAB.get());
        this.dropSelf(ModBlocks.CERES_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CERES_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_CERES_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_CERES_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_CERES_STONE_SLAB.get());
        this.dropSelf(ModBlocks.CERES_PILLAR.get());
        this.add(ModBlocks.CERES_COPPER_ORE.get(), createCopperOreDrops(ModBlocks.CERES_COPPER_ORE.get()));
        this.add(ModBlocks.CERES_IRON_ORE.get(), createOreDrop(ModBlocks.CERES_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.CERES_STONE.get(), createStoneLikeDrop(ModBlocks.CERES_STONE.get(), ModBlocks.CERES_COBBLESTONE.get()));

        // Saturn
        this.dropSelf(ModBlocks.SATURN_SAND.get());
        this.dropSelf(ModBlocks.SATURN_ICE.get());
        this.dropSelf(ModBlocks.SATURN_STONE.get());
        this.dropSelf(ModBlocks.SATURN_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.SATURN_STONE_SLAB.get());
        this.dropSelf(ModBlocks.SATURN_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SATURN_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.SATURN_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.SATURN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.SATURN_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.SATURN_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.SATURN_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_SATURN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_SATURN_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_SATURN_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_SATURN_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_SATURN_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_SATURN_STONE_SLAB.get());
        this.dropSelf(ModBlocks.SATURN_PILLAR.get());
        this.add(ModBlocks.SATURN_STONE.get(), createStoneLikeDrop(ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_COBBLESTONE.get()));

        // Uranus
        this.dropSelf(ModBlocks.URANUS_STONE.get());
        this.dropSelf(ModBlocks.URANUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.URANUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.URANUS_COBBLESTONE.get());
        this.dropSelf(ModBlocks.URANUS_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.URANUS_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.URANUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.URANUS_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.URANUS_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.URANUS_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_URANUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_URANUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_URANUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_URANUS_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_URANUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_URANUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.URANUS_PILLAR.get());
        this.add(ModBlocks.URANUS_ICE_SHARD_ORE.get(), createOreDrop(ModBlocks.URANUS_ICE_SHARD_ORE.get(), earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get()));
        this.add(ModBlocks.URANUS_STONE.get(), createStoneLikeDrop(ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_COBBLESTONE.get()));

        // Neptune
        this.dropSelf(ModBlocks.NEPTUNE_STONE.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_NEPTUNE_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNE_PILLAR.get());
        this.add(ModBlocks.NEPTUNE_STONE.get(), createStoneLikeDrop(ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_COBBLESTONE.get()));

        // Orcus
        this.dropSelf(ModBlocks.ORCUS_STONE.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ORCUS_COBBLESTONE.get());
        this.dropSelf(ModBlocks.ORCUS_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORCUS_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_ORCUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_ORCUS_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_ORCUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ORCUS_PILLAR.get());
        this.add(ModBlocks.ORCUS_STONE.get(), createStoneLikeDrop(ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_COBBLESTONE.get()));

        // Pluto
        this.dropSelf(ModBlocks.PLUTO_SAND.get());
        this.dropSelf(ModBlocks.PLUTO_STONE.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_SLAB.get());
        this.dropSelf(ModBlocks.PLUTO_COBBLESTONE.get());
        this.dropSelf(ModBlocks.PLUTO_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PLUTO_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_PLUTO_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_PLUTO_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_PLUTO_STONE_SLAB.get());
        this.dropSelf(ModBlocks.PLUTO_PILLAR.get());
        this.add(ModBlocks.PLUTO_STONE.get(), createStoneLikeDrop(ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_COBBLESTONE.get()));

        // Haumea
        this.dropSelf(ModBlocks.HAUMEA_STONE.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.HAUMEA_COBBLESTONE.get());
        this.dropSelf(ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.HAUMEA_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_HAUMEA_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.HAUMEA_PILLAR.get());
        this.add(ModBlocks.HAUMEA_STONE.get(), createStoneLikeDrop(ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_COBBLESTONE.get()));

        // Quaoar
        this.dropSelf(ModBlocks.QUAOAR_STONE.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_SLAB.get());
        this.dropSelf(ModBlocks.QUAOAR_COBBLESTONE.get());
        this.dropSelf(ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.QUAOAR_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_QUAOAR_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get());
        this.dropSelf(ModBlocks.QUAOAR_PILLAR.get());
        this.add(ModBlocks.QUAOAR_STONE.get(), createStoneLikeDrop(ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_COBBLESTONE.get()));

        // Makemake
        this.dropSelf(ModBlocks.MAKEMAKE_STONE.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.MAKEMAKE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_MAKEMAKE_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.MAKEMAKE_PILLAR.get());
        this.add(ModBlocks.MAKEMAKE_STONE.get(), createStoneLikeDrop(ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE.get()));

        // Gonggong
        this.dropSelf(ModBlocks.GONGGONG_STONE.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_SLAB.get());
        this.dropSelf(ModBlocks.GONGGONG_COBBLESTONE.get());
        this.dropSelf(ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.GONGGONG_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_GONGGONG_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get());
        this.dropSelf(ModBlocks.GONGGONG_PILLAR.get());
        this.add(ModBlocks.GONGGONG_STONE.get(), createStoneLikeDrop(ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_COBBLESTONE.get()));

        // Eris
        this.dropSelf(ModBlocks.ERIS_STONE.get());
        this.dropSelf(ModBlocks.ERIS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.ERIS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ERIS_COBBLESTONE.get());
        this.dropSelf(ModBlocks.ERIS_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.ERIS_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.ERIS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.ERIS_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ERIS_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ERIS_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_ERIS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_ERIS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_ERIS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_ERIS_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_ERIS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_ERIS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ERIS_PILLAR.get());
        this.add(ModBlocks.ERIS_STONE.get(), createStoneLikeDrop(ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_COBBLESTONE.get()));

        // Sedna
        this.dropSelf(ModBlocks.SEDNA_STONE.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.SEDNA_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SEDNA_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.SEDNA_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_SEDNA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_SEDNA_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_SEDNA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.SEDNA_PILLAR.get());
        this.add(ModBlocks.SEDNA_STONE.get(), createStoneLikeDrop(ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_COBBLESTONE.get()));

        // Proxima Centauri b
        this.dropSelf(ModBlocks.B_SAND.get());
        this.dropSelf(ModBlocks.B_STONE.get());
        this.dropSelf(ModBlocks.B_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.B_STONE_SLAB.get());
        this.dropSelf(ModBlocks.B_COBBLESTONE.get());
        this.dropSelf(ModBlocks.B_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.B_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.B_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.B_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.B_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.B_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_B_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_B_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_B_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_B_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_B_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_B_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_B_STONE_SLAB.get());
        this.dropSelf(ModBlocks.B_PILLAR.get());
        this.add(ModBlocks.B_STONE.get(), createStoneLikeDrop(ModBlocks.B_STONE.get(), ModBlocks.B_COBBLESTONE.get()));
        // this.add(ModBlocks.BLOCK.get(), block -> createOreDrop(ModBlocks.BLOCK.get(), ModItems.ITEM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createStoneLikeDrop(Block pSilkBlock, Block pNonSilkBlock) {
        return createSilkTouchDispatchTable(pSilkBlock, (LootPoolEntryContainer.Builder)this.applyExplosionDecay(pSilkBlock, LootItem.lootTableItem(pNonSilkBlock)));
    }
}
