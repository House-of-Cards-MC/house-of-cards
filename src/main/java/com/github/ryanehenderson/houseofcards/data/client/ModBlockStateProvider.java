package com.github.ryanehenderson.houseofcards.data.client;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import com.github.ryanehenderson.houseofcards.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, HouseOfCards.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.OCEANIC_DRAGONSTONE.get());
    }
}
