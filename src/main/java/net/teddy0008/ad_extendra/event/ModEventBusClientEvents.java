package net.teddy0008.ad_extendra.event;

import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.entity.ModBlockEntities;
import net.teddy0008.ad_extendra.client.renderer.entity.ModEntityModelLayers;
import net.teddy0008.ad_extendra.client.renderer.entity.mob.freeze.FreezeModel;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10.RocketModelTier10;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11.RocketModelTier11;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5.RocketModelTier5;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6.RocketModelTier6;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7.RocketModelTier7;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_8.RocketModelTier8;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_9.RocketModelTier9;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModEntityModelLayers.FREEZE_LAYER, FreezeModel::createBodyLayer);
        event.registerLayerDefinition(ModEntityModelLayers.GLACIAN_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModEntityModelLayers.GLACIAN_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(RocketModelTier5.LAYER_LOCATION, RocketModelTier5::createBodyLayer);
        event.registerLayerDefinition(RocketModelTier6.LAYER_LOCATION, RocketModelTier6::createBodyLayer);
        event.registerLayerDefinition(RocketModelTier7.LAYER_LOCATION, RocketModelTier7::createBodyLayer);
        event.registerLayerDefinition(RocketModelTier8.LAYER_LOCATION, RocketModelTier8::createBodyLayer);
        event.registerLayerDefinition(RocketModelTier9.LAYER_LOCATION, RocketModelTier9::createBodyLayer);
        event.registerLayerDefinition(RocketModelTier10.LAYER_LOCATION, RocketModelTier10::createBodyLayer);
        event.registerLayerDefinition(RocketModelTier11.LAYER_LOCATION, RocketModelTier11::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
