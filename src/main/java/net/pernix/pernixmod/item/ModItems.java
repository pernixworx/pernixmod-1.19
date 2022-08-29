package net.pernix.pernixmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pernix.pernixmod.PernixMod;
import net.pernix.pernixmod.block.ModBlocks;
import net.pernix.pernixmod.entity.ModEntities;
import net.pernix.pernixmod.item.custom.EightBallItem;

public class ModItems {

    public static final Item RAW_CHITIN = registerItem("raw_chitin",
            new Item(new FabricItemSettings().group(ModItemGroup.RAW_CHITIN)));

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item SNAIL_BUCKET = registerItem("snail_bucket",
            new PernixEntityBucketItem(ModEntities.SNAIL, Fluids.EMPTY, SoundEvents.BLOCK_GRAVEL_PLACE, new Item.Settings().maxCount(1).group(ItemGroup.MISC)));

    public static final Item CRAB_BUCKET = registerItem("crab_bucket",
            new PernixEntityBucketItem(ModEntities.CRAB, Fluids.EMPTY, SoundEvents.ITEM_BUCKET_EMPTY_AXOLOTL, new Item.Settings().maxCount(1).group(ItemGroup.MISC)));

    public static final Item WOODEN_BUCKET = registerItem("wooden_bucket",
            new WoodBucketItem(Fluids.EMPTY, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1), null));

    public static final Item COTTON_SEEDS = registerItem("cotton_seeds",
            new AliasedBlockItem(ModBlocks.COTTON_CROP, new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item COTTON = registerItem("cotton",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SNAIL_SPAWN_EGG = registerItem("snail_spawn_egg",
            new SpawnEggItem(ModEntities.SNAIL, 0x111111, 0x222222,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PernixMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        PernixMod.LOGGER.debug("Registering Mod Items for " + PernixMod.MOD_ID);
    }
}
