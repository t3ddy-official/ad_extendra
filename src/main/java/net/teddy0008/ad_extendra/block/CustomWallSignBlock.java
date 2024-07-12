package net.teddy0008.ad_extendra.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.teddy0008.ad_extendra.block.entity.CustomSignBlockEntity;

public class CustomWallSignBlock extends WallSignBlock {
    public CustomWallSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new CustomSignBlockEntity(pPos, pState);
    }
}
