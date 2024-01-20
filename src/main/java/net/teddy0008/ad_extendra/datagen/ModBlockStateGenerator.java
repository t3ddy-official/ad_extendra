package net.teddy0008.ad_extendra.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
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
        blockWithItem(ModBlocks.JUPITER_COBBLESTONE);

        // Ceres
        blockWithItem(ModBlocks.CERES_COPPER_ORE);
        blockWithItem(ModBlocks.CERES_IRON_ORE);
        fallingBlockWithItem(ModBlocks.CERES_SAND);
        blockWithItem(ModBlocks.CERES_STONE);
        blockWithItem(ModBlocks.CERES_COBBLESTONE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


    private void fallingBlockWithItem(RegistryObject<FallingBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
