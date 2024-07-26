package net.teddy0008.ad_extendra.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.loot.AddItemModifier;

public class ModGlobalLootModifiersGenerator extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersGenerator(PackOutput output) {
        super(output, Main.MOD_ID);
    }

    @Override
    protected void start() {
        add("glacian_sapling_from_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(earth.terrarium.ad_astra.common.registry.ModBlocks.GLACIAN_LEAVES.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModBlocks.GLACIAN_SAPLING.get().asItem()));

        add("aeronos_mushroom_from_cap", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(earth.terrarium.ad_astra.common.registry.ModBlocks.AERONOS_CAP.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModBlocks.AERONOS_MUSHROOM.get().asItem()));

        add("strophar_mushroom_from_cap", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(earth.terrarium.ad_astra.common.registry.ModBlocks.STROPHAR_CAP.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModBlocks.STROPHAR_MUSHROOM.get().asItem()));
    }
}
