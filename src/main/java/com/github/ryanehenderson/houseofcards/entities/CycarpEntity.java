package com.github.ryanehenderson.houseofcards.entities;

import com.github.ryanehenderson.houseofcards.entities.imugi.ImugiColdEntity;
import com.github.ryanehenderson.houseofcards.entities.imugi.ImugiEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class CycarpEntity extends AbstractFishEntity {
    public CycarpEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new FindWaterGoal(this));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, ImugiEntity.class, 100f, 20d, 100d));
        this.goalSelector.addGoal(3, new RandomSwimmingGoal(this, 0.8d, 20));
    }

    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10.0f)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 8f);
    }

    @Override
    protected ItemStack getFishBucket() {
        return null;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return null;
    }
}
