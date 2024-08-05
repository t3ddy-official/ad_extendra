package net.teddy0008.ad_extendra.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.block.globe.*;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Main.MOD_ID);

    public static final RegistryObject<BlockEntityType<CustomSignBlockEntity>> SIGN =
            BLOCK_ENTITIES.register("sign", () ->
                    BlockEntityType.Builder.of(CustomSignBlockEntity::new,
                            ModBlocks.AERONOS_SIGN.get(), ModBlocks.AERONOS_WALL_SIGN.get(), ModBlocks.STROPHAR_SIGN.get(), ModBlocks.STROPHAR_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<CustomHangingSignBlockEntity>> HANGING_SIGN =
            BLOCK_ENTITIES.register("hanging_sign", () ->
                    BlockEntityType.Builder.of(CustomHangingSignBlockEntity::new,
                            ModBlocks.GLACIAN_HANGING_SIGN.get(), ModBlocks.GLACIAN_WALL_HANGING_SIGN.get(), ModBlocks.AERONOS_HANGING_SIGN.get(), ModBlocks.AERONOS_WALL_HANGING_SIGN.get(), ModBlocks.STROPHAR_HANGING_SIGN.get(), ModBlocks.STROPHAR_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<StandardGlobeBlockEntity>> STANDARD_GLOBE =
            BLOCK_ENTITIES.register("standard_globe", () ->
                    BlockEntityType.Builder.of(StandardGlobeBlockEntity::new,
                            ModBlocks.CERES_GLOBE.get(), ModBlocks.JUPITER_GLOBE.get(), ModBlocks.NEPTUNE_GLOBE.get(), ModBlocks.ORCUS_GLOBE.get(), ModBlocks.PLUTO_GLOBE.get(), ModBlocks.QUAOAR_GLOBE.get(), ModBlocks.MAKEMAKE_GLOBE.get(), ModBlocks.GONGGONG_GLOBE.get(), ModBlocks.ERIS_GLOBE.get(), ModBlocks.B_GLOBE.get()).build(null));

    public static final RegistryObject<BlockEntityType<RingedGlobeBlockEntity>> RINGED_GLOBE =
            BLOCK_ENTITIES.register("ringed_globe", () ->
                    BlockEntityType.Builder.of(RingedGlobeBlockEntity::new,
                            ModBlocks.SATURN_GLOBE.get()).build(null));

    public static final RegistryObject<BlockEntityType<SidewaysRingedGlobeBlockEntity>> SIDEWAYS_RINGED_GLOBE =
            BLOCK_ENTITIES.register("sideways_ringed_globe", () ->
                    BlockEntityType.Builder.of(SidewaysRingedGlobeBlockEntity::new,
                            ModBlocks.URANUS_GLOBE.get()).build(null));

    public static final RegistryObject<BlockEntityType<OvalGlobeBlockEntity>> OVAL_GLOBE =
            BLOCK_ENTITIES.register("oval_globe", () ->
                    BlockEntityType.Builder.of(OvalGlobeBlockEntity::new,
                            ModBlocks.HAUMEA_GLOBE.get()).build(null));

    public static final RegistryObject<BlockEntityType<EllipseGlobeBlockEntity>> ELLIPSE_GLOBE =
            BLOCK_ENTITIES.register("ellipse_globe", () ->
                    BlockEntityType.Builder.of(EllipseGlobeBlockEntity::new,
                            ModBlocks.SEDNA_GLOBE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
