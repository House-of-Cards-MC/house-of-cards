package com.github.ryanehenderson.houseofcards.entities.models.imugi;

import com.github.ryanehenderson.houseofcards.entities.imugi.ImugiWarmEntity;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * HoCSeaViper - Indominator650
 * Created using Tabula 8.0.0
 */
public class ImugiWarmModel extends EntityModel<ImugiWarmEntity> {
    public ModelRenderer Torso;
    public ModelRenderer Waist;
    public ModelRenderer HeadJoint;
    public ModelRenderer Jaw;
    public ModelRenderer Tail1;
    public ModelRenderer Tail2;
    public ModelRenderer Tail4;
    public ModelRenderer Tail4_1;
    public ModelRenderer Tail3;
    public ModelRenderer Tail4_2;
    public ModelRenderer Tail5;
    public ModelRenderer Tail6;
    public ModelRenderer Tail7;
    public ModelRenderer LegLeft1;
    public ModelRenderer LegRight1;
    public ModelRenderer Tail8;
    public ModelRenderer Tail9;
    public ModelRenderer LegLeft2;
    public ModelRenderer LegRight2;
    public ModelRenderer HeadLeft;
    public ModelRenderer HeadRight;
    public ModelRenderer HornLeft;
    public ModelRenderer GillsLeft1;
    public ModelRenderer GillsLeft2;
    public ModelRenderer TeethUpperLeft;
    public ModelRenderer HornRight;
    public ModelRenderer GillsRight1;
    public ModelRenderer GillsRight2;
    public ModelRenderer TeethUpperRight;
    public ModelRenderer TeethLowerLeft;
    public ModelRenderer TeethLowerRight;
    public ModelRenderer Tongue;

