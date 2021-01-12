package com.github.ryanehenderson.houseofcards.entities.imugi;

import com.github.ryanehenderson.houseofcards.entities.CycarpEntity;
import com.github.ryanehenderson.houseofcards.setup.ModSounds;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class ImugiEntity extends DolphinEntity {
    protected ImugiEntity(EntityType<? extends ImugiEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    public void registerGoals() {
        //super.registerGoals();
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 2d, true));
        this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.8d));
        this.goalSelector.addGoal(3, new RandomSwimmingGoal(this, 1.2d, 10));

        this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, TurtleEntity.class, true));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, CycarpEntity.class, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }

    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 30.0d)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 40)
                .createMutableAttribute(Attributes.ARMOR, 4.0d)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 5d);
    }

    public static boolean canSpawn(EntityType<? extends ImugiEntity> imugi, IWorld worldIn, SpawnReason reason, BlockPos pos, Random random) {
        boolean spawn = pos.getY() > 45 && worldIn.getBlockState(pos).isIn(Blocks.WATER);
        return spawn;
    }

    public int getMoistness() {
        return 2400;
    }

    public int getAir() {
        return 300;
    }

    public boolean canBreatheUnderwater() {
        return true;
    }

    protected SoundEvent getAmbientSound() { return ModSounds.IMUGI_IDLE.get(); }

    protected SoundEvent getHurtSound(DamageSource sourceIn) { return ModSounds.ENTITY_IMUGI_HURT.get(); }

    protected SoundEvent getDeathSound() { return ModSounds.IMUGI_DEATH.get(); }
}
