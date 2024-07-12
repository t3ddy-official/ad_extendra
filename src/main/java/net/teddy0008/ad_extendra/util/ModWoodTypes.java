package net.teddy0008.ad_extendra.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.teddy0008.ad_extendra.Main;

public class ModWoodTypes {
    public static final WoodType GLACIAN = WoodType.register(new WoodType(Main.MOD_ID + ":glacian", BlockSetType.OAK));
    public static final WoodType AERONOS = WoodType.register(new WoodType(Main.MOD_ID + ":aeronos", BlockSetType.CRIMSON));
    public static final WoodType STROPHAR = WoodType.register(new WoodType(Main.MOD_ID + ":strophar", BlockSetType.CRIMSON));
}
