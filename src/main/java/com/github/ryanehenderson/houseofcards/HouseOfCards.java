package com.github.ryanehenderson.houseofcards;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("houseofcards")
public class HouseOfCards {
    private static HouseOfCards instance;
    private static final String modId = "houseofcards";
    private static final Logger logger = LogManager.getLogger(modId);

    public HouseOfCards() {
        instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        logger.info("Setup method registered");
    }

    private void clientRegistries(final FMLClientSetupEvent event) {
        logger.info("clientRegistries method registered");
    }

    public static HouseOfCards get() {
        return instance;
    }

    private String getModId() {
        return modId;
    }
}
