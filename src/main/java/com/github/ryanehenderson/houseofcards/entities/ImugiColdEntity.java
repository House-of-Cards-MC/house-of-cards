package com.github.ryanehenderson.houseofcards.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class ImugiColdEntity extends ImugiEntity {
    public ImugiColdEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
