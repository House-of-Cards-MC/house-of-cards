package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.entities.HermitDragonSageEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    static void register() {}
    public static final RegistryObject<Item> TURTLE_FLESH = Registration.ITEMS.register("turtle_flesh", () ->
            new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> HERMIT_DRAGON_SAGE_SPAWN_EGG = Registration.ITEMS.register("hermit_dragon_sage_spawn_egg", () ->
            new SpawnEggItem(ModEntities.HERMIT_DRAGON_SAGE.get(), 50, 100, new Item.Properties().group(ItemGroup.MISC)));
}
