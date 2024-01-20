package net.teddy0008.ad_extendra.datagen;

import earth.terrarium.ad_astra.common.item.vehicle.RocketItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.item.ModItems;

public class ModItemModelGenerator extends ItemModelProvider {
    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_JUPERIUM);
        simpleItem(ModItems.JUPERIUM_INGOT);
        // rocketItem(ModItems.TIER_5_ROCKET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Main.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder rocketItem(RegistryObject<RocketItem> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Main.MOD_ID, "item/" + item.getId().getPath()));
    }
}
