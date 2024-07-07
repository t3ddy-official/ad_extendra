package net.teddy0008.ad_extendra.datagen;

import earth.terrarium.ad_astra.common.item.vehicle.RocketItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.item.ModItems;

public class ModItemModelGenerator extends ItemModelProvider {
    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Jupiter
        simpleItem(ModItems.RAW_JUPERIUM);
        simpleItem(ModItems.JUPERIUM_INGOT);
        simpleItem(ModItems.JUPERIUM_NUGGET);
        simpleItem(ModItems.JUPERIUM_PLATE);
        stairsItem(ModBlocks.JUPERIUM_PLATING_STAIRS);
        slabItem(ModBlocks.JUPERIUM_PLATING_SLAB);
        pillarItem(ModBlocks.JUPERIUM_PILLAR);
        pillarItem(ModBlocks.GLOWING_JUPERIUM_PILLAR);
        buttonItem(ModBlocks.JUPERIUM_PLATING_BUTTON);
        pressurePlateItem(ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE);
        stairsItem(ModBlocks.JUPITER_STONE_STAIRS);
        slabItem(ModBlocks.JUPITER_STONE_SLAB);
        stairsItem(ModBlocks.JUPITER_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.JUPITER_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.JUPITER_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.JUPITER_STONE_BRICK_SLAB);
        wallItem(ModBlocks.JUPITER_STONE_BRICK_WALL, ModBlocks.JUPITER_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_JUPITER_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_JUPITER_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_JUPITER_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_JUPITER_STONE_SLAB);
        pillarItem(ModBlocks.JUPITER_PILLAR);

        // Ceres
        stairsItem(ModBlocks.CERES_STONE_STAIRS);
        slabItem(ModBlocks.CERES_STONE_SLAB);
        stairsItem(ModBlocks.CERES_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.CERES_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.CERES_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.CERES_STONE_BRICK_SLAB);
        wallItem(ModBlocks.CERES_STONE_BRICK_WALL, ModBlocks.CERES_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_CERES_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_CERES_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_CERES_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_CERES_STONE_SLAB);
        pillarItem(ModBlocks.CERES_PILLAR);

        // Saturn
        simpleItem(ModItems.RAW_SATURLYTE);
        simpleItem(ModItems.SATURLYTE_INGOT);
        simpleItem(ModItems.SATURLYTE_NUGGET);
        simpleItem(ModItems.SATURLYTE_PLATE);
        stairsItem(ModBlocks.SATURLYTE_PLATING_STAIRS);
        slabItem(ModBlocks.SATURLYTE_PLATING_SLAB);
        pillarItem(ModBlocks.SATURLYTE_PILLAR);
        pillarItem(ModBlocks.GLOWING_SATURLYTE_PILLAR);
        buttonItem(ModBlocks.SATURLYTE_PLATING_BUTTON);
        pressurePlateItem(ModBlocks.SATURLYTE_PLATING_PRESSURE_PLATE);
        stairsItem(ModBlocks.SATURN_STONE_STAIRS);
        slabItem(ModBlocks.SATURN_STONE_SLAB);
        stairsItem(ModBlocks.SATURN_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.SATURN_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.SATURN_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.SATURN_STONE_BRICK_SLAB);
        wallItem(ModBlocks.SATURN_STONE_BRICK_WALL, ModBlocks.SATURN_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_SATURN_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_SATURN_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_SATURN_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_SATURN_STONE_SLAB);
        pillarItem(ModBlocks.SATURN_PILLAR);

        // Uranus
        simpleItem(ModItems.RAW_URANIUM);
        simpleItem(ModItems.URANIUM_INGOT);
        simpleItem(ModItems.URANIUM_NUGGET);
        simpleItem(ModItems.URANIUM_PLATE);
        stairsItem(ModBlocks.URANIUM_PLATING_STAIRS);
        slabItem(ModBlocks.URANIUM_PLATING_SLAB);
        pillarItem(ModBlocks.URANIUM_PILLAR);
        pillarItem(ModBlocks.GLOWING_URANIUM_PILLAR);
        buttonItem(ModBlocks.URANIUM_PLATING_BUTTON);
        pressurePlateItem(ModBlocks.URANIUM_PLATING_PRESSURE_PLATE);
        stairsItem(ModBlocks.URANUS_STONE_STAIRS);
        slabItem(ModBlocks.URANUS_STONE_SLAB);
        stairsItem(ModBlocks.URANUS_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.URANUS_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.URANUS_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.URANUS_STONE_BRICK_SLAB);
        wallItem(ModBlocks.URANUS_STONE_BRICK_WALL, ModBlocks.URANUS_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_URANUS_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_URANUS_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_URANUS_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_URANUS_STONE_SLAB);
        pillarItem(ModBlocks.URANUS_PILLAR);