    public ImugiWarmModel() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Tail7 = new ModelRenderer(this, 50, 35);
        this.Tail7.setRotationPoint(0.0F, 0.0F, 23.0F);
        this.Tail7.addBox(-2.0F, -5.0F, -2.0F, 4.0F, 10.0F, 27.0F, 0.0F, 0.0F, 0.0F);
        this.Tail9 = new ModelRenderer(this, 56, 112);
        this.Tail9.setRotationPoint(0.0F, 0.0F, 27.0F);
        this.Tail9.addBox(-0.5F, -6.0F, -2.0F, 1.0F, 12.0F, 31.0F, 0.0F, 0.0F, 0.0F);
        this.Tail4_2 = new ModelRenderer(this, 0, 132);
        this.Tail4_2.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.Tail4_2.addBox(-3.5F, -4.5F, -2.0F, 7.0F, 9.0F, 21.0F, 0.0F, 0.0F, 0.0F);
        this.HeadLeft = new ModelRenderer(this, 77, 0);
        this.HeadLeft.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.HeadLeft.addBox(0.0F, -1.0F, -10.01F, 5.0F, 6.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HeadLeft, -0.19547687289441354F, 0.03909537541112055F, -0.19547687289441354F);
        this.TeethLowerRight = new ModelRenderer(this, 118, 29);
        this.TeethLowerRight.mirror = true;
        this.TeethLowerRight.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.TeethLowerRight.addBox(-4.0F, -2.0F, -10.01F, 4.0F, 2.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.GillsLeft2 = new ModelRenderer(this, 150, -15);
        this.GillsLeft2.setRotationPoint(4.9F, 0.0F, 5.01F);
        this.GillsLeft2.addBox(0.0F, 0.0F, -4.0F, 0.0F, 8.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(GillsLeft2, 0.23457224414434488F, 0.35185837453889574F, -0.03909537541112055F);
        this.Torso = new ModelRenderer(this, 0, 0);
        this.Torso.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Torso.addBox(-4.0F, -4.5F, -8.5F, 8.0F, 9.0F, 17.0F, 0.0F, 0.0F, 0.0F);
        this.Jaw = new ModelRenderer(this, 85, 21);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -8.5F);
        this.Jaw.addBox(-4.5F, -1.5F, -10.0F, 9.0F, 4.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.0781907508222411F, 0.0F, 0.0F);
        this.HornLeft = new ModelRenderer(this, 102, 0);
        this.HornLeft.setRotationPoint(4.9F, -1.0F, 5.01F);
        this.HornLeft.addBox(-3.0F, 0.0F, -2.0F, 3.0F, 3.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HornLeft, 0.4300491170387584F, 0.5473352640780661F, -0.03909537541112055F);
        this.Tongue = new ModelRenderer(this, 79, 21);
        this.Tongue.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.Tongue.addBox(-1.5F, 0.0F, -10.0F, 3.0F, 0.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tongue, 0.1563815016444822F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 0, 78);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.Tail2.addBox(-4.5F, -5.0F, -2.0F, 9.0F, 10.0F, 17.0F, 0.0F, 0.1F, 0.0F);
        this.Tail4 = new ModelRenderer(this, 66, 4);
        this.Tail4.setRotationPoint(4.0F, 2.0F, 0.0F);
        this.Tail4.addBox(-2.0F, -0.5F, -1.5F, 8.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.03909537541112055F, -0.7819074915776542F, 0.8991936386169619F);
        this.Tail4_1 = new ModelRenderer(this, 66, 4);
        this.Tail4_1.mirror = true;
        this.Tail4_1.setRotationPoint(-4.0F, 2.0F, 0.0F);
        this.Tail4_1.addBox(-6.0F, -0.5F, -1.5F, 8.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4_1, 0.03909537541112055F, 0.7819074915776542F, -0.8991936386169619F);
        this.GillsRight1 = new ModelRenderer(this, 120, -15);
        this.GillsRight1.mirror = true;
        this.GillsRight1.setRotationPoint(-3.5F, 1.0F, 5.01F);
        this.GillsRight1.addBox(0.0F, 0.0F, -5.0F, 0.0F, 10.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(GillsRight1, 0.03909537541112055F, -0.0781907508222411F, 0.19547687289441354F);
        this.GillsLeft1 = new ModelRenderer(this, 120, -15);
        this.GillsLeft1.setRotationPoint(3.5F, 1.0F, 5.01F);
        this.GillsLeft1.addBox(0.0F, 0.0F, -5.0F, 0.0F, 10.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(GillsLeft1, 0.03909537541112055F, 0.0781907508222411F, -0.19547687289441354F);
        this.Waist = new ModelRenderer(this, 0, 26);
        this.Waist.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.Waist.addBox(-3.5F, -4.5F, -2.0F, 7.0F, 9.0F, 17.0F, 0.0F, -0.1F, 0.0F);
        this.LegLeft2 = new ModelRenderer(this, 66, 0);
        this.LegLeft2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.LegLeft2.addBox(-2.0F, -0.5F, -1.5F, 10.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegLeft2, 0.0F, 0.1563815016444822F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 0, 105);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.Tail3.addBox(-4.0F, -5.0F, -2.0F, 8.0F, 10.0F, 17.0F, 0.0F, -0.1F, 0.0F);
        this.Tail6 = new ModelRenderer(this, 31, 1);
        this.Tail6.setRotationPoint(0.0F, 0.0F, 21.0F);
        this.Tail6.addBox(-2.5F, -4.5F, -2.0F, 5.0F, 9.0F, 25.0F, 0.0F, 0.0F, 0.0F);
        this.Tail5 = new ModelRenderer(this, 0, 162);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 19.0F);
        this.Tail5.addBox(-3.0F, -4.0F, -2.0F, 6.0F, 8.0F, 23.0F, 0.0F, 0.0F, 0.0F);
        this.HeadJoint = new ModelRenderer(this, 0, 0);
        this.HeadJoint.setRotationPoint(0.0F, 0.0F, -8.5F);
        this.HeadJoint.addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HeadJoint, 0.23457224414434488F, 0.0F, 0.0F);
        this.TeethUpperLeft = new ModelRenderer(this, 117, 10);
        this.TeethUpperLeft.setRotationPoint(-0.5F, 5.0F, 0.5F);
        this.TeethUpperLeft.addBox(0.0F, -0.0F, -10.01F, 5.0F, 3.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.LegRight2 = new ModelRenderer(this, 66, 0);
        this.LegRight2.mirror = true;
        this.LegRight2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.LegRight2.addBox(-8.0F, -0.5F, -1.5F, 10.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegRight2, 0.0F, -0.1563815016444822F, 0.0F);
        this.GillsRight2 = new ModelRenderer(this, 150, -15);
        this.GillsRight2.mirror = true;
        this.GillsRight2.setRotationPoint(-4.9F, 0.0F, 5.01F);
        this.GillsRight2.addBox(0.0F, 0.0F, -2.0F, 0.0F, 8.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(GillsRight2, 0.23457224414434488F, -0.35185837453889574F, 0.03909537541112055F);
        this.Tail1 = new ModelRenderer(this, 0, 52);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.Tail1.addBox(-4.0F, -4.5F, -2.0F, 8.0F, 9.0F, 17.0F, 0.0F, 0.1F, 0.0F);
        this.LegRight1 = new ModelRenderer(this, 33, 0);
        this.LegRight1.mirror = true;
        this.LegRight1.setRotationPoint(-2.0F, 4.0F, 25.0F);
        this.LegRight1.addBox(-6.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegRight1, 0.0F, 0.9382889765773795F, -1.13376586611655F);
        this.Tail8 = new ModelRenderer(this, 52, 72);
        this.Tail8.setRotationPoint(0.0F, 0.0F, 25.0F);
        this.Tail8.addBox(-1.0F, -5.5F, -2.0F, 2.0F, 11.0F, 29.0F, 0.0F, 0.0F, 0.0F);
        this.LegLeft1 = new ModelRenderer(this, 33, 0);
        this.LegLeft1.setRotationPoint(2.0F, 4.0F, 25.0F);
        this.LegLeft1.addBox(-2.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LegLeft1, 0.0F, -0.9382889765773795F, 1.13376586611655F);
        this.HeadRight = new ModelRenderer(this, 77, 0);
        this.HeadRight.mirror = true;
        this.HeadRight.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.HeadRight.addBox(-5.0F, -1.0F, -10.0F, 5.0F, 6.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HeadRight, -0.19547687289441354F, -0.03909537541112055F, 0.19547687289441354F);
        this.TeethUpperRight = new ModelRenderer(this, 117, 10);
        this.TeethUpperRight.mirror = true;
        this.TeethUpperRight.setRotationPoint(0.5F, 5.0F, 0.5F);
        this.TeethUpperRight.addBox(-5.0F, -0.0F, -10.01F, 5.0F, 3.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.HornRight = new ModelRenderer(this, 102, 0);
        this.HornRight.mirror = true;
        this.HornRight.setRotationPoint(-4.9F, -1.0F, 5.01F);
        this.HornRight.addBox(0.0F, 0.0F, -2.0F, 3.0F, 3.0F, 12.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(HornRight, 0.4300491170387584F, -0.5473352640780661F, 0.03909537541112055F);
        this.TeethLowerLeft = new ModelRenderer(this, 118, 29);
        this.TeethLowerLeft.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.TeethLowerLeft.addBox(0.0F, -2.0F, -10.01F, 4.0F, 2.0F, 15.0F, 0.0F, 0.0F, 0.0F);
        this.Tail6.addChild(this.Tail7);
        this.Tail8.addChild(this.Tail9);
        this.Tail3.addChild(this.Tail4_2);
        this.HeadJoint.addChild(this.HeadLeft);
        this.Jaw.addChild(this.TeethLowerRight);
        this.HeadLeft.addChild(this.GillsLeft2);
        this.Torso.addChild(this.Jaw);
        this.HeadLeft.addChild(this.HornLeft);
        this.Jaw.addChild(this.Tongue);
        this.Tail1.addChild(this.Tail2);
        this.Tail1.addChild(this.Tail4);
        this.Tail1.addChild(this.Tail4_1);
        this.HeadRight.addChild(this.GillsRight1);
        this.HeadLeft.addChild(this.GillsLeft1);
        this.Torso.addChild(this.Waist);
        this.LegLeft1.addChild(this.LegLeft2);
        this.Tail2.addChild(this.Tail3);
        this.Tail5.addChild(this.Tail6);
        this.Tail4_2.addChild(this.Tail5);
        this.Torso.addChild(this.HeadJoint);
        this.HeadLeft.addChild(this.TeethUpperLeft);
        this.LegRight1.addChild(this.LegRight2);
        this.HeadRight.addChild(this.GillsRight2);
        this.Waist.addChild(this.Tail1);
        this.Tail6.addChild(this.LegRight1);
        this.Tail7.addChild(this.Tail8);
        this.Tail6.addChild(this.LegLeft1);
        this.HeadJoint.addChild(this.HeadRight);
        this.HeadRight.addChild(this.TeethUpperRight);
        this.HeadRight.addChild(this.HornRight);
        this.Jaw.addChild(this.TeethLowerLeft);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.Torso).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(ImugiWarmEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
