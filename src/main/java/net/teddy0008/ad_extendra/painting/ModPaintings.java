package net.teddy0008.ad_extendra.painting;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class ModPaintings {
    public static final ResourcefulRegistry<PaintingVariant> PAINTING_VARIANTS = ResourcefulRegistries.create(BuiltInRegistries.PAINTING_VARIANT, "ad_astra");
    public static final RegistryEntry<PaintingVariant> CERES = PAINTING_VARIANTS.register("ceres", () -> {
        return new PaintingVariant(16, 16);
    });

    public ModPaintings() {
    }
}
