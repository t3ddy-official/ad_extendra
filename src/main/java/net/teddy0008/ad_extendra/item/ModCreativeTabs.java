package net.teddy0008.ad_extendra.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AD_EXTENDRA = CREATIVE_TABS.register("ad_extendra", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.JUPERIUM_INGOT.get()))
            .title(Component.translatable("creativetab.ad_extendra"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModBlocks.JUPITER_SAND.get());
                output.accept(ModBlocks.JUPITER_STONE.get());
                output.accept(ModBlocks.JUPITER_JUPERIUM_ORE.get());
                output.accept(ModItems.RAW_JUPERIUM.get());
                output.accept(ModBlocks.RAW_JUPERIUM_BLOCK.get());
                output.accept(ModItems.JUPERIUM_INGOT.get());
                output.accept(ModBlocks.JUPERIUM_BLOCK.get());
                output.accept(ModItems.TIER_5_ROCKET.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
