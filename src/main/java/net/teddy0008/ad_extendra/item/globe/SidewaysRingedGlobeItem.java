package net.teddy0008.ad_extendra.item.globe;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.teddy0008.ad_extendra.client.renderer.block.globe.SidewaysRingedGlobeRenderer;

import java.util.function.Consumer;

public class SidewaysRingedGlobeItem extends BlockItem {
    public SidewaysRingedGlobeItem(Block pBlock, Item.Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private SidewaysRingedGlobeRenderer.ItemRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if(this.renderer == null) {
                    renderer = new SidewaysRingedGlobeRenderer.ItemRenderer();
                }
                return this.renderer;
            }
        });
    }
}
