package net.teddy0008.ad_extendra.entity;

import earth.terrarium.ad_astra.AdAstra;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.entity.vehicle.RocketTier5;
import net.teddy0008.ad_extendra.entity.vehicle.RocketTier6;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Main.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ROCKETS = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AdAstra.MOD_ID);

    public static final RegistryObject<EntityType<RocketTier5>> TIER_5_ROCKET = ROCKETS.register("tier_5_rocket", () ->
            EntityType.Builder.<RocketTier5>of(RocketTier5::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.0f)
                    .build("tier_5_rocket"));

    public static final RegistryObject<EntityType<RocketTier6>> TIER_6_ROCKET = ROCKETS.register("tier_6_rocket", () ->
            EntityType.Builder.<RocketTier6>of(RocketTier6::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.0f)
                    .build("tier_5_rocket"));

    public static void register(IEventBus eventBus) {
        ROCKETS.register(eventBus);
    }
}
