package net.teddy0008.ad_extendra.entity.vehicle;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.teddy0008.ad_extendra.entity.ModEntities;
import net.teddy0008.ad_extendra.item.ModItems;

public class CustomChestBoat extends ChestBoat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public CustomChestBoat(EntityType<? extends ChestBoat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public CustomChestBoat(Level pLevel, double pX, double pY, double pZ) {
        this(ModEntities.CHEST_BOAT.get(), pLevel);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        switch (getModVariant()) {
            case GLACIAN -> {
                return ModItems.GLACIAN_CHEST_BOAT.get();
            }
        }
        return super.getDropItem();
    }

    public void setVariant(CustomBoat.Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, CustomBoat.Type.GLACIAN.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(CustomBoat.Type.byName(pCompound.getString("Type")));
        }
    }

    public CustomBoat.Type getModVariant() {
        return CustomBoat.Type.byId(this.entityData.get(DATA_ID_TYPE));
    }
}
