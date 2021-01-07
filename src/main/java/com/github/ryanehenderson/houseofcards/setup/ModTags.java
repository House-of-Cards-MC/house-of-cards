package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> OCEANIC_DRAGONSTONE = forge("cobblestone/oceanic_dragonstone");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(HouseOfCards.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> OCEANIC_DRAGONSTONE = forge("cobblestone/oceanic_dragonstone");
        public static final ITag.INamedTag<Item> TURTLE_FLESH = mod("food/turtle_flesh");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(HouseOfCards.MOD_ID, path).toString());
        }
    }
}
