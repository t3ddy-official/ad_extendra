package net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11;

import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.rocket.tier_4.RocketModelTier4;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.entity.vehicle.RocketTier11;
import org.jetbrains.annotations.NotNull;

public class RocketRendererTier11 extends VehicleRenderer<RocketTier11, RocketModelTier11> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/vehicles/tier_11_rocket.png");

    public RocketRendererTier11(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier11(context.bakeLayer(RocketModelTier4.LAYER_LOCATION)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(RocketTier11 entity) {
        return TEXTURE;
    }
}
