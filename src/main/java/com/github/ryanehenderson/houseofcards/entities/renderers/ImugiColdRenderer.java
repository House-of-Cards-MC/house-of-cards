package com.github.ryanehenderson.houseofcards.entities.renderers;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.entities.ImugiColdEntity;
import com.github.ryanehenderson.houseofcards.entities.models.ImugiColdModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class ImugiColdRenderer extends MobRenderer<ImugiColdEntity, ImugiColdModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HouseOfCards.MOD_ID, "textures/entity/imugi_cold.png");

    public ImugiColdRenderer(EntityRendererManager manager) {
        super(manager, new ImugiColdModel(), 2.0f);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(ImugiColdEntity entity) {
        return TEXTURE;
    }
}
