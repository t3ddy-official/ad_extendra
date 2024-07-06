package net.teddy0008.ad_extendra.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AD_EXTENDRA = CREATIVE_TABS.register("ad_extendra", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.JUPERIUM_INGOT.get()))
            .title(Component.translatable("creativetab.ad_extendra"))
            .displayItems((itemDisplayParameters, output) -> {
                // Ceres
                output.accept(ModBlocks.CERES_SAND.get());
                output.accept(ModBlocks.CERES_STONE.get());
                output.accept(ModBlocks.CERES_STONE_STAIRS.get());
                output.accept(ModBlocks.CERES_STONE_SLAB.get());
                output.accept(ModBlocks.CERES_COBBLESTONE.get());
                output.accept(ModBlocks.CERES_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.CERES_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.CERES_STONE_BRICKS.get());
                output.accept(ModBlocks.CERES_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.CERES_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.CERES_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_CERES_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_CERES_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_CERES_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_CERES_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_CERES_STONE.get());
                output.accept(ModBlocks.POLISHED_CERES_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_CERES_STONE_SLAB.get());
                output.accept(ModBlocks.CERES_PILLAR.get());
                output.accept(ModBlocks.CERES_COPPER_ORE.get());
                output.accept(ModBlocks.CERES_IRON_ORE.get());

                // Jupiter
                output.accept(ModBlocks.JUPITER_SAND.get());
                output.accept(ModBlocks.JUPITER_STONE.get());
                output.accept(ModBlocks.JUPITER_STONE_STAIRS.get());
                output.accept(ModBlocks.JUPITER_STONE_SLAB.get());
                output.accept(ModBlocks.JUPITER_COBBLESTONE.get());
                output.accept(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.JUPITER_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.JUPITER_STONE_BRICKS.get());
                output.accept(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.JUPITER_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.JUPITER_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_JUPITER_STONE.get());
                output.accept(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get());
                output.accept(ModBlocks.JUPITER_PILLAR.get());
                output.accept(ModBlocks.JUPITER_JUPERIUM_ORE.get());
                output.accept(ModBlocks.JUPITER_COAL_ORE.get());
                output.accept(ModBlocks.JUPITER_GOLD_ORE.get());
                output.accept(ModBlocks.JUPITER_DIAMOND_ORE.get());
                output.accept(ModItems.RAW_JUPERIUM.get());
                output.accept(ModBlocks.RAW_JUPERIUM_BLOCK.get());
                output.accept(ModItems.JUPERIUM_INGOT.get());
                output.accept(ModItems.JUPERIUM_PLATE.get());
                output.accept(ModItems.JUPERIUM_NUGGET.get());
                output.accept(ModBlocks.JUPERIUM_BLOCK.get());
                output.accept(ModBlocks.JUPERIUM_PLATING.get());
                output.accept(ModBlocks.JUPERIUM_PLATING_STAIRS.get());
                output.accept(ModBlocks.JUPERIUM_PLATING_SLAB.get());
                output.accept(ModBlocks.JUPERIUM_PLATING_BUTTON.get());
                output.accept(ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get());
                output.accept(ModBlocks.JUPERIUM_PILLAR.get());
                output.accept(ModBlocks.GLOWING_JUPERIUM_PILLAR.get());

                // Saturn
                output.accept(ModBlocks.SATURN_SAND.get());
                output.accept(ModBlocks.SATURN_ICE.get());
                output.accept(ModBlocks.SATURN_STONE.get());
                output.accept(ModBlocks.SATURN_STONE_STAIRS.get());
                output.accept(ModBlocks.SATURN_STONE_SLAB.get());
                output.accept(ModBlocks.SATURN_COBBLESTONE.get());
                output.accept(ModBlocks.SATURN_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.SATURN_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.SATURN_STONE_BRICKS.get());
                output.accept(ModBlocks.SATURN_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.SATURN_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.SATURN_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_SATURN_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_SATURN_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_SATURN_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_SATURN_STONE.get());
                output.accept(ModBlocks.POLISHED_SATURN_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_SATURN_STONE_SLAB.get());
                output.accept(ModBlocks.SATURN_PILLAR.get());

                // Uranus
                output.accept(ModBlocks.URANUS_STONE.get());
                output.accept(ModBlocks.URANUS_STONE_STAIRS.get());
                output.accept(ModBlocks.URANUS_STONE_SLAB.get());
                output.accept(ModBlocks.URANUS_COBBLESTONE.get());
                output.accept(ModBlocks.URANUS_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.URANUS_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.URANUS_STONE_BRICKS.get());
                output.accept(ModBlocks.URANUS_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.URANUS_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.URANUS_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_URANUS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_URANUS_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_URANUS_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_URANUS_STONE.get());
                output.accept(ModBlocks.POLISHED_URANUS_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_URANUS_STONE_SLAB.get());
                output.accept(ModBlocks.URANUS_PILLAR.get());
                output.accept(ModBlocks.URANUS_ICE_SHARD_ORE.get());

                // Neptune
                output.accept(ModBlocks.NEPTUNE_STONE.get());
                output.accept(ModBlocks.NEPTUNE_STONE_STAIRS.get());
                output.accept(ModBlocks.NEPTUNE_STONE_SLAB.get());
                output.accept(ModBlocks.NEPTUNE_COBBLESTONE.get());
                output.accept(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.NEPTUNE_STONE_BRICKS.get());
                output.accept(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.NEPTUNE_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_NEPTUNE_STONE.get());
                output.accept(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get());
                output.accept(ModBlocks.NEPTUNE_PILLAR.get());

                // Orcus
                output.accept(ModBlocks.ORCUS_STONE.get());
                output.accept(ModBlocks.ORCUS_STONE_STAIRS.get());
                output.accept(ModBlocks.ORCUS_STONE_SLAB.get());
                output.accept(ModBlocks.ORCUS_COBBLESTONE.get());
                output.accept(ModBlocks.ORCUS_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.ORCUS_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.ORCUS_STONE_BRICKS.get());
                output.accept(ModBlocks.ORCUS_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.ORCUS_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.ORCUS_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_ORCUS_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_ORCUS_STONE.get());
                output.accept(ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_ORCUS_STONE_SLAB.get());
                output.accept(ModBlocks.ORCUS_PILLAR.get());

                // Pluto
                output.accept(ModBlocks.PLUTO_SAND.get());
                output.accept(ModBlocks.PLUTO_STONE.get());
                output.accept(ModBlocks.PLUTO_STONE_STAIRS.get());
                output.accept(ModBlocks.PLUTO_STONE_SLAB.get());
                output.accept(ModBlocks.PLUTO_COBBLESTONE.get());
                output.accept(ModBlocks.PLUTO_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.PLUTO_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.PLUTO_STONE_BRICKS.get());
                output.accept(ModBlocks.PLUTO_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.PLUTO_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.PLUTO_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_PLUTO_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_PLUTO_STONE.get());
                output.accept(ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_PLUTO_STONE_SLAB.get());
                output.accept(ModBlocks.PLUTO_PILLAR.get());

                // Haumea
                output.accept(ModBlocks.HAUMEA_STONE.get());
                output.accept(ModBlocks.HAUMEA_STONE_STAIRS.get());
                output.accept(ModBlocks.HAUMEA_STONE_SLAB.get());
                output.accept(ModBlocks.HAUMEA_COBBLESTONE.get());
                output.accept(ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.HAUMEA_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.HAUMEA_STONE_BRICKS.get());
                output.accept(ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.HAUMEA_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_HAUMEA_STONE.get());
                output.accept(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get());
                output.accept(ModBlocks.HAUMEA_PILLAR.get());

                // Quaoar
                output.accept(ModBlocks.QUAOAR_STONE.get());
                output.accept(ModBlocks.QUAOAR_STONE_STAIRS.get());
                output.accept(ModBlocks.QUAOAR_STONE_SLAB.get());
                output.accept(ModBlocks.QUAOAR_COBBLESTONE.get());
                output.accept(ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.QUAOAR_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.QUAOAR_STONE_BRICKS.get());
                output.accept(ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.QUAOAR_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_QUAOAR_STONE.get());
                output.accept(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get());
                output.accept(ModBlocks.QUAOAR_PILLAR.get());

                // Makemake
                output.accept(ModBlocks.MAKEMAKE_STONE.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_STAIRS.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_SLAB.get());
                output.accept(ModBlocks.MAKEMAKE_COBBLESTONE.get());
                output.accept(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_BRICKS.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_MAKEMAKE_STONE.get());
                output.accept(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get());
                output.accept(ModBlocks.MAKEMAKE_PILLAR.get());

                // Gonggong
                output.accept(ModBlocks.GONGGONG_STONE.get());
                output.accept(ModBlocks.GONGGONG_STONE_STAIRS.get());
                output.accept(ModBlocks.GONGGONG_STONE_SLAB.get());
                output.accept(ModBlocks.GONGGONG_COBBLESTONE.get());
                output.accept(ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.GONGGONG_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.GONGGONG_STONE_BRICKS.get());
                output.accept(ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.GONGGONG_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_GONGGONG_STONE.get());
                output.accept(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get());
                output.accept(ModBlocks.GONGGONG_PILLAR.get());

                // Eris
                output.accept(ModBlocks.ERIS_STONE.get());
                output.accept(ModBlocks.ERIS_STONE_STAIRS.get());
                output.accept(ModBlocks.ERIS_STONE_SLAB.get());
                output.accept(ModBlocks.ERIS_COBBLESTONE.get());
                output.accept(ModBlocks.ERIS_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.ERIS_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.ERIS_STONE_BRICKS.get());
                output.accept(ModBlocks.ERIS_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.ERIS_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.ERIS_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_ERIS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_ERIS_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_ERIS_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_ERIS_STONE.get());
                output.accept(ModBlocks.POLISHED_ERIS_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_ERIS_STONE_SLAB.get());
                output.accept(ModBlocks.ERIS_PILLAR.get());

                // Proxima Centauri b
                output.accept(ModBlocks.B_SAND.get());
                output.accept(ModBlocks.B_STONE.get());
                output.accept(ModBlocks.B_STONE_STAIRS.get());
                output.accept(ModBlocks.B_STONE_SLAB.get());
                output.accept(ModBlocks.B_COBBLESTONE.get());
                output.accept(ModBlocks.B_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.B_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.B_STONE_BRICKS.get());
                output.accept(ModBlocks.B_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.B_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.B_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_B_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_B_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_B_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_B_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_B_STONE.get());
                output.accept(ModBlocks.POLISHED_B_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_B_STONE_SLAB.get());
                output.accept(ModBlocks.B_PILLAR.get());
                // output.accept(ModItems.TIER_5_ROCKET.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
