package com.github.ryanehenderson.houseofcards.entities.models;

import com.github.ryanehenderson.houseofcards.entities.CycarpEntity;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * HoCFISH - Indominator650
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class CycarpModel extends EntityModel<CycarpEntity> {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer Tail;
    public ModelRenderer Fin;
    public ModelRenderer Eye;
    public ModelRenderer FinLeft;
    public ModelRenderer FinRight;
    public ModelRenderer TailFin1;
    public ModelRenderer TailFin2;
    public ModelRenderer TailFinLeft;
    public ModelRenderer TailFinRight;

    public CycarpModel() {
        this.textureWidth = 100;
        this.textureHeight = 50;
        this.FinLeft = new ModelRenderer(this, 21, 0);
        this.FinLeft.setRotationPoint(3.5F, 1.5F, 0.0F);
        this.FinLeft.addBox(-1.0F, 0.0F, 0.0F, 10.0F, 0.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FinLeft, 0.0F, 0.0F, 0.3909537457888271F);
        this.TailFinLeft = new ModelRenderer(this, 26, 15);
        this.TailFinLeft.setRotationPoint(2.5F, 2.0F, 2.0F);
        this.TailFinLeft.addBox(-1.5F, 0.0F, -3.0F, 5.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinLeft, 0.0F, 0.0F, 1.0555751236166873F);
        this.TailFinRight = new ModelRenderer(this, 26, 15);
        this.TailFinRight.mirror = true;
        this.TailFinRight.setRotationPoint(-2.5F, 2.0F, 2.0F);
        this.TailFinRight.addBox(-3.5F, 0.0F, -3.0F, 5.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TailFinRight, 0.0F, 0.0F, -1.0555751236166873F);
        this.TailFin1 = new ModelRenderer(this, 56, -8);
        this.TailFin1.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.TailFin1.addBox(0.0F, -4.0F, 0.0F, 0.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.FinRight = new ModelRenderer(this, 21, 0);
        this.FinRight.mirror = true;
        this.FinRight.setRotationPoint(-3.5F, 1.5F, 0.0F);
        this.FinRight.addBox(-9.0F, 0.0F, 0.0F, 10.0F, 0.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(FinRight, 0.0F, 0.0F, -0.4300491170387584F);
        this.TailFin2 = new ModelRenderer(this, 56, 3);
        this.TailFin2.setRotationPoint(0.0F, 3.0F, 6.0F);
        this.TailFin2.addBox(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Body.addBox(-4.0F, -3.0F, -5.0F, 8.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Fin = new ModelRenderer(this, 28, 10);
        this.Fin.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Fin.addBox(0.0F, -7.0F, 0.0F, 0.0F, 8.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 66, 0);
        this.Tail.setRotationPoint(0.0F, -2.5F, 5.0F);
        this.Tail.addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.Eye = new ModelRenderer(this, 0, 28);
        this.Eye.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye.addBox(-2.5F, -1.5F, -4.0F, 5.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 16);
        this.Head.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Head.addBox(-3.5F, 0.0F, -5.0F, 7.0F, 5.0F, 7.0F, 0.0F, 0.0F, 0.0F);
        this.Head.addChild(this.FinLeft);
        this.Tail.addChild(this.TailFinLeft);
        this.Tail.addChild(this.TailFinRight);
        this.Tail.addChild(this.TailFin1);
        this.Head.addChild(this.FinRight);
        this.Tail.addChild(this.TailFin2);
        this.Body.addChild(this.Fin);
        this.Body.addChild(this.Tail);
        this.Head.addChild(this.Eye);
        this.Body.addChild(this.Head);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) { 
        ImmutableList.of(this.Body).forEach((modelRenderer) -> { 
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(CycarpEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
