package com.github.ryanehenderson.houseofcards.data.client;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.setup.ModBlocks;
import com.github.ryanehenderson.houseofcards.setup.ModEntities;
import com.github.ryanehenderson.houseofcards.setup.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, HouseOfCards.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        // Blocks
        add(ModBlocks.OCEANIC_DRAGONSTONE.get(), "Oceanic Dragonstone");

        // Items
        add(ModItems.TURTLE_FLESH.get(), "Turtle Flesh");
        add(ModItems.HERMIT_DRAGON_SAGE_SPAWN_EGG.get(), "Hermit Dragon Sage Spawn Egg");

        // Entities
        add(ModEntities.HERMIT_DRAGON_SAGE.get(), "Hermit Dragon Sage");
        add(ModEntities.CYCARP.get(), "Cycarp");
    }
}
