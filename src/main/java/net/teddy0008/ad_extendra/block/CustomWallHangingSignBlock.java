package net.teddy0008.ad_extendra.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.teddy0008.ad_extendra.block.entity.CustomHangingSignBlockEntity;

public class CustomWallHangingSignBlock extends WallHangingSignBlock {
    public CustomWallHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new CustomHangingSignBlockEntity(pPos, pState);
    }
}
