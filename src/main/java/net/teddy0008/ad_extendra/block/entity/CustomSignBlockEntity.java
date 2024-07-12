package net.teddy0008.ad_extendra.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomSignBlockEntity extends SignBlockEntity {
    public CustomSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.SIGN.get();
    }
}
