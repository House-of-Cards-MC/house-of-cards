package com.github.ryanehenderson.houseofcards.data;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.setup.ModItems;
import com.github.ryanehenderson.houseofcards.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, HouseOfCards.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(ModTags.Blocks.OCEANIC_DRAGONSTONE, ModTags.Items.OCEANIC_DRAGONSTONE);
        copy(Tags.Blocks.COBBLESTONE, Tags.Items.COBBLESTONE);
        getOrCreateBuilder(ModTags.Items.TURTLE_FLESH).add(ModItems.TURTLE_FLESH.get());
    }
}
