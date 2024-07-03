package net.teddy0008.ad_extendra.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    // Jupiter
    public static final RegistryObject<Block> JUPERIUM_BLOCK = registerBlock("juperium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> RAW_JUPERIUM_BLOCK = registerBlock("raw_juperium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> JUPITER_JUPERIUM_ORE = registerBlock("jupiter_juperium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> JUPITER_COAL_ORE = registerBlock("jupiter_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> JUPITER_DIAMOND_ORE = registerBlock("jupiter_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> JUPITER_GOLD_ORE = registerBlock("jupiter_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<FallingBlock> JUPITER_SAND = registerBlock("jupiter_sand", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> JUPITER_STONE = registerBlock("jupiter_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> JUPITER_STONE_STAIRS = registerBlock("jupiter_stone_stairs", () -> new StairBlock(((Block)JUPITER_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> JUPITER_STONE_SLAB = registerBlock("jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> JUPITER_COBBLESTONE = registerBlock("jupiter_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> JUPITER_COBBLESTONE_STAIRS = registerBlock("jupiter_cobblestone_stairs", () -> new StairBlock(((Block)JUPITER_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> JUPITER_COBBLESTONE_SLAB = registerBlock("jupiter_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> JUPITER_STONE_BRICKS = registerBlock("jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> JUPITER_STONE_BRICK_STAIRS = registerBlock("jupiter_stone_brick_stairs", () -> new StairBlock(((Block)JUPITER_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> JUPITER_STONE_BRICK_SLAB = registerBlock("jupiter_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> JUPITER_STONE_BRICK_WALL = registerBlock("jupiter_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_JUPITER_STONE_BRICKS = registerBlock("cracked_jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_JUPITER_STONE_BRICKS = registerBlock("chiseled_jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_JUPITER_STONE_STAIRS = registerBlock("chiseled_jupiter_stone_stairs", () -> new StairBlock(((Block)CHISELED_JUPITER_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_JUPITER_STONE_SLAB = registerBlock("chiseled_jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_JUPITER_STONE = registerBlock("polished_jupiter_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_JUPITER_STONE_STAIRS = registerBlock("polished_jupiter_stone_stairs", () -> new StairBlock(((Block)POLISHED_JUPITER_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_JUPITER_STONE_SLAB = registerBlock("polished_jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> JUPITER_PILLAR = registerBlock("jupiter_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Ceres
    public static final RegistryObject<Block> CERES_COPPER_ORE = registerBlock("ceres_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> CERES_IRON_ORE = registerBlock("ceres_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<FallingBlock> CERES_SAND = registerBlock("ceres_sand", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> CERES_STONE = registerBlock("ceres_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> CERES_STONE_STAIRS = registerBlock("ceres_stone_stairs", () -> new StairBlock(((Block)CERES_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> CERES_STONE_SLAB = registerBlock("ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CERES_COBBLESTONE = registerBlock("ceres_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> CERES_COBBLESTONE_STAIRS = registerBlock("ceres_cobblestone_stairs", () -> new StairBlock(((Block)CERES_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> CERES_COBBLESTONE_SLAB = registerBlock("ceres_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> CERES_STONE_BRICKS = registerBlock("ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CERES_STONE_BRICK_STAIRS = registerBlock("ceres_stone_brick_stairs", () -> new StairBlock(((Block)CERES_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CERES_STONE_BRICK_SLAB = registerBlock("ceres_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> CERES_STONE_BRICK_WALL = registerBlock("ceres_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_CERES_STONE_BRICKS = registerBlock("cracked_ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_CERES_STONE_BRICKS = registerBlock("chiseled_ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_CERES_STONE_STAIRS = registerBlock("chiseled_ceres_stone_stairs", () -> new StairBlock(((Block)CHISELED_CERES_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_CERES_STONE_SLAB = registerBlock("chiseled_ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_CERES_STONE = registerBlock("polished_ceres_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_CERES_STONE_STAIRS = registerBlock("polished_ceres_stone_stairs", () -> new StairBlock(((Block)POLISHED_CERES_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_CERES_STONE_SLAB = registerBlock("polished_ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> CERES_PILLAR = registerBlock("ceres_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
