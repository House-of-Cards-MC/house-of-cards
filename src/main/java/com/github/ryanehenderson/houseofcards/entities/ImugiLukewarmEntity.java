package com.github.ryanehenderson.houseofcards.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class ImugiLukewarmEntity extends ImugiEntity {
    public ImugiLukewarmEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
