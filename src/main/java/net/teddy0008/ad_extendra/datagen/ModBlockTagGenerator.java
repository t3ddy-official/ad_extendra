package net.teddy0008.ad_extendra.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
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
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.JUPERIUM_BLOCK.get())
                .add(ModBlocks.JUPITER_JUPERIUM_ORE.get())
                .add(ModBlocks.RAW_JUPERIUM_BLOCK.get())
                .add(ModBlocks.JUPITER_STONE.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.JUPITER_SAND.get());
    }
}
