package com.github.ryanehenderson.houseofcards.entities.renderers.imugi;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.entities.imugi.ImugiWarmEntity;
import com.github.ryanehenderson.houseofcards.entities.models.imugi.ImugiWarmModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class ImugiWarmRenderer extends MobRenderer<ImugiWarmEntity, ImugiWarmModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HouseOfCards.MOD_ID, "textures/entity/imugi_warm.png");

    public ImugiWarmRenderer(EntityRendererManager manager) { super(manager, new ImugiWarmModel(), 2.0f); }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(ImugiWarmEntity entity) {
        return TEXTURE;
    }
}
