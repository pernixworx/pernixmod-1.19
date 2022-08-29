package net.pernix.pernixmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.pernix.pernixmod.item.ModItems;

public class CottonCropBlock extends CropBlock {

    public static IntProperty AGE = IntProperty.of("age",0 ,6);

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.COTTON_SEEDS;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public CottonCropBlock(Settings settings) {
        super(settings);
    }
}
