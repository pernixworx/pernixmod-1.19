package net.pernix.pernixmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pernix.pernixmod.PernixMod;
import net.pernix.pernixmod.block.custom.CottonCropBlock;
import net.pernix.pernixmod.block.custom.JumpyBlock;
import net.pernix.pernixmod.block.custom.LightBulb;
import net.pernix.pernixmod.item.ModItemGroup;

public class ModBlocks {

    private static final Block CHITIN_BLOCK = registerBlock("chitin_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.RAW_CHITIN);

    private static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.SOIL).strength(4f).requiresTool()), ItemGroup.MISC);

    public static final Block LIGHT_BULB = registerBlock("light_bulb",
            new LightBulb(FabricBlockSettings.of(Material.GLASS).strength(2f).requiresTool()
                    .luminance(state -> state.get(LightBulb.LIT) ? 15 : 0)), ItemGroup.MISC);

    public static final Block COTTON_CROP = registerBlockWithoutItem("cotton_crop",
            new CottonCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(PernixMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(PernixMod.MOD_ID,  name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    private static Block registerBlockWithoutItem(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(PernixMod.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        PernixMod.LOGGER.debug("Registering ModBlocks for " + PernixMod.MOD_ID);
    }
}
