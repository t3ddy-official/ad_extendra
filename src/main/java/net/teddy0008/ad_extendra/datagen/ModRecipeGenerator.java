package net.teddy0008.ad_extendra.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.BlockItem;
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 9)
                .requires(ModBlocks.JUPERIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.JUPERIUM_BLOCK.get()), has(ModBlocks.JUPERIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_JUPERIUM.get(), 9)
                .requires(ModBlocks.RAW_JUPERIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_JUPERIUM_BLOCK.get()), has(ModBlocks.RAW_JUPERIUM_BLOCK.get())).save(consumer);

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
