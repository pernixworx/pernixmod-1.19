package net.pernix.pernixmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.pernix.pernixmod.world.feature.ModFeatures;
import net.pernix.pernixmod.world.feature.ModPlacedFeatures;

import java.util.Collection;

public class FeatureGeneration {
    public static void generateFeature() {
        generatePlantCategory(BiomeCategories.SAVANNA, ModPlacedFeatures.PATCH_COTTON_PLACED.getKey().get());
    }

    private static void generatePlantCategory(Collection<RegistryKey<Biome>> biome, RegistryKey<PlacedFeature> feature) {
        BiomeModifications.addFeature((context) ->
                        BiomeSelectors.includeByKey(biome).test(context),
                GenerationStep.Feature.VEGETAL_DECORATION, feature);
    }

    private static void generatePlantTemp(int lessTemp, int greatTemp, RegistryKey<PlacedFeature> feature) {
        BiomeModifications.addFeature((context) ->
                        context.getBiome().getTemperature() < lessTemp && context.getBiome().getTemperature() > greatTemp,
                GenerationStep.Feature.VEGETAL_DECORATION, feature);
    }
}

