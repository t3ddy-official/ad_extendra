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

    public static final RegistryObject<Item> RAW_JUPERIUM = ITEMS.register("raw_juperium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_INGOT = ITEMS.register("juperium_ingot", () -> new Item(new Item.Properties()));
    // public static final RegistryObject<RocketItem> TIER_5_ROCKET = ITEMS.register("tier5_rocket", () -> new RocketItem(5, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
