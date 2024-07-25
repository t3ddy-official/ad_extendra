package net.teddy0008.ad_extendra;

import com.mojang.logging.LogUtils;
import earth.terrarium.botarium.client.ClientHooks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
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
import net.teddy0008.ad_extendra.block.entity.ModBlockEntities;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.boat.CustomBoatRenderer;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10.RocketRendererTier10;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11.RocketRendererTier11;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5.RocketRendererTier5;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6.RocketRendererTier6;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7.RocketRendererTier7;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_8.RocketRendererTier8;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_9.RocketRendererTier9;
import net.teddy0008.ad_extendra.entity.ModEntities;
import net.teddy0008.ad_extendra.item.ModCreativeTabs;
import net.teddy0008.ad_extendra.item.ModItems;
import net.teddy0008.ad_extendra.loot.ModLootModifiers;
import net.teddy0008.ad_extendra.painting.ModPaintings;
import net.teddy0008.ad_extendra.util.ModWoodTypes;
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
        ModBlockEntities.register(modEventBus);
        ModEntities.register(modEventBus);
        ModLootModifiers.register(modEventBus);

        ModPaintings.PAINTING_VARIANTS.init();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GLACIAN_SAPLING.getId(), ModBlocks.POTTED_GLACIAN_SAPLING);
        });
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
        EntityRenderers.register(ModEntities.BOAT.get(), pContext -> new CustomBoatRenderer(pContext, false));
        EntityRenderers.register(ModEntities.CHEST_BOAT.get(), pContext -> new CustomBoatRenderer(pContext, true));

        ClientHooks.registerEntityRenderer(ModEntities.TIER_5_ROCKET, RocketRendererTier5::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_6_ROCKET, RocketRendererTier6::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_7_ROCKET, RocketRendererTier7::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_8_ROCKET, RocketRendererTier8::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_9_ROCKET, RocketRendererTier9::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_10_ROCKET, RocketRendererTier10::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_11_ROCKET, RocketRendererTier11::new);
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SATURN_ICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLACIAN_SAPLING.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_GLACIAN_SAPLING.get(), RenderType.cutoutMipped());
            registerEntityRenderers();

            Sheets.addWoodType(ModWoodTypes.GLACIAN);
            Sheets.addWoodType(ModWoodTypes.AERONOS);
            Sheets.addWoodType(ModWoodTypes.STROPHAR);
        }
    }
}