        // Neptune
        simpleItem(ModItems.RAW_NEPTUNIUM);
        simpleItem(ModItems.NEPTUNIUM_INGOT);
        simpleItem(ModItems.NEPTUNIUM_NUGGET);
        simpleItem(ModItems.NEPTUNIUM_PLATE);
        stairsItem(ModBlocks.NEPTUNIUM_PLATING_STAIRS);
        slabItem(ModBlocks.NEPTUNIUM_PLATING_SLAB);
        pillarItem(ModBlocks.NEPTUNIUM_PILLAR);
        pillarItem(ModBlocks.GLOWING_NEPTUNIUM_PILLAR);
        buttonItem(ModBlocks.NEPTUNIUM_PLATING_BUTTON);
        pressurePlateItem(ModBlocks.NEPTUNIUM_PLATING_PRESSURE_PLATE);
        stairsItem(ModBlocks.NEPTUNE_STONE_STAIRS);
        slabItem(ModBlocks.NEPTUNE_STONE_SLAB);
        stairsItem(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.NEPTUNE_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.NEPTUNE_STONE_BRICK_SLAB);
        wallItem(ModBlocks.NEPTUNE_STONE_BRICK_WALL, ModBlocks.NEPTUNE_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB);
        pillarItem(ModBlocks.NEPTUNE_PILLAR);

        // Orcus
        stairsItem(ModBlocks.ORCUS_STONE_STAIRS);
        slabItem(ModBlocks.ORCUS_STONE_SLAB);
        stairsItem(ModBlocks.ORCUS_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.ORCUS_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.ORCUS_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.ORCUS_STONE_BRICK_SLAB);
        wallItem(ModBlocks.ORCUS_STONE_BRICK_WALL, ModBlocks.ORCUS_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_ORCUS_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_ORCUS_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_ORCUS_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_ORCUS_STONE_SLAB);
        pillarItem(ModBlocks.ORCUS_PILLAR);

        // Pluto
        simpleItem(ModItems.RAW_PLUTONIUM);
        simpleItem(ModItems.PLUTONIUM_INGOT);
        simpleItem(ModItems.PLUTONIUM_NUGGET);
        simpleItem(ModItems.PLUTONIUM_PLATE);
        stairsItem(ModBlocks.PLUTONIUM_PLATING_STAIRS);
        slabItem(ModBlocks.PLUTONIUM_PLATING_SLAB);
        pillarItem(ModBlocks.PLUTONIUM_PILLAR);
        pillarItem(ModBlocks.GLOWING_PLUTONIUM_PILLAR);
        buttonItem(ModBlocks.PLUTONIUM_PLATING_BUTTON);
        pressurePlateItem(ModBlocks.PLUTONIUM_PLATING_PRESSURE_PLATE);
        stairsItem(ModBlocks.PLUTO_STONE_STAIRS);
        slabItem(ModBlocks.PLUTO_STONE_SLAB);
        stairsItem(ModBlocks.PLUTO_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.PLUTO_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.PLUTO_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.PLUTO_STONE_BRICK_SLAB);
        wallItem(ModBlocks.PLUTO_STONE_BRICK_WALL, ModBlocks.PLUTO_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_PLUTO_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_PLUTO_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_PLUTO_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_PLUTO_STONE_SLAB);
        pillarItem(ModBlocks.PLUTO_PILLAR);

        // Haumea
        stairsItem(ModBlocks.HAUMEA_STONE_STAIRS);
        slabItem(ModBlocks.HAUMEA_STONE_SLAB);
        stairsItem(ModBlocks.HAUMEA_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.HAUMEA_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.HAUMEA_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.HAUMEA_STONE_BRICK_SLAB);
        wallItem(ModBlocks.HAUMEA_STONE_BRICK_WALL, ModBlocks.HAUMEA_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_HAUMEA_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_HAUMEA_STONE_SLAB);
        pillarItem(ModBlocks.HAUMEA_PILLAR);

