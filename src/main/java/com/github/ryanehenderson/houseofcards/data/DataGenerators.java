package com.github.ryanehenderson.houseofcards.data;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.data.client.ModBlockStateProvider;
import com.github.ryanehenderson.houseofcards.data.client.ModItemModelProvider;
import com.github.ryanehenderson.houseofcards.data.client.ModLanguageProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = HouseOfCards.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModLanguageProvider(gen, "en_us"));
        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(gen, existingFileHelper);
        gen.addProvider(blockTagsProvider);
        gen.addProvider(new ModItemTagsProvider(gen, blockTagsProvider, existingFileHelper));
    }
}
