package net.teddy0008.ad_extendra.client.renderer.entity;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.teddy0008.ad_extendra.Main;

public class ModEntityModelLayers {
    public static final ModelLayerLocation FREEZE_LAYER = new ModelLayerLocation(
            new ResourceLocation(Main.MOD_ID, "freeze_layer"), "main");
    public static final ModelLayerLocation ICE_CHARGE_LAYER = new ModelLayerLocation(
            new ResourceLocation(Main.MOD_ID, "ice_charge_layer"), "main");
    public static final ModelLayerLocation GLACIAN_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(Main.MOD_ID, "boat/glacian"), "main");
    public static final ModelLayerLocation GLACIAN_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(Main.MOD_ID, "chest_boat/glacian"), "main");
}
