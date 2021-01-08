package com.github.ryanehenderson.houseofcards.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class HermitDragonSageEntity extends MonsterEntity {
    public HermitDragonSageEntity(EntityType<? extends MonsterEntity> entityTypeIn, World worldIn) {
        super(entityTypeIn, worldIn);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
        super.registerGoals();
    }
}
