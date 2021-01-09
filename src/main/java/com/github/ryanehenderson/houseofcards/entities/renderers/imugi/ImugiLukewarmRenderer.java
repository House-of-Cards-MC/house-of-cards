package com.github.ryanehenderson.houseofcards.entities.renderers.imugi;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.entities.imugi.ImugiLukewarmEntity;
import com.github.ryanehenderson.houseofcards.entities.models.imugi.ImugiLukewarmModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class ImugiLukewarmRenderer extends MobRenderer<ImugiLukewarmEntity, ImugiLukewarmModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HouseOfCards.MOD_ID, "textures/entity/imugi_lukewarm.png");

    public ImugiLukewarmRenderer(EntityRendererManager manager) { super(manager, new ImugiLukewarmModel(), 2.0f); }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(ImugiLukewarmEntity entity) {
        return TEXTURE;
    }
}
