package com.github.ryanehenderson.houseofcards.entities.imugi;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class ImugiWarmEntity extends ImugiEntity {
    public ImugiWarmEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
