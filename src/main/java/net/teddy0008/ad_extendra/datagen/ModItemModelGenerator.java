package net.teddy0008.ad_extendra.datagen;

import earth.terrarium.ad_astra.common.item.vehicle.RocketItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.item.ModItems;

public class ModItemModelGenerator extends ItemModelProvider {
    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_JUPERIUM);
        simpleItem(ModItems.JUPERIUM_INGOT);

        stairsItem(ModBlocks.JUPITER_STONE_STAIRS, "jupiter_stone");
        slabItem(ModBlocks.JUPITER_STONE_SLAB, "jupiter_stone");
        stairsItem(ModBlocks.JUPITER_COBBLESTONE_STAIRS, "jupiter_cobblestone");
        slabItem(ModBlocks.JUPITER_COBBLESTONE_SLAB, "jupiter_cobblestone");
        stairsItem(ModBlocks.JUPITER_STONE_BRICK_STAIRS, "jupiter_stone_brick");
        slabItem(ModBlocks.JUPITER_STONE_BRICK_SLAB, "jupiter_stone_brick");
        wallItem(ModBlocks.JUPITER_STONE_BRICK_WALL, ModBlocks.JUPITER_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_JUPITER_STONE_STAIRS, "chiseled_jupiter_stone");
        slabItem(ModBlocks.CHISELED_JUPITER_STONE_SLAB, "chiseled_jupiter_stone");
        stairsItem(ModBlocks.POLISHED_JUPITER_STONE_STAIRS, "polished_jupiter_stone");
        slabItem(ModBlocks.POLISHED_JUPITER_STONE_SLAB, "polished_jupiter_stone");
        pillarItem(ModBlocks.JUPITER_PILLAR, "jupiter");
        stairsItem(ModBlocks.CERES_STONE_STAIRS, "ceres_stone");
        slabItem(ModBlocks.CERES_STONE_SLAB, "ceres_stone");
        stairsItem(ModBlocks.CERES_COBBLESTONE_STAIRS, "ceres_cobblestone");
        slabItem(ModBlocks.CERES_COBBLESTONE_SLAB, "ceres_cobblestone");
        stairsItem(ModBlocks.CERES_STONE_BRICK_STAIRS, "ceres_stone_brick");
        slabItem(ModBlocks.CERES_STONE_BRICK_SLAB, "ceres_stone_brick");
        wallItem(ModBlocks.CERES_STONE_BRICK_WALL, ModBlocks.CERES_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_CERES_STONE_STAIRS, "chiseled_ceres_stone");
        slabItem(ModBlocks.CHISELED_CERES_STONE_SLAB, "chiseled_ceres_stone");
        stairsItem(ModBlocks.POLISHED_CERES_STONE_STAIRS, "polished_ceres_stone");
        slabItem(ModBlocks.POLISHED_CERES_STONE_SLAB, "polished_ceres_stone");
        pillarItem(ModBlocks.CERES_PILLAR, "ceres");
        // rocketItem(ModItems.TIER_5_ROCKET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Main.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void wallItem(RegistryObject<WallBlock> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(Main.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void stairsItem(RegistryObject<StairBlock> block, String stairsType) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + stairsType + "_stairs"));
    }

    public void slabItem(RegistryObject<SlabBlock> block, String slabType) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + slabType + "_slab"));
    }

    public void pillarItem(RegistryObject<RotatedPillarBlock> block, String pillarType) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + pillarType + "_pillar"));
    }

    private ItemModelBuilder rocketItem(RegistryObject<RocketItem> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Main.MOD_ID, "item/" + item.getId().getPath()));
    }
}
