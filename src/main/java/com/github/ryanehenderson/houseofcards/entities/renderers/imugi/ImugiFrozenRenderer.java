package com.github.ryanehenderson.houseofcards.entities.renderers.imugi;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.entities.imugi.ImugiFrozenEntity;
import com.github.ryanehenderson.houseofcards.entities.models.imugi.ImugiFrozenModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class ImugiFrozenRenderer extends MobRenderer<ImugiFrozenEntity, ImugiFrozenModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HouseOfCards.MOD_ID, "textures/entity/imugi_frozen.png");

    public ImugiFrozenRenderer(EntityRendererManager manager) { super(manager, new ImugiFrozenModel(), 2.0f); }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(ImugiFrozenEntity entity) {
        return TEXTURE;
    }
}
