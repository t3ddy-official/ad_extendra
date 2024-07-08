package net.teddy0008.ad_extendra.item;

import earth.terrarium.ad_astra.common.item.vehicle.RocketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    // Jupiter
    public static final RegistryObject<Item> RAW_JUPERIUM = ITEMS.register("raw_juperium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_INGOT = ITEMS.register("juperium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_NUGGET = ITEMS.register("juperium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_PLATE = ITEMS.register("juperium_plate", () -> new Item(new Item.Properties()));

    // Saturn
    public static final RegistryObject<Item> RAW_SATURLYTE = ITEMS.register("raw_saturlyte", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATURLYTE_INGOT = ITEMS.register("saturlyte_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATURLYTE_NUGGET = ITEMS.register("saturlyte_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATURLYTE_PLATE = ITEMS.register("saturlyte_plate", () -> new Item(new Item.Properties()));

    // Uranus
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_PLATE = ITEMS.register("uranium_plate", () -> new Item(new Item.Properties()));

    // Neptune
    public static final RegistryObject<Item> RAW_NEPTUNIUM = ITEMS.register("raw_neptunium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_INGOT = ITEMS.register("neptunium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_NUGGET = ITEMS.register("neptunium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_PLATE = ITEMS.register("neptunium_plate", () -> new Item(new Item.Properties()));

    // Orcus
    public static final RegistryObject<Item> RAW_RADIUM = ITEMS.register("raw_radium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIUM_INGOT = ITEMS.register("radium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIUM_NUGGET = ITEMS.register("radium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIUM_PLATE = ITEMS.register("radium_plate", () -> new Item(new Item.Properties()));

    // Pluto
    public static final RegistryObject<Item> RAW_PLUTONIUM = ITEMS.register("raw_plutonium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_NUGGET = ITEMS.register("plutonium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_PLATE = ITEMS.register("plutonium_plate", () -> new Item(new Item.Properties()));

    // Sedna
    public static final RegistryObject<Item> RAW_ELECTROLYTE = ITEMS.register("raw_electrolyte", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTROLYTE_INGOT = ITEMS.register("electrolyte_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTROLYTE_NUGGET = ITEMS.register("electrolyte_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTROLYTE_PLATE = ITEMS.register("electrolyte_plate", () -> new Item(new Item.Properties()));
    // public static final RegistryObject<RocketItem> TIER_5_ROCKET = ITEMS.register("tier_5_rocket", () -> new RocketItem(5, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
