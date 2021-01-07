package com.github.ryanehenderson.houseofcards.data.client;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, HouseOfCards.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("oceanic_dragonstone", modLoc("block/oceanic_dragonstone"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "turtle_flesh");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
