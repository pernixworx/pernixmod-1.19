package net.pernix.pernixmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> PATCH_COTTON_PLACED;

    static {
        PATCH_COTTON_PLACED = PlacedFeatures.register(
                "pernixmod:patch_cotton",
                ModConfiguredFeatures.PATCH_COTTON,
                new PlacementModifier[]{
                        RarityFilterPlacementModifier.of(300),
                        SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()});
    }
}
