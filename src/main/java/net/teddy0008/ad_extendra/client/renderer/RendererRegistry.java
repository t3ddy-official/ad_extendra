package net.teddy0008.ad_extendra.client.renderer;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.client.renderer.block.globe.StandardGlobeRenderer;
import net.teddy0008.ad_extendra.item.ModItems;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class RendererRegistry {
    public static void onRegisterBlockRenderTypes(BiConsumer<RenderType, List<Block>> register) {
        ModBlocks.CERES_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.CERES_GLOBE.get()));
        });
    }

    public static void onRegisterItemRenderers(BiConsumer<ItemLike, BlockEntityWithoutLevelRenderer> register) {
        ModItems.CERES_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.CERES_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
    }

    public static void onRegisterModels(Consumer<ResourceLocation> register) {
        ModBlocks.CERES_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.CERES_GLOBE.getId().getPath() + "_cube"));
        });
    }
}
