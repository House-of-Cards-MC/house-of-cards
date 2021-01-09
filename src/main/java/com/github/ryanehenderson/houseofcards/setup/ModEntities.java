package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.entities.*;
import com.github.ryanehenderson.houseofcards.entities.imugi.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;

public class ModEntities {
    static void register() {}

    public static final RegistryObject<EntityType<HermitDragonSageEntity>> HERMIT_DRAGON_SAGE = Registration.ENTITIES.register("hermit_dragon_sage", () ->
            EntityType.Builder.create(HermitDragonSageEntity::new, EntityClassification.MONSTER)
                    .size(23, 6)
                    .setShouldReceiveVelocityUpdates(false)
                    .build("hermit_dragon_sage"));
    public static final RegistryObject<EntityType<ImugiColdEntity>> IMUGI_COLD = Registration.ENTITIES.register("imugi_cold", () ->
            EntityType.Builder.create(ImugiColdEntity::new, EntityClassification.WATER_CREATURE)
                    .size(1, 1)
                    .build("imugi_cold"));
    public static final RegistryObject<EntityType<ImugiFrozenEntity>> IMUGI_FROZEN = Registration.ENTITIES.register("imugi_frozen", () ->
            EntityType.Builder.create(ImugiFrozenEntity::new, EntityClassification.WATER_CREATURE)
                    .size(1, 1)
                    .build("imugi_frozen"));
    public static final RegistryObject<EntityType<ImugiGoldEntity>> IMUGI_GOLD = Registration.ENTITIES.register("imugi_gold", () ->
            EntityType.Builder.create(ImugiGoldEntity::new, EntityClassification.WATER_CREATURE)
                    .size(1, 1)
                    .build("imugi_gold"));
    public static final RegistryObject<EntityType<ImugiLukewarmEntity>> IMUGI_LUKEWARM = Registration.ENTITIES.register("imugi_lukewarm", () ->
            EntityType.Builder.create(ImugiLukewarmEntity::new, EntityClassification.WATER_CREATURE)
                    .size(1, 1)
                    .build("imugi_lukewarm"));
    public static final RegistryObject<EntityType<ImugiOlmEntity>> IMUGI_OLM = Registration.ENTITIES.register("imugi_olm", () ->
            EntityType.Builder.create(ImugiOlmEntity::new, EntityClassification.WATER_CREATURE)
                    .size(1, 1)
                    .build("imugi_olm"));
    public static final RegistryObject<EntityType<ImugiWarmEntity>> IMUGI_WARM = Registration.ENTITIES.register("imugi_warm", () ->
            EntityType.Builder.create(ImugiWarmEntity::new, EntityClassification.WATER_CREATURE)
                    .size(1, 1)
                    .build("imugi_warm"));
}