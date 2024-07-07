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
    public static final TagKey<Item> JUPERIUM_ORES = tag("forge", "ores/juperium");
    public static final TagKey<Item> ICE_SHARD_ORES = tag("forge", "ores/ice_shard");
    public static final TagKey<Item> JUPERIUM_RAW_MATERIALS = tag("forge", "raw_materials/juperium");
    public static final TagKey<Item> FORGE_SATURLYTE_INGOTS = tag("forge", "ingots/saturlyte");
    public static final TagKey<Item> SATURLYTE_INGOTS = tag("ad_astra_platform", "saturlyte_ingots");
    public static final TagKey<Item> FORGE_SATURLYTE_BLOCKS = tag("forge", "storage_blocks/saturlyte");
    public static final TagKey<Item> SATURLYTE_BLOCKS = tag("ad_astra_platform", "saturlyte_blocks");
    public static final TagKey<Item> FORGE_SATURLYTE_PLATES = tag("forge", "plates/saturlyte");
    public static final TagKey<Item> SATURLYTE_PLATES = tag("ad_astra_platform", "saturlyte_plates");
    public static final TagKey<Item> SATURLYTE_NUGGETS = tag("forge", "nuggets/saturlyte");
    public static final TagKey<Item> SATURLYTE_ORES = tag("forge", "ores/saturlyte");
    public static final TagKey<Item> SATURLYTE_RAW_MATERIALS = tag("forge", "raw_materials/saturlyte");
    public static final TagKey<Item> FORGE_URANIUM_INGOTS = tag("forge", "ingots/uranium");
    public static final TagKey<Item> URANIUM_INGOTS = tag("ad_astra_platform", "uranium_ingots");
    public static final TagKey<Item> FORGE_URANIUM_BLOCKS = tag("forge", "storage_blocks/uranium");
    public static final TagKey<Item> URANIUM_BLOCKS = tag("ad_astra_platform", "uranium_blocks");
    public static final TagKey<Item> FORGE_URANIUM_PLATES = tag("forge", "plates/uranium");
    public static final TagKey<Item> URANIUM_PLATES = tag("ad_astra_platform", "uranium_plates");
    public static final TagKey<Item> URANIUM_NUGGETS = tag("forge", "nuggets/uranium");
    public static final TagKey<Item> URANIUM_ORES = tag("forge", "ores/uranium");
    public static final TagKey<Item> URANIUM_RAW_MATERIALS = tag("forge", "raw_materials/uranium");
    public static final TagKey<Item> FORGE_NEPTUNIUM_INGOTS = tag("forge", "ingots/neptunium");
    public static final TagKey<Item> NEPTUNIUM_INGOTS = tag("ad_astra_platform", "neptunium_ingots");
    public static final TagKey<Item> FORGE_NEPTUNIUM_BLOCKS = tag("forge", "storage_blocks/neptunium");
    public static final TagKey<Item> NEPTUNIUM_BLOCKS = tag("ad_astra_platform", "neptunium_blocks");
    public static final TagKey<Item> FORGE_NEPTUNIUM_PLATES = tag("forge", "plates/neptunium");
    public static final TagKey<Item> NEPTUNIUM_PLATES = tag("ad_astra_platform", "neptunium_plates");
    public static final TagKey<Item> NEPTUNIUM_NUGGETS = tag("forge", "nuggets/neptunium");
    public static final TagKey<Item> NEPTUNIUM_ORES = tag("forge", "ores/neptunium");
    public static final TagKey<Item> NEPTUNIUM_RAW_MATERIALS = tag("forge", "raw_materials/neptunium");
    public static final TagKey<Item> FORGE_PLUTONIUM_INGOTS = tag("forge", "ingots/plutonium");
    public static final TagKey<Item> PLUTONIUM_INGOTS = tag("ad_astra_platform", "plutonium_ingots");
    public static final TagKey<Item> FORGE_PLUTONIUM_BLOCKS = tag("forge", "storage_blocks/plutonium");
    public static final TagKey<Item> PLUTONIUM_BLOCKS = tag("ad_astra_platform", "plutonium_blocks");
    public static final TagKey<Item> FORGE_PLUTONIUM_PLATES = tag("forge", "plates/plutonium");
    public static final TagKey<Item> PLUTONIUM_PLATES = tag("ad_astra_platform", "plutonium_plates");
    public static final TagKey<Item> PLUTONIUM_NUGGETS = tag("forge", "nuggets/plutonium");
    public static final TagKey<Item> PLUTONIUM_ORES = tag("forge", "ores/plutonium");
    public static final TagKey<Item> PLUTONIUM_RAW_MATERIALS = tag("forge", "raw_materials/plutonium");
    public static final TagKey<Item> PLATES = tag("forge", "plates");

    private static TagKey<Item> tag(String modid, String name) {
        return ItemTags.create(new ResourceLocation(modid, name));
    }
}
