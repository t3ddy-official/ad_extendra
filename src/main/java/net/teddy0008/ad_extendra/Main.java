package net.teddy0008.ad_extendra;

import com.mojang.logging.LogUtils;
import earth.terrarium.botarium.client.ClientHooks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5.RocketRendererTier5;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6.RocketRendererTier6;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7.RocketRendererTier7;
import net.teddy0008.ad_extendra.entity.ModEntities;
import net.teddy0008.ad_extendra.item.ModCreativeTabs;
import net.teddy0008.ad_extendra.item.ModItems;
import net.teddy0008.ad_extendra.painting.ModPaintings;
import org.slf4j.Logger;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "ad_extendra";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);

        ModPaintings.PAINTING_VARIANTS.init();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        /* if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

        } */
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    public static void registerEntityRenderers() {
        ClientHooks.registerEntityRenderer(ModEntities.TIER_5_ROCKET, RocketRendererTier5::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_6_ROCKET, RocketRendererTier6::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_7_ROCKET, RocketRendererTier7::new);
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SATURN_ICE.get(), RenderType.translucent());
            registerEntityRenderers();
        }
    }
}
