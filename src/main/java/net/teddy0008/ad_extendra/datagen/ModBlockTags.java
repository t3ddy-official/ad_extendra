package net.teddy0008.ad_extendra.datagen;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> JUPERIUM_BLOCKS = tag("forge", "storage_blocks/juperium");

    private static TagKey<Block> tag(String modid, String name) {
        return BlockTags.create(new ResourceLocation(modid, name));
    }
}
