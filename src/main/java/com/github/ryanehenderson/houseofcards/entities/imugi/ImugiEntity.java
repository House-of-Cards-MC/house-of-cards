package com.github.ryanehenderson.houseofcards.entities.imugi;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class ImugiEntity extends CreatureEntity {
    protected ImugiEntity(EntityType<? extends ImugiEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    public void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        super.registerGoals();
    }

    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.registerAttributes()
                .createMutableAttribute(Attributes.MAX_HEALTH, 40.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 32);
    }

    public static boolean canSpawn(EntityType<? extends ImugiEntity> imugi, IWorld worldIn, SpawnReason reason, BlockPos pos, Random random) {
        boolean spawn = pos.getY() > 45 && worldIn.getBlockState(pos).isIn(Blocks.WATER);
        return spawn;
    }
}
