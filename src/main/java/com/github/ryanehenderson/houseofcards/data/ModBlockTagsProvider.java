package com.github.ryanehenderson.houseofcards.data;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.setup.ModBlocks;
import com.github.ryanehenderson.houseofcards.setup.ModItems;
import com.github.ryanehenderson.houseofcards.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, HouseOfCards.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.OCEANIC_DRAGONSTONE).add(ModBlocks.OCEANIC_DRAGONSTONE.get());
        getOrCreateBuilder(Tags.Blocks.COBBLESTONE).addTag(ModTags.Blocks.OCEANIC_DRAGONSTONE);
    }
}
