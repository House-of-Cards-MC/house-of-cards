package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.entities.renderers.CycarpRenderer;
import com.github.ryanehenderson.houseofcards.entities.renderers.HermitDragonSageRenderer;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {
    public static void init(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.HERMIT_DRAGON_SAGE.get(), HermitDragonSageRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.CYCARP.get(), CycarpRenderer::new);
    }
}
