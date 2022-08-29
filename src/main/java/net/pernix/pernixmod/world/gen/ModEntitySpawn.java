package net.pernix.pernixmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.mixin.object.builder.SpawnRestrictionAccessor;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.pernix.pernixmod.entity.ModEntities;

public class ModEntitySpawn {
    public static void addEntitySpawn(){
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SWAMP, BiomeKeys.FOREST,
                        BiomeKeys.JUNGLE, BiomeKeys.BIRCH_FOREST, BiomeKeys.DARK_FOREST, BiomeKeys.FLOWER_FOREST,
                        BiomeKeys.MUSHROOM_FIELDS, BiomeKeys.SUNFLOWER_PLAINS),
                SpawnGroup.CREATURE, ModEntities.SNAIL, 25, 1,2);
        SpawnRestrictionAccessor.callRegister(ModEntities.SNAIL, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING, AnimalEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.DESERT),
                SpawnGroup.CREATURE, ModEntities.CRAB, 200, 1,2);
        SpawnRestrictionAccessor.callRegister(ModEntities.CRAB, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.WORLD_SURFACE, AnimalEntity::isValidNaturalSpawn);
    }
}
