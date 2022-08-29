package net.pernix.pernixmod.world.feature;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFeatures {
    public static void init(){
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(
                        RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","savanna")),
                        RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","savanna_plateau")),
                        RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","windswept_savanna")),
                        BiomeKeys.WOODED_BADLANDS, BiomeKeys.DESERT, BiomeKeys.BADLANDS, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PATCH_COTTON_PLACED.getKey().get());
    }
}
