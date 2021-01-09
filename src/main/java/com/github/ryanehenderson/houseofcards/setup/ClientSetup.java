package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.entities.renderers.CycarpRenderer;
import com.github.ryanehenderson.houseofcards.entities.renderers.HermitDragonSageRenderer;
import com.github.ryanehenderson.houseofcards.entities.renderers.imugi.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {
    public static void init(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.HERMIT_DRAGON_SAGE.get(), HermitDragonSageRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.CYCARP.get(), CycarpRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.IMUGI_COLD.get(), ImugiColdRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.IMUGI_FROZEN.get(), ImugiFrozenRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.IMUGI_GOLD.get(), ImugiGoldRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.IMUGI_LUKEWARM.get(), ImugiLukewarmRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.IMUGI_OLM.get(), ImugiOlmRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.IMUGI_WARM.get(), ImugiWarmRenderer::new);
    }
}
