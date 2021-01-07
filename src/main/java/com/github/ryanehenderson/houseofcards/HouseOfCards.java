package com.github.ryanehenderson.houseofcards;

import com.github.ryanehenderson.houseofcards.lists.BlockList;
import com.github.ryanehenderson.houseofcards.lists.ItemList;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                    ItemList.turtle_flesh = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(getLocation("turtle_flesh")),
                    ItemList.oceanic_dragonstone = new BlockItem(BlockList.oceanic_dragonstone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.oceanic_dragonstone.getRegistryName())
            );

            logger.info("Items registered");
        }

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(
                    BlockList.oceanic_dragonstone = new Block(Block.Properties.create(Material.IRON)).setRegistryName(getLocation("oceanic_dragonstone"))
            );
            logger.info("Blocks registered");
        }

        private static ResourceLocation getLocation(String name) {
            return new ResourceLocation(modId, name);
        }
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
