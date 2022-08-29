package net.pernix.pernixmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.pernix.pernixmod.entity.ModEntities;
import net.pernix.pernixmod.entity.custom.CrabEntity;
import net.pernix.pernixmod.entity.custom.SnailEntity;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
        registerCommands();
        registerEvents();
        registerStrippables();
        registerFlammableBlock();
        registerCustomTrades();
        registerAttributes();
    }

    private static void registerFuels() {
//        TutorialMod.LOGGER.info("Registering Fuels for " + TutorialMod.MOD_ID);
//        FuelRegistry registry = FuelRegistry.INSTANCE;
//
//        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }

    private static void registerCommands() {
//        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
//        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerStrippables() {
//        StrippableBlockRegistry.register(ModBlocks.JACARANDA_LOG, ModBlocks.STRIPPED_JACARANDA_LOG);
//        StrippableBlockRegistry.register(ModBlocks.JACARANDA_WOOD, ModBlocks.STRIPPED_JACARANDA_WOOD);
    }

    private static void registerFlammableBlock() {
//        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();
//
//        instance.add(ModBlocks.JACARANDA_LOG, 5, 5);
//        instance.add(ModBlocks.STRIPPED_JACARANDA_LOG, 5, 5);
//        instance.add(ModBlocks.JACARANDA_WOOD, 5, 5);
//        instance.add(ModBlocks.STRIPPED_JACARANDA_WOOD, 5, 5);
//        instance.add(ModBlocks.JACARANDA_PLANKS, 5, 20);
//        instance.add(ModBlocks.JACARANDA_LEAVES, 30, 60);
    }

    private static void registerEvents() {
//        ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }

    private static void registerCustomTrades() {
//        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
//                factories -> {
//                    factories.add((entity, random) -> new TradeOffer(
//                            new ItemStack(Items.EMERALD, 2),
//                            new ItemStack(ModItems.GRAPE, 12),
//                            6,2,0.02f));
//                });

//        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
//                factories -> {
//                    factories.add((entity, random) -> new TradeOffer(
//                            new ItemStack(Items.EMERALD, 6),
//                            new ItemStack(ModItems.MYTHRIL_PICKAXE, 1),
//                            12,7,0.08f));
//                });
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.SNAIL, SnailEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.CRAB, CrabEntity.setAttributes());
    }
}
