package net.pernix.pernixmod.entity.client;

import net.minecraft.util.Identifier;
import net.pernix.pernixmod.PernixMod;
import net.pernix.pernixmod.entity.custom.SnailEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SnailModel extends AnimatedGeoModel<SnailEntity> {
    @Override
    public Identifier getModelResource(SnailEntity object) {
        return new Identifier(PernixMod.MOD_ID, "geo/snail.geo.json");
    }

    @Override
    public Identifier getTextureResource(SnailEntity object) {
        return new Identifier(PernixMod.MOD_ID, "textures/entity/snail/snail.png");
    }

    @Override
    public Identifier getAnimationResource(SnailEntity animatable) {
        return new Identifier(PernixMod.MOD_ID, "animations/snail.animation.json");
    }

}
