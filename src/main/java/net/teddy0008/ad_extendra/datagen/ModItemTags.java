package net.teddy0008.ad_extendra.datagen;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> FORGE_JUPERIUM_INGOTS = tag("forge", "ingots/juperium");
    public static final TagKey<Item> JUPERIUM_INGOTS = tag("ad_astra_platform", "juperium_ingots");
    public static final TagKey<Item> FORGE_JUPERIUM_BLOCKS = tag("forge", "storage_blocks/juperium");
    public static final TagKey<Item> JUPERIUM_BLOCKS = tag("ad_astra_platform", "juperium_blocks");
    public static final TagKey<Item> FORGE_JUPERIUM_PLATES = tag("forge", "plates/juperium");
    public static final TagKey<Item> JUPERIUM_PLATES = tag("ad_astra_platform", "juperium_plates");
    public static final TagKey<Item> JUPERIUM_NUGGETS = tag("forge", "nuggets/juperium");

    private static TagKey<Item> tag(String modid, String name) {
        return ItemTags.create(new ResourceLocation(modid, name));
    }
}
