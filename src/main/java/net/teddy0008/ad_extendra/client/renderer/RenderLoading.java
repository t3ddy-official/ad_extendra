package net.teddy0008.ad_extendra.client.renderer;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.ModelEvent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RenderLoading {
    private static final Map<Item, BlockEntityWithoutLevelRenderer> ITEM_RENDERERS = new HashMap();
    private static boolean hasInitializedRenderers = false;

    public RenderLoading() {
    }

    public static BlockEntityWithoutLevelRenderer getItemRenderer(ItemLike item) {
        return (BlockEntityWithoutLevelRenderer)ITEM_RENDERERS.get(item.asItem());
    }

    public static void registerItemRenderer(ItemLike item, BlockEntityWithoutLevelRenderer renderer) {
        ITEM_RENDERERS.put(item.asItem(), renderer);
    }

    public static void modelLoading(ModelEvent.RegisterAdditional event) {
        Objects.requireNonNull(event);
        RendererRegistry.onRegisterModels(event::register);
    }

    public static void onRegisterBlockRenderTypes(RenderType type, List<Block> blocks) {
        blocks.forEach((block) -> {
            ItemBlockRenderTypes.setRenderLayer(block, type);
        });
    }

    public static void initRenderers() {
        RendererRegistry.onRegisterItemRenderers(RenderLoading::registerItemRenderer);
        RendererRegistry.onRegisterBlockRenderTypes(RenderLoading::onRegisterBlockRenderTypes);
        hasInitializedRenderers = true;
    }
}
