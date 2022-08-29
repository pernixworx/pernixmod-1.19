/*
 * Decompiled with CFR 0.1.1 (FabricMC 57d88659).
 */
package net.pernix.pernixmod.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidFillable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import net.pernix.pernixmod.entity.DryBucketable;
import org.jetbrains.annotations.Nullable;

public class PernixEntityBucketItem
        extends WoodBucketItem {
    private final EntityType<?> entityType;
    private final SoundEvent emptyingSound;

    public PernixEntityBucketItem(EntityType<?> type, Fluid fluid, SoundEvent emptyingSound, Item.Settings settings) {
        super(fluid, settings, type);
        this.entityType = type;
        this.emptyingSound = emptyingSound;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockHitResult blockHitResult = WoodBucketItem.raycast(world, user, RaycastContext.FluidHandling.NONE);
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return TypedActionResult.pass(itemStack);
        }
        if (blockHitResult.getType() == HitResult.Type.BLOCK) {
            BlockPos blockPos3;
            BlockPos blockPos = blockHitResult.getBlockPos();
            Direction direction = blockHitResult.getSide();
            BlockPos blockPos2 = blockPos.offset(direction);
            if (!world.canPlayerModifyAt(user, blockPos) || !user.canPlaceOn(blockPos2, direction, itemStack)) {
                return TypedActionResult.fail(itemStack);
            }

            BlockState blockState = world.getBlockState(blockPos);
            BlockPos blockPos4 = blockPos3 = blockState.getBlock() instanceof FluidFillable && this.fluid == Fluids.WATER ? blockPos : blockPos2;

            this.onEmptied(user, world, itemStack, blockPos3);
            user.incrementStat(Stats.USED.getOrCreateStat(this));
            return TypedActionResult.success(net.pernix.pernixmod.item.WoodBucketItem.getEmptiedStack(itemStack, user), world.isClient());
        }
        return TypedActionResult.pass(itemStack);
    }



    @Override
    public void onEmptied(@Nullable PlayerEntity player, World world, ItemStack stack, BlockPos pos) {
        if (world instanceof ServerWorld) {
            this.spawnEntity((ServerWorld)world, stack, pos);
            world.emitGameEvent((Entity)player, GameEvent.ENTITY_PLACE, pos);
        }
    }

    @Override
    protected void playEmptyingSound(@Nullable PlayerEntity player, WorldAccess world, BlockPos pos) {
        world.playSound(player, pos, this.emptyingSound, SoundCategory.NEUTRAL, 1.0f, 1.0f);
    }

    private void spawnEntity(ServerWorld world, ItemStack stack, BlockPos pos) {
        pos.add(0,1,0);
        Entity entity = this.entityType.spawnFromItemStack(world, stack, null, pos, SpawnReason.BUCKET, true, false);
        DryBucketable drybucketable = (DryBucketable)((Object)entity);
        drybucketable.copyDataFromNbt(stack.getOrCreateNbt());
        drybucketable.setFromBucket(true);
    }
}



