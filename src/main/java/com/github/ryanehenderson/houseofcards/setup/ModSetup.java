package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.entities.CycarpEntity;
import com.github.ryanehenderson.houseofcards.entities.HermitDragonSageEntity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            GlobalEntityTypeAttributes.put(ModEntities.HERMIT_DRAGON_SAGE.get(), HermitDragonSageEntity.prepareAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntities.CYCARP.get(), CycarpEntity.prepareAttributes().create());
        });
    }
}
