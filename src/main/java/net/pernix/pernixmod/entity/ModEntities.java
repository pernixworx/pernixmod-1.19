package net.pernix.pernixmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pernix.pernixmod.PernixMod;
import net.pernix.pernixmod.entity.custom.CrabEntity;
import net.pernix.pernixmod.entity.custom.SnailEntity;

public class ModEntities {

    public static final EntityType<SnailEntity> SNAIL = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(PernixMod.MOD_ID, "snail"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SnailEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());

    public static final EntityType<CrabEntity> CRAB = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(PernixMod.MOD_ID, "crab"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CrabEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());
}
