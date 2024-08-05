package net.teddy0008.ad_extendra.client.renderer;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.client.renderer.block.globe.*;
import net.teddy0008.ad_extendra.item.ModItems;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class RendererRegistry {
    public static void onRegisterBlockRenderTypes(BiConsumer<RenderType, List<Block>> register) {
        ModBlocks.CERES_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.CERES_GLOBE.get()));
        });
        ModBlocks.JUPITER_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.JUPITER_GLOBE.get()));
        });
        ModBlocks.SATURN_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.SATURN_GLOBE.get()));
        });
        ModBlocks.URANUS_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.URANUS_GLOBE.get()));
        });
        ModBlocks.NEPTUNE_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.NEPTUNE_GLOBE.get()));
        });
        ModBlocks.ORCUS_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.ORCUS_GLOBE.get()));
        });
        ModBlocks.PLUTO_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.PLUTO_GLOBE.get()));
        });
        ModBlocks.HAUMEA_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.HAUMEA_GLOBE.get()));
        });
        ModBlocks.QUAOAR_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.QUAOAR_GLOBE.get()));
        });
        ModBlocks.MAKEMAKE_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.MAKEMAKE_GLOBE.get()));
        });
        ModBlocks.GONGGONG_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.GONGGONG_GLOBE.get()));
        });
        ModBlocks.ERIS_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.ERIS_GLOBE.get()));
        });
        ModBlocks.SEDNA_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.SEDNA_GLOBE.get()));
        });
        ModBlocks.B_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.B_GLOBE.get()));
        });
    }

    public static void onRegisterItemRenderers(BiConsumer<ItemLike, BlockEntityWithoutLevelRenderer> register) {
        ModItems.CERES_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.CERES_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.JUPITER_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.JUPITER_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.SATURN_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.SATURN_GLOBE.get(), new RingedGlobeRenderer.ItemRenderer());
        });
        ModItems.URANUS_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.URANUS_GLOBE.get(), new SidewaysRingedGlobeRenderer.ItemRenderer());
        });
        ModItems.NEPTUNE_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.NEPTUNE_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.ORCUS_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.ORCUS_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.PLUTO_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.PLUTO_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.HAUMEA_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.HAUMEA_GLOBE.get(), new OvalGlobeRenderer.ItemRenderer());
        });
        ModItems.QUAOAR_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.QUAOAR_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.MAKEMAKE_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.MAKEMAKE_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.GONGGONG_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.GONGGONG_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.ERIS_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.ERIS_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
        ModItems.SEDNA_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.SEDNA_GLOBE.get(), new EllipseGlobeRenderer.ItemRenderer());
        });
        ModItems.B_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.B_GLOBE.get(), new StandardGlobeRenderer.ItemRenderer());
        });
    }

    public static void onRegisterModels(Consumer<ResourceLocation> register) {
        ModBlocks.CERES_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.CERES_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.JUPITER_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.JUPITER_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.SATURN_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.SATURN_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.URANUS_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.URANUS_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.NEPTUNE_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.NEPTUNE_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.ORCUS_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.ORCUS_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.PLUTO_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.PLUTO_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.HAUMEA_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.HAUMEA_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.QUAOAR_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.QUAOAR_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.MAKEMAKE_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.MAKEMAKE_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.GONGGONG_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.GONGGONG_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.ERIS_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.ERIS_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.SEDNA_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.SEDNA_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.B_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.B_GLOBE.getId().getPath() + "_cube"));
        });
    }
}
