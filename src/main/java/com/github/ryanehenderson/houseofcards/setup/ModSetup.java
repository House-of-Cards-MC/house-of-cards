package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.entities.*;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            GlobalEntityTypeAttributes.put(ModEntities.HERMIT_DRAGON_SAGE.get(), HermitDragonSageEntity.prepareAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntities.IMUGI_COLD.get(), ImugiColdEntity.prepareAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntities.IMUGI_FROZEN.get(), ImugiFrozenEntity.prepareAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntities.IMUGI_GOLD.get(), ImugiGoldEntity.prepareAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntities.IMUGI_LUKEWARM.get(), ImugiLukewarmEntity.prepareAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntities.IMUGI_OLM.get(), ImugiOlmEntity.prepareAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntities.IMUGI_WARM.get(), ImugiWarmEntity.prepareAttributes().create());
        });
    }
}
