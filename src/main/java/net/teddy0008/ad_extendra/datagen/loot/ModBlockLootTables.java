package net.teddy0008.ad_extendra.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
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
        this.dropSelf(ModBlocks.JUPERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_JUPERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.JUPITER_SAND.get());
        this.dropSelf(ModBlocks.JUPITER_STONE.get());
        this.add(ModBlocks.JUPITER_JUPERIUM_ORE.get(), createOreDrop(ModBlocks.JUPITER_JUPERIUM_ORE.get(), ModItems.RAW_JUPERIUM.get()));

        // this.add(ModBlocks.BLOCK.get(), block -> createOreDrop(ModBlocks.BLOCK.get(), ModItems.ITEM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
