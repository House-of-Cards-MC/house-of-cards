package com.github.ryanehenderson.houseofcards.entities.renderers;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.entities.HermitDragonSageEntity;
import com.github.ryanehenderson.houseofcards.entities.models.HermitDragonSageModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class HermitDragonSageRenderer extends MobRenderer<HermitDragonSageEntity, HermitDragonSageModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HouseOfCards.MOD_ID, "textures/entity/hermit_dragon_sage.png");

    public HermitDragonSageRenderer(EntityRendererManager manager) {
        super(manager, new HermitDragonSageModel(), 2.0f);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(HermitDragonSageEntity entity) {
        return TEXTURE;
    }
}
