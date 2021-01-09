package com.github.ryanehenderson.houseofcards.setup;

import com.github.ryanehenderson.houseofcards.HouseOfCards;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModEntitySpawns {
    public static void onBiomeLoadingEvent(final BiomeLoadingEvent event) {
        MobSpawnInfoBuilder spawns = event.getSpawns();

        Biome.Category biomeCategory = event.getCategory();
        HouseOfCards.LOGGER.debug("Loading biome: " + biomeCategory + ", " + event.getClimate());

        if (biomeCategory == Biome.Category.OCEAN) {
            HouseOfCards.LOGGER.debug("Ocean biome loading");
            List<MobSpawnInfo.Spawners> waterCreatureSpawners = spawns.getSpawner(EntityClassification.WATER_CREATURE);
            HouseOfCards.LOGGER.debug("Spawners: " + waterCreatureSpawners);
            waterCreatureSpawners.add(new MobSpawnInfo.Spawners(ModEntities.IMUGI_COLD.get(), 200, 10, 50));
            HouseOfCards.LOGGER.debug("IMUGI_COLD added. Spawners: " + waterCreatureSpawners);
        }
    }
}
