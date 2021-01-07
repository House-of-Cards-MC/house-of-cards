package com.github.ryanehenderson.houseofcards.setup;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    static void register() {}
    public static final RegistryObject<Item> TURTLE_FLESH = Registration.ITEMS.register("turtle_flesh", () ->
            new Item(new Item.Properties().group(ItemGroup.MISC)));

}
