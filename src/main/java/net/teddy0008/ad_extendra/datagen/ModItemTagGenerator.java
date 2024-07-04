package net.teddy0008.ad_extendra.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(Tags.Items.RAW_MATERIALS)
                .add(ModItems.RAW_JUPERIUM.get());
        this.tag(ItemTags.STAIRS)
                // Jupiter
                .add(ModBlocks.JUPITER_STONE_STAIRS.get().asItem())
                .add(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get().asItem())

                // Ceres
                .add(ModBlocks.CERES_STONE_STAIRS.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_CERES_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_CERES_STONE_STAIRS.get().asItem())

                // Saturn
                .add(ModBlocks.SATURN_STONE_STAIRS.get().asItem())
                .add(ModBlocks.SATURN_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.SATURN_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_SATURN_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_SATURN_STONE_STAIRS.get().asItem())

                // Uranus
                .add(ModBlocks.URANUS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.URANUS_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.URANUS_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_URANUS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_URANUS_STONE_STAIRS.get().asItem())

                // Neptune
                .add(ModBlocks.NEPTUNE_STONE_STAIRS.get().asItem())
                .add(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get().asItem())

                // Orcus
                .add(ModBlocks.ORCUS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.ORCUS_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.ORCUS_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get().asItem())

                // Pluto
                .add(ModBlocks.PLUTO_STONE_STAIRS.get().asItem())
                .add(ModBlocks.PLUTO_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.PLUTO_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get().asItem())

                // Haumea
                .add(ModBlocks.HAUMEA_STONE_STAIRS.get().asItem())
                .add(ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get().asItem())

                // Quaoar
                .add(ModBlocks.QUAOAR_STONE_STAIRS.get().asItem())
                .add(ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get().asItem())

                // Makemake
                .add(ModBlocks.MAKEMAKE_STONE_STAIRS.get().asItem())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get().asItem())

                // Gonggong
                .add(ModBlocks.GONGGONG_STONE_STAIRS.get().asItem())
                .add(ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get().asItem())

                // Eris
                .add(ModBlocks.ERIS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.ERIS_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.ERIS_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_ERIS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_ERIS_STONE_STAIRS.get().asItem())

                // Sedna
                .add(ModBlocks.SEDNA_STONE_STAIRS.get().asItem())
                .add(ModBlocks.SEDNA_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.SEDNA_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get().asItem())

                // Proxima Centauri b
                .add(ModBlocks.B_STONE_STAIRS.get().asItem())
                .add(ModBlocks.B_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.B_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_B_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_B_STONE_STAIRS.get().asItem());
        this.tag(ItemTags.SLABS)
                // Jupiter
                .add(ModBlocks.JUPITER_STONE_SLAB.get().asItem())
                .add(ModBlocks.JUPITER_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get().asItem())

                // Ceres
                .add(ModBlocks.CERES_STONE_SLAB.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_CERES_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_CERES_STONE_SLAB.get().asItem())

                // Saturn
                .add(ModBlocks.SATURN_STONE_SLAB.get().asItem())
                .add(ModBlocks.SATURN_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.SATURN_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_SATURN_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_SATURN_STONE_SLAB.get().asItem())

                // Uranus
                .add(ModBlocks.URANUS_STONE_SLAB.get().asItem())
                .add(ModBlocks.URANUS_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.URANUS_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_URANUS_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_URANUS_STONE_SLAB.get().asItem())

                // Neptune
                .add(ModBlocks.NEPTUNE_STONE_SLAB.get().asItem())
                .add(ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get().asItem())

                // Orcus
                .add(ModBlocks.ORCUS_STONE_SLAB.get().asItem())
                .add(ModBlocks.ORCUS_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.ORCUS_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_ORCUS_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_ORCUS_STONE_SLAB.get().asItem())

                // Pluto
                .add(ModBlocks.PLUTO_STONE_SLAB.get().asItem())
                .add(ModBlocks.PLUTO_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.PLUTO_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_PLUTO_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_PLUTO_STONE_SLAB.get().asItem())

                // Haumea
                .add(ModBlocks.HAUMEA_STONE_SLAB.get().asItem())
                .add(ModBlocks.HAUMEA_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get().asItem())

                // Quaoar
                .add(ModBlocks.QUAOAR_STONE_SLAB.get().asItem())
                .add(ModBlocks.QUAOAR_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get().asItem())

                // Makemake
                .add(ModBlocks.MAKEMAKE_STONE_SLAB.get().asItem())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get().asItem())

                // Gonggong
                .add(ModBlocks.GONGGONG_STONE_SLAB.get().asItem())
                .add(ModBlocks.GONGGONG_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get().asItem())

                // Eris
                .add(ModBlocks.ERIS_STONE_SLAB.get().asItem())
                .add(ModBlocks.ERIS_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.ERIS_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_ERIS_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_ERIS_STONE_SLAB.get().asItem())

                // Sedna
                .add(ModBlocks.SEDNA_STONE_SLAB.get().asItem())
                .add(ModBlocks.SEDNA_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.SEDNA_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_SEDNA_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_SEDNA_STONE_SLAB.get().asItem())

                // Proxima Centauri b
                .add(ModBlocks.B_STONE_SLAB.get().asItem())
                .add(ModBlocks.B_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.B_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_B_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_B_STONE_SLAB.get().asItem());
        this.tag(ItemTags.WALLS)
                .add(ModBlocks.JUPITER_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.SATURN_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.URANUS_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.ORCUS_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.PLUTO_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.HAUMEA_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.QUAOAR_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.GONGGONG_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.ERIS_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.SEDNA_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.B_STONE_BRICK_WALL.get().asItem());
        this.tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModBlocks.JUPITER_COBBLESTONE.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE.get().asItem())
                .add(ModBlocks.SATURN_COBBLESTONE.get().asItem())
                .add(ModBlocks.URANUS_COBBLESTONE.get().asItem())
                .add(ModBlocks.NEPTUNE_COBBLESTONE.get().asItem())
                .add(ModBlocks.ORCUS_COBBLESTONE.get().asItem())
                .add(ModBlocks.PLUTO_COBBLESTONE.get().asItem())
                .add(ModBlocks.HAUMEA_COBBLESTONE.get().asItem())
                .add(ModBlocks.QUAOAR_COBBLESTONE.get().asItem())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE.get().asItem())
                .add(ModBlocks.GONGGONG_COBBLESTONE.get().asItem())
                .add(ModBlocks.ERIS_COBBLESTONE.get().asItem())
                .add(ModBlocks.SEDNA_COBBLESTONE.get().asItem())
                .add(ModBlocks.B_COBBLESTONE.get().asItem());
        this.tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModBlocks.JUPITER_COBBLESTONE.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE.get().asItem())
                .add(ModBlocks.SATURN_COBBLESTONE.get().asItem())
                .add(ModBlocks.URANUS_COBBLESTONE.get().asItem())
                .add(ModBlocks.NEPTUNE_COBBLESTONE.get().asItem())
                .add(ModBlocks.ORCUS_COBBLESTONE.get().asItem())
                .add(ModBlocks.PLUTO_COBBLESTONE.get().asItem())
                .add(ModBlocks.HAUMEA_COBBLESTONE.get().asItem())
                .add(ModBlocks.QUAOAR_COBBLESTONE.get().asItem())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE.get().asItem())
                .add(ModBlocks.GONGGONG_COBBLESTONE.get().asItem())
                .add(ModBlocks.ERIS_COBBLESTONE.get().asItem())
                .add(ModBlocks.SEDNA_COBBLESTONE.get().asItem())
                .add(ModBlocks.B_COBBLESTONE.get().asItem());
    }
}
