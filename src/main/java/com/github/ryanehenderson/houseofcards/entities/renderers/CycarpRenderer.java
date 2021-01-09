package com.github.ryanehenderson.houseofcards.entities.renderers;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.entities.CycarpEntity;
import com.github.ryanehenderson.houseofcards.entities.HermitDragonSageEntity;
import com.github.ryanehenderson.houseofcards.entities.models.CycarpModel;
import com.github.ryanehenderson.houseofcards.entities.models.HermitDragonSageModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class CycarpRenderer extends MobRenderer<CycarpEntity, CycarpModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HouseOfCards.MOD_ID, "textures/entity/cycarp.png");

    public CycarpRenderer(EntityRendererManager manager) {
        super(manager, new CycarpModel(), 2.0f);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(CycarpEntity entity) {
        return TEXTURE;
    }
}
