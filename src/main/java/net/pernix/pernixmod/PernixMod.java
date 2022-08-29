package net.pernix.pernixmod;

import net.fabricmc.api.ModInitializer;
import net.pernix.pernixmod.block.ModBlocks;
import net.pernix.pernixmod.item.ModItems;
import net.pernix.pernixmod.util.ModLootTableModifiers;
import net.pernix.pernixmod.util.ModRegistries;
import net.pernix.pernixmod.world.gen.ModWorldGen;
import net.pernix.pernixmod.world.feature.ModFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class PernixMod implements ModInitializer {
	public static final String MOD_ID = "pernixmod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		GeckoLib.initialize();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();

		ModFeatures.init();
		ModLootTableModifiers.modifyLootTables();
	}
}
