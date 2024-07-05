package net.teddy0008.ad_extendra.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.item.ModItems;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> JUPERIUM_SMELTABLES = List.of(ModItems.RAW_JUPERIUM.get(), ModBlocks.JUPITER_JUPERIUM_ORE.get());
    public ModRecipeGenerator(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Jupiter
        oreSmelting(consumer, JUPERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.RAW_JUPERIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.JUPERIUM_BLOCK.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), 0f, 200, "item");

        oreBlasting(consumer, JUPERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.RAW_JUPERIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.JUPERIUM_BLOCK.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "item");

        // Ceres
        oreSmelting(consumer, List.of(ModBlocks.CERES_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.CERES_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.CERES_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), 0f, 200, "item");

        oreBlasting(consumer, List.of(ModBlocks.CERES_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.CERES_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // More Cobblestone Smelting
        oreSmelting(consumer, List.of(ModBlocks.SATURN_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ORCUS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ERIS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SEDNA_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.B_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.B_STONE.get(), 0f, 200, "item");

        // Juperium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.JUPERIUM_INGOT.get()).unlockedBy(getHasName(ModItems.JUPERIUM_INGOT.get()), has(ModItems.JUPERIUM_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_JUPERIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_JUPERIUM.get()).unlockedBy(getHasName(ModItems.RAW_JUPERIUM.get()), has(ModItems.RAW_JUPERIUM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.JUPERIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.JUPERIUM_NUGGET.get()), has(ModItems.JUPERIUM_NUGGET.get()))
                .save(consumer, Main.MOD_ID + ":" + getItemName(ModItems.JUPERIUM_INGOT.get()) + "_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING.get(), 8)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()), has(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()))
                .define('|', ModItemTags.JUPERIUM_PLATES)
                .unlockedBy(getHasName(ModItems.JUPERIUM_PLATE.get()), has(ModItemTags.JUPERIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.JUPERIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.JUPERIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING_BUTTON.get())
                        .requires(ModBlocks.JUPERIUM_PLATING.get()).unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get())
                .pattern("JJ")
                .define('J', ModBlocks.JUPERIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.JUPERIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING.get(), ModBlocks.JUPERIUM_PILLAR.get(), 1);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOWING_JUPERIUM_PILLAR.get(), 6)
                .pattern("JDJ")
                .pattern("JGJ")
                .pattern("JDJ")
                .define('J', ModItemTags.JUPERIUM_PLATES)
                .define('D', Items.YELLOW_DYE)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.JUPERIUM_PLATE.get()), has(ModItemTags.JUPERIUM_PLATES))
                .unlockedBy(getHasName(Items.YELLOW_DYE), has(Items.YELLOW_DYE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 9)
                .requires(ModBlocks.JUPERIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.JUPERIUM_BLOCK.get()), has(ModBlocks.JUPERIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_JUPERIUM.get(), 9)
                .requires(ModBlocks.RAW_JUPERIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_JUPERIUM_BLOCK.get()), has(ModBlocks.RAW_JUPERIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JUPERIUM_NUGGET.get(), 9)
                .requires(ModItems.JUPERIUM_INGOT.get()).unlockedBy(getHasName(ModItems.JUPERIUM_INGOT.get()), has(ModItems.JUPERIUM_INGOT.get())).save(consumer);

        // Jupiter Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_COBBLESTONE.get()), has(ModBlocks.JUPITER_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_COBBLESTONE.get()), has(ModBlocks.JUPITER_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.JUPITER_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.JUPITER_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICK_SLAB.get()), has(ModBlocks.JUPITER_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()), has(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()), has(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_JUPITER_STONE.get()), has(ModBlocks.POLISHED_JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_JUPITER_STONE.get()), has(ModBlocks.POLISHED_JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.CHISELED_JUPITER_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_COBBLESTONE.get(), ModBlocks.JUPITER_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_COBBLESTONE.get(), ModBlocks.JUPITER_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), ModBlocks.CHISELED_JUPITER_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_SLAB.get(), 2);

        // Ceres Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE.get()), has(ModBlocks.CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE.get()), has(ModBlocks.CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.CERES_COBBLESTONE.get()), has(ModBlocks.CERES_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.CERES_COBBLESTONE.get()), has(ModBlocks.CERES_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE.get()), has(ModBlocks.CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE_BRICKS.get()), has(ModBlocks.CERES_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE_BRICKS.get()), has(ModBlocks.CERES_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.CERES_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_CERES_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.CERES_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE_BRICK_SLAB.get()), has(ModBlocks.CERES_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()), has(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()), has(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE.get()), has(ModBlocks.CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_CERES_STONE.get()), has(ModBlocks.POLISHED_CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_CERES_STONE.get()), has(ModBlocks.POLISHED_CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE_BRICKS.get()), has(ModBlocks.CERES_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CHISELED_CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CHISELED_CERES_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_COBBLESTONE.get(), ModBlocks.CERES_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_COBBLESTONE.get(), ModBlocks.CERES_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CERES_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CERES_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), ModBlocks.CHISELED_CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), ModBlocks.CHISELED_CERES_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_SLAB.get(), 2);

        // Saturn Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE.get()), has(ModBlocks.SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE.get()), has(ModBlocks.SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_COBBLESTONE.get()), has(ModBlocks.SATURN_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_COBBLESTONE.get()), has(ModBlocks.SATURN_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE.get()), has(ModBlocks.SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE_BRICKS.get()), has(ModBlocks.SATURN_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE_BRICKS.get()), has(ModBlocks.SATURN_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.SATURN_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_SATURN_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SATURN_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE_BRICK_SLAB.get()), has(ModBlocks.SATURN_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()), has(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()), has(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE.get()), has(ModBlocks.SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_SATURN_STONE.get()), has(ModBlocks.POLISHED_SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_SATURN_STONE.get()), has(ModBlocks.POLISHED_SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE_BRICKS.get()), has(ModBlocks.SATURN_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.CHISELED_SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.CHISELED_SATURN_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_COBBLESTONE.get(), ModBlocks.SATURN_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_COBBLESTONE.get(), ModBlocks.SATURN_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.SATURN_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.SATURN_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), ModBlocks.CHISELED_SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), ModBlocks.CHISELED_SATURN_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_SLAB.get(), 2);

        // Uranus Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE.get()), has(ModBlocks.URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE.get()), has(ModBlocks.URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_COBBLESTONE.get()), has(ModBlocks.URANUS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_COBBLESTONE.get()), has(ModBlocks.URANUS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE.get()), has(ModBlocks.URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE_BRICKS.get()), has(ModBlocks.URANUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE_BRICKS.get()), has(ModBlocks.URANUS_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.URANUS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_URANUS_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.URANUS_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE_BRICK_SLAB.get()), has(ModBlocks.URANUS_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE.get()), has(ModBlocks.URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_URANUS_STONE.get()), has(ModBlocks.POLISHED_URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_URANUS_STONE.get()), has(ModBlocks.POLISHED_URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE_BRICKS.get()), has(ModBlocks.URANUS_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.CHISELED_URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.CHISELED_URANUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_COBBLESTONE.get(), ModBlocks.URANUS_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_COBBLESTONE.get(), ModBlocks.URANUS_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.URANUS_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.URANUS_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), ModBlocks.CHISELED_URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), ModBlocks.CHISELED_URANUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_SLAB.get(), 2);

        // Neptune Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE.get()), has(ModBlocks.NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE.get()), has(ModBlocks.NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_COBBLESTONE.get()), has(ModBlocks.NEPTUNE_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_COBBLESTONE.get()), has(ModBlocks.NEPTUNE_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE.get()), has(ModBlocks.NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get()), has(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE.get()), has(ModBlocks.NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_NEPTUNE_STONE.get()), has(ModBlocks.POLISHED_NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_NEPTUNE_STONE.get()), has(ModBlocks.POLISHED_NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_COBBLESTONE.get(), ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_COBBLESTONE.get(), ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.NEPTUNE_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.NEPTUNE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get(), 2);

        // Orcus Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE.get()), has(ModBlocks.ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE.get()), has(ModBlocks.ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_COBBLESTONE.get()), has(ModBlocks.ORCUS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_COBBLESTONE.get()), has(ModBlocks.ORCUS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE.get()), has(ModBlocks.ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE_BRICKS.get()), has(ModBlocks.ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE_BRICKS.get()), has(ModBlocks.ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.ORCUS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ORCUS_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE_BRICK_SLAB.get()), has(ModBlocks.ORCUS_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE.get()), has(ModBlocks.ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_ORCUS_STONE.get()), has(ModBlocks.POLISHED_ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_ORCUS_STONE.get()), has(ModBlocks.POLISHED_ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE_BRICKS.get()), has(ModBlocks.ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.CHISELED_ORCUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_COBBLESTONE.get(), ModBlocks.ORCUS_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_COBBLESTONE.get(), ModBlocks.ORCUS_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.ORCUS_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.ORCUS_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), ModBlocks.CHISELED_ORCUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_SLAB.get(), 2);

        // Pluto Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE.get()), has(ModBlocks.PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE.get()), has(ModBlocks.PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_COBBLESTONE.get()), has(ModBlocks.PLUTO_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_COBBLESTONE.get()), has(ModBlocks.PLUTO_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE.get()), has(ModBlocks.PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE_BRICKS.get()), has(ModBlocks.PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE_BRICKS.get()), has(ModBlocks.PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.PLUTO_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.PLUTO_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE_BRICK_SLAB.get()), has(ModBlocks.PLUTO_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()), has(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()), has(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE.get()), has(ModBlocks.PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_PLUTO_STONE.get()), has(ModBlocks.POLISHED_PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_PLUTO_STONE.get()), has(ModBlocks.POLISHED_PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE_BRICKS.get()), has(ModBlocks.PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.CHISELED_PLUTO_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_COBBLESTONE.get(), ModBlocks.PLUTO_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_COBBLESTONE.get(), ModBlocks.PLUTO_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.PLUTO_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.PLUTO_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), ModBlocks.CHISELED_PLUTO_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_SLAB.get(), 2);

        // Haumea Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE.get()), has(ModBlocks.HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE.get()), has(ModBlocks.HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_COBBLESTONE.get()), has(ModBlocks.HAUMEA_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_COBBLESTONE.get()), has(ModBlocks.HAUMEA_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE.get()), has(ModBlocks.HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE_BRICKS.get()), has(ModBlocks.HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE_BRICKS.get()), has(ModBlocks.HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.HAUMEA_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get()), has(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()), has(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()), has(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE.get()), has(ModBlocks.HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_HAUMEA_STONE.get()), has(ModBlocks.POLISHED_HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_HAUMEA_STONE.get()), has(ModBlocks.POLISHED_HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE_BRICKS.get()), has(ModBlocks.HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_COBBLESTONE.get(), ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_COBBLESTONE.get(), ModBlocks.HAUMEA_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.HAUMEA_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.HAUMEA_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get(), 2);

        // Quaoar Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE.get()), has(ModBlocks.QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE.get()), has(ModBlocks.QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_COBBLESTONE.get()), has(ModBlocks.QUAOAR_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_COBBLESTONE.get()), has(ModBlocks.QUAOAR_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE.get()), has(ModBlocks.QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE_BRICKS.get()), has(ModBlocks.QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE_BRICKS.get()), has(ModBlocks.QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.QUAOAR_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get()), has(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()), has(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()), has(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE.get()), has(ModBlocks.QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_QUAOAR_STONE.get()), has(ModBlocks.POLISHED_QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_QUAOAR_STONE.get()), has(ModBlocks.POLISHED_QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE_BRICKS.get()), has(ModBlocks.QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_COBBLESTONE.get(), ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_COBBLESTONE.get(), ModBlocks.QUAOAR_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.QUAOAR_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.QUAOAR_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get(), 2);

        // Makemake Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE.get()), has(ModBlocks.MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE.get()), has(ModBlocks.MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_COBBLESTONE.get()), has(ModBlocks.MAKEMAKE_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_COBBLESTONE.get()), has(ModBlocks.MAKEMAKE_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE.get()), has(ModBlocks.MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get()), has(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE.get()), has(ModBlocks.MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_MAKEMAKE_STONE.get()), has(ModBlocks.POLISHED_MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_MAKEMAKE_STONE.get()), has(ModBlocks.POLISHED_MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_COBBLESTONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_COBBLESTONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.MAKEMAKE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get(), 2);

        // Gonggong Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE.get()), has(ModBlocks.GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE.get()), has(ModBlocks.GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_COBBLESTONE.get()), has(ModBlocks.GONGGONG_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_COBBLESTONE.get()), has(ModBlocks.GONGGONG_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE.get()), has(ModBlocks.GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE_BRICKS.get()), has(ModBlocks.GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE_BRICKS.get()), has(ModBlocks.GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.GONGGONG_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get()), has(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()), has(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()), has(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE.get()), has(ModBlocks.GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_GONGGONG_STONE.get()), has(ModBlocks.POLISHED_GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_GONGGONG_STONE.get()), has(ModBlocks.POLISHED_GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE_BRICKS.get()), has(ModBlocks.GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_COBBLESTONE.get(), ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_COBBLESTONE.get(), ModBlocks.GONGGONG_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.GONGGONG_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.GONGGONG_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get(), 2);

        // Eris Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE.get()), has(ModBlocks.ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE.get()), has(ModBlocks.ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_COBBLESTONE.get()), has(ModBlocks.ERIS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_COBBLESTONE.get()), has(ModBlocks.ERIS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE.get()), has(ModBlocks.ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE_BRICKS.get()), has(ModBlocks.ERIS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE_BRICKS.get()), has(ModBlocks.ERIS_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.ERIS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_ERIS_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ERIS_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE_BRICK_SLAB.get()), has(ModBlocks.ERIS_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE.get()), has(ModBlocks.ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_ERIS_STONE.get()), has(ModBlocks.POLISHED_ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_ERIS_STONE.get()), has(ModBlocks.POLISHED_ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE_BRICKS.get()), has(ModBlocks.ERIS_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.CHISELED_ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.CHISELED_ERIS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_COBBLESTONE.get(), ModBlocks.ERIS_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_COBBLESTONE.get(), ModBlocks.ERIS_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.ERIS_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.ERIS_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), ModBlocks.CHISELED_ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), ModBlocks.CHISELED_ERIS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_SLAB.get(), 2);

        // Sedna Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE.get()), has(ModBlocks.SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE.get()), has(ModBlocks.SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_COBBLESTONE.get()), has(ModBlocks.SEDNA_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_COBBLESTONE.get()), has(ModBlocks.SEDNA_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE.get()), has(ModBlocks.SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE_BRICKS.get()), has(ModBlocks.SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE_BRICKS.get()), has(ModBlocks.SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.SEDNA_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SEDNA_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE_BRICK_SLAB.get()), has(ModBlocks.SEDNA_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()), has(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()), has(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE.get()), has(ModBlocks.SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_SEDNA_STONE.get()), has(ModBlocks.POLISHED_SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_SEDNA_STONE.get()), has(ModBlocks.POLISHED_SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE_BRICKS.get()), has(ModBlocks.SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.CHISELED_SEDNA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_COBBLESTONE.get(), ModBlocks.SEDNA_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_COBBLESTONE.get(), ModBlocks.SEDNA_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.SEDNA_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.SEDNA_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), ModBlocks.CHISELED_SEDNA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_SLAB.get(), 2);

        // Proxima Centauri B Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.B_STONE.get()).unlockedBy(getHasName(ModBlocks.B_STONE.get()), has(ModBlocks.B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.B_STONE.get()).unlockedBy(getHasName(ModBlocks.B_STONE.get()), has(ModBlocks.B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.B_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.B_COBBLESTONE.get()), has(ModBlocks.B_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.B_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.B_COBBLESTONE.get()), has(ModBlocks.B_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.B_STONE.get()).unlockedBy(getHasName(ModBlocks.B_STONE.get()), has(ModBlocks.B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.B_STONE_BRICKS.get()), has(ModBlocks.B_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.B_STONE_BRICKS.get()), has(ModBlocks.B_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.B_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_B_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.B_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.B_STONE_BRICK_SLAB.get()), has(ModBlocks.B_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_B_STONE_BRICKS.get()), has(ModBlocks.CHISELED_B_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_B_STONE_BRICKS.get()), has(ModBlocks.CHISELED_B_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.B_STONE.get()).unlockedBy(getHasName(ModBlocks.B_STONE.get()), has(ModBlocks.B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_B_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_B_STONE.get()), has(ModBlocks.POLISHED_B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_B_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_B_STONE.get()), has(ModBlocks.POLISHED_B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.B_STONE_BRICKS.get()), has(ModBlocks.B_STONE_BRICKS.get()))
                .save(consumer);

        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.CHISELED_B_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.CHISELED_B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.CHISELED_B_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.POLISHED_B_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.POLISHED_B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.POLISHED_B_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_COBBLESTONE.get(), ModBlocks.B_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_COBBLESTONE.get(), ModBlocks.B_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE_BRICKS.get(), ModBlocks.B_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE_BRICKS.get(), ModBlocks.CHISELED_B_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE_BRICKS.get(), ModBlocks.B_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_BRICKS.get(), ModBlocks.CHISELED_B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_BRICKS.get(), ModBlocks.CHISELED_B_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE.get(), ModBlocks.POLISHED_B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE.get(), ModBlocks.POLISHED_B_STONE_SLAB.get(), 2);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, Main.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void stonecutting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), category, result, count)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(pFinishedRecipeConsumer, Main.MOD_ID + ":" + getItemName(result) + "_from_" + getItemName(ingredient) + "_stonecutting");
    }
}
