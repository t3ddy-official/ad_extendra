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

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModEntityModelLayers.FREEZE_LAYER, FreezeModel::createBodyLayer);
        event.registerLayerDefinition(ModEntityModelLayers.GLACIAN_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModEntityModelLayers.GLACIAN_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }

    @SubscribeEvent
    public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
