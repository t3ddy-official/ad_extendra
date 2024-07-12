package net.teddy0008.ad_extendra.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomHangingSignBlockEntity extends SignBlockEntity {
    public CustomHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.HANGING_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.HANGING_SIGN.get();
    }
}
