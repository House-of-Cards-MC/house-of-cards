package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;

public class ModSounds {
    static void register() {}

    public static final RegistryObject<SoundEvent> IMUGI_BITE = Registration.SOUNDS.register("entity.imugi.bite", () ->
            new SoundEvent(new ResourceLocation(HouseOfCards.MOD_ID, "sounds/entity/imugi/imugi_bite")));
    public static final RegistryObject<SoundEvent> IMUGI_IDLE = Registration.SOUNDS.register("imugi_idle", () ->
            new SoundEvent(new ResourceLocation(HouseOfCards.MOD_ID, "imugi_idle")));
    public static final RegistryObject<SoundEvent> IMUGI_HURT = Registration.SOUNDS.register("entity.imugi.hurt", () ->
            new SoundEvent(new ResourceLocation(HouseOfCards.MOD_ID, "sounds/entity/imugi/imugi_hurt.ogg")));
    public static final RegistryObject<SoundEvent> IMUGI_DEATH = Registration.SOUNDS.register("imugi_death", () ->
            new SoundEvent(new ResourceLocation(HouseOfCards.MOD_ID, "imugi_death")));
}
