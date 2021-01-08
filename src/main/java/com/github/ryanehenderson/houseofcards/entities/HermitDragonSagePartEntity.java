package com.github.ryanehenderson.houseofcards.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class HermitDragonSagePartEntity extends Entity {
    public final HermitDragonSageEntity entity;
    public final String part;
    private final EntitySize size;

    public HermitDragonSagePartEntity(HermitDragonSageEntity entityIn, String part, float width, float height) {
        super(entityIn.getType(), entityIn.getEntityWorld());
        entity = entityIn;
        this.part = part;
        size = EntitySize.flexible(width, height);
        recalculateSize();
    }

    @Override
    protected void registerData() { }

    @Override
    protected void readAdditional(CompoundNBT compound) { }

    @Override
    protected void writeAdditional(CompoundNBT compound) { }

    @Override
    public IPacket<?> createSpawnPacket() { throw new UnsupportedOperationException(); }

    public boolean attackEntityFrom(DamageSource source, float amount) {
        return this.isInvulnerableTo(source) ? false : this.entity.attackEntityPartFrom(this, source, amount);
    }

    public boolean canBeCollidedWith() { return true; }

    public boolean isEntityEqual(Entity entityIn) { return this == entityIn || this.entity == entityIn; }

    public EntitySize getSize(Pose poseIn) { return size; }
}
