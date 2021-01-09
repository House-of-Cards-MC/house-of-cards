package com.github.ryanehenderson.houseofcards.entities.imugi;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.entities.CycarpEntity;
import com.github.ryanehenderson.houseofcards.setup.ModEntities;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.security.Guard;
import java.util.Random;

public class ImugiEntity extends DolphinEntity {
    protected ImugiEntity(EntityType<? extends ImugiEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    public void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2d, true));
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
}
