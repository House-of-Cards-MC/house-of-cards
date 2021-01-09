package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.entities.CycarpEntity;
import com.github.ryanehenderson.houseofcards.entities.HermitDragonSageEntity;
import com.github.ryanehenderson.houseofcards.entities.HermitDragonSagePartEntity;
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
    public static final RegistryObject<EntityType<CycarpEntity>> CYCARP = Registration.ENTITIES.register("cycarp", () ->
            EntityType.Builder.create(CycarpEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(1.4f, 1f)
                    .build("cycarp"));
}