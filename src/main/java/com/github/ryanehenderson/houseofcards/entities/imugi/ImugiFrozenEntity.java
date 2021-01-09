package com.github.ryanehenderson.houseofcards.entities.imugi;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class ImugiFrozenEntity extends ImugiEntity {
    public ImugiFrozenEntity(EntityType<? extends ImugiEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
