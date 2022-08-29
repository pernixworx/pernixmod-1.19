package net.pernix.pernixmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pernix.pernixmod.PernixMod;

public class ModItemGroup {
    public static final ItemGroup RAW_CHITIN = FabricItemGroupBuilder.build(new Identifier(PernixMod.MOD_ID, "raw_chitin"), () -> new ItemStack(ModItems.RAW_CHITIN));
}

