package com.github.ryanehenderson.houseofcards.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;

public class HermitDragonSageEntity extends MonsterEntity {
    private final HermitDragonSagePartEntity[] sageEntityParts;
    private final HermitDragonSagePartEntity sageEntityPart1;
    private final HermitDragonSagePartEntity sageEntityPart2;

    public HermitDragonSageEntity(EntityType<? extends MonsterEntity> entityTypeIn, World worldIn) {
        super(entityTypeIn, worldIn);
        sageEntityPart1 = new HermitDragonSagePartEntity(this, "head", 5.0F, 3.0F);
        sageEntityPart2 = new HermitDragonSagePartEntity(this, "neck",3.5F, 6.2F);
        sageEntityParts = new HermitDragonSagePartEntity[]{sageEntityPart1, sageEntityPart2};
        this.noClip = true;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        super.registerGoals();
    }

    public static AttributeModifierMap.MutableAttribute prepareAttributes() {
        return LivingEntity.registerAttributes()
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 3.0f)
                .createMutableAttribute(Attributes.MAX_HEALTH, 20.0f)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 20.0f)
                .createMutableAttribute(Attributes.ARMOR, 5.0f);
    }

    public void livingTick() {
        setPartPosition(sageEntityPart1, 3.5F, 0.4F, 5.2F);
        setPartPosition(sageEntityPart2, 2.6F, 3.5F, 8.9F);
    }

    private void setPartPosition(HermitDragonSagePartEntity part, double offsetX, double offsetY, double offsetZ) {
        part.setPosition(this.getPosX() + offsetX, this.getPosY() + offsetY, this.getPosZ() + offsetZ);
    }

    public boolean attackEntityPartFrom(HermitDragonSagePartEntity part, DamageSource source, float damage) {
        if (damage < 0.01F)
            return false;
        else {
            return true;
        }
    }

    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (source instanceof EntityDamageSource && ((EntityDamageSource)source).getIsThornsDamage()) {
            this.attackEntityPartFrom(this.sageEntityPart1, source, amount);
        }

        return false;
    }

    protected boolean attackSageFrom(DamageSource source, float amount) { return super.attackEntityFrom(source, amount); }

    public boolean canBeCollidedWith() { return false; }

    public void onKillCommand() { this.remove(); }

    public HermitDragonSagePartEntity[] getSageEntityParts() { return sageEntityParts; }
}
