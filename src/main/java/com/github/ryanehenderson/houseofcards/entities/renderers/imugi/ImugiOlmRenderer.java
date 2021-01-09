package com.github.ryanehenderson.houseofcards.entities.renderers.imugi;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.entities.imugi.ImugiOlmEntity;
import com.github.ryanehenderson.houseofcards.entities.models.imugi.ImugiOlmModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class ImugiOlmRenderer extends MobRenderer<ImugiOlmEntity, ImugiOlmModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HouseOfCards.MOD_ID, "textures/entity/imugi_olm.png");

    public ImugiOlmRenderer(EntityRendererManager manager) { super(manager, new ImugiOlmModel(), 2.0f); }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(ImugiOlmEntity entity) {
        return TEXTURE;
    }
}
