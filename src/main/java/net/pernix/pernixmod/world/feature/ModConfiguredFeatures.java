package net.pernix.pernixmod.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.pernix.pernixmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_COTTON;

    static{
        PATCH_COTTON = ConfiguredFeatures.register(
                "pernixmod:patch_cotton",
                Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                                BlockStateProvider.of(ModBlocks.COTTON_CROP)),
                        List.of(Blocks.GRASS_BLOCK)));
    }
}
