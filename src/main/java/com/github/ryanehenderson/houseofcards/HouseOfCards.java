package com.github.ryanehenderson.houseofcards;

import com.github.ryanehenderson.houseofcards.setup.ClientSetup;
import com.github.ryanehenderson.houseofcards.setup.ModEntitySpawns;
import com.github.ryanehenderson.houseofcards.setup.ModSetup;
import com.github.ryanehenderson.houseofcards.setup.Registration;
import jdk.jfr.Event;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("houseofcards")
public class HouseOfCards {
    public static HouseOfCards instance;
    public static final String MOD_ID = "houseofcards";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public HouseOfCards() {
        instance = this;
        Registration.register();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, ModEntitySpawns::onBiomeLoadingEvent);
    }
}