        // Quaoar
        stairsItem(ModBlocks.QUAOAR_STONE_STAIRS);
        slabItem(ModBlocks.QUAOAR_STONE_SLAB);
        stairsItem(ModBlocks.QUAOAR_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.QUAOAR_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.QUAOAR_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.QUAOAR_STONE_BRICK_SLAB);
        wallItem(ModBlocks.QUAOAR_STONE_BRICK_WALL, ModBlocks.QUAOAR_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_QUAOAR_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_QUAOAR_STONE_SLAB);
        pillarItem(ModBlocks.QUAOAR_PILLAR);

        // Makemake
        stairsItem(ModBlocks.MAKEMAKE_STONE_STAIRS);
        slabItem(ModBlocks.MAKEMAKE_STONE_SLAB);
        stairsItem(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB);
        wallItem(ModBlocks.MAKEMAKE_STONE_BRICK_WALL, ModBlocks.MAKEMAKE_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB);
        pillarItem(ModBlocks.MAKEMAKE_PILLAR);

        // Gonggong
        stairsItem(ModBlocks.GONGGONG_STONE_STAIRS);
        slabItem(ModBlocks.GONGGONG_STONE_SLAB);
        stairsItem(ModBlocks.GONGGONG_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.GONGGONG_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.GONGGONG_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.GONGGONG_STONE_BRICK_SLAB);
        wallItem(ModBlocks.GONGGONG_STONE_BRICK_WALL, ModBlocks.GONGGONG_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_GONGGONG_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_GONGGONG_STONE_SLAB);
        pillarItem(ModBlocks.GONGGONG_PILLAR);

        // Eris
        stairsItem(ModBlocks.ERIS_STONE_STAIRS);
        slabItem(ModBlocks.ERIS_STONE_SLAB);
        stairsItem(ModBlocks.ERIS_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.ERIS_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.ERIS_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.ERIS_STONE_BRICK_SLAB);
        wallItem(ModBlocks.ERIS_STONE_BRICK_WALL, ModBlocks.ERIS_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_ERIS_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_ERIS_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_ERIS_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_ERIS_STONE_SLAB);
        pillarItem(ModBlocks.ERIS_PILLAR);

        // Sedna
        stairsItem(ModBlocks.SEDNA_STONE_STAIRS);
        slabItem(ModBlocks.SEDNA_STONE_SLAB);
        stairsItem(ModBlocks.SEDNA_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.SEDNA_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.SEDNA_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.SEDNA_STONE_BRICK_SLAB);
        wallItem(ModBlocks.SEDNA_STONE_BRICK_WALL, ModBlocks.SEDNA_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_SEDNA_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_SEDNA_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_SEDNA_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_SEDNA_STONE_SLAB);
        pillarItem(ModBlocks.SEDNA_PILLAR);

        // Proxima Centauri b
        stairsItem(ModBlocks.B_STONE_STAIRS);
        slabItem(ModBlocks.B_STONE_SLAB);
        stairsItem(ModBlocks.B_COBBLESTONE_STAIRS);
        slabItem(ModBlocks.B_COBBLESTONE_SLAB);
        stairsItem(ModBlocks.B_STONE_BRICK_STAIRS);
        slabItem(ModBlocks.B_STONE_BRICK_SLAB);
        wallItem(ModBlocks.B_STONE_BRICK_WALL, ModBlocks.B_STONE_BRICKS);
        stairsItem(ModBlocks.CHISELED_B_STONE_STAIRS);
        slabItem(ModBlocks.CHISELED_B_STONE_SLAB);
        stairsItem(ModBlocks.POLISHED_B_STONE_STAIRS);
        slabItem(ModBlocks.POLISHED_B_STONE_SLAB);
        pillarItem(ModBlocks.B_PILLAR);
        // rocketItem(ModItems.TIER_5_ROCKET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Main.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void wallItem(RegistryObject<WallBlock> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(Main.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void stairsItem(RegistryObject<StairBlock> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void slabItem(RegistryObject<SlabBlock> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void pillarItem(RegistryObject<RotatedPillarBlock> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void buttonItem(RegistryObject<ButtonBlock> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_inventory"));
    }

    public void pressurePlateItem(RegistryObject<PressurePlateBlock> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder rocketItem(RegistryObject<RocketItem> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Main.MOD_ID, "item/" + item.getId().getPath()));
    }
}
