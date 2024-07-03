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
        this.dropSelf(ModBlocks.JUPITER_SAND.get());
        this.dropSelf(ModBlocks.JUPITER_STONE.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_COBBLESTONE.get());
        this.dropSelf(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_PILLAR.get());
        this.add(ModBlocks.JUPITER_JUPERIUM_ORE.get(), createOreDrop(ModBlocks.JUPITER_JUPERIUM_ORE.get(), ModItems.RAW_JUPERIUM.get()));
        this.add(ModBlocks.JUPITER_COAL_ORE.get(), createOreDrop(ModBlocks.JUPITER_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.JUPITER_DIAMOND_ORE.get(), createOreDrop(ModBlocks.JUPITER_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.JUPITER_GOLD_ORE.get(), createOreDrop(ModBlocks.JUPITER_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.JUPITER_STONE.get(), createStoneLikeDrop(ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_COBBLESTONE.get()));
        this.add(ModBlocks.JUPITER_STONE_SLAB.get(), createSlabItemTable(ModBlocks.JUPITER_STONE.get()));
        this.add(ModBlocks.JUPITER_COBBLESTONE_SLAB.get(), createSlabItemTable(ModBlocks.JUPITER_COBBLESTONE.get()));
        this.add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), createSlabItemTable(ModBlocks.JUPITER_STONE_BRICKS.get()));
        this.add(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get(), createSlabItemTable(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()));
        this.add(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get(), createSlabItemTable(ModBlocks.POLISHED_JUPITER_STONE.get()));

        // Ceres
        this.dropSelf(ModBlocks.CERES_SAND.get());
        this.dropSelf(ModBlocks.CERES_STONE.get());
        this.dropSelf(ModBlocks.CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CERES_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_CERES_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_PILLAR.get());
        this.add(ModBlocks.CERES_COPPER_ORE.get(), createCopperOreDrops(ModBlocks.CERES_COPPER_ORE.get()));
        this.add(ModBlocks.CERES_IRON_ORE.get(), createOreDrop(ModBlocks.CERES_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.CERES_STONE.get(), createStoneLikeDrop(ModBlocks.CERES_STONE.get(), ModBlocks.CERES_COBBLESTONE.get()));
        this.add(ModBlocks.CERES_STONE_SLAB.get(), createSlabItemTable(ModBlocks.CERES_STONE.get()));
        this.add(ModBlocks.CERES_COBBLESTONE_SLAB.get(), createSlabItemTable(ModBlocks.CERES_COBBLESTONE.get()));
        this.add(ModBlocks.CERES_STONE_BRICK_SLAB.get(), createSlabItemTable(ModBlocks.CERES_STONE_BRICKS.get()));
        this.add(ModBlocks.CHISELED_CERES_STONE_SLAB.get(), createSlabItemTable(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()));
        this.add(ModBlocks.POLISHED_CERES_STONE_SLAB.get(), createSlabItemTable(ModBlocks.POLISHED_CERES_STONE.get()));
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
