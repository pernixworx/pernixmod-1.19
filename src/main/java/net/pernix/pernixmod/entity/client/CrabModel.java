package net.pernix.pernixmod.entity.client;

import net.minecraft.util.Identifier;
import net.pernix.pernixmod.PernixMod;
import net.pernix.pernixmod.entity.custom.CrabEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrabModel extends AnimatedGeoModel<CrabEntity> {
    @Override
    public Identifier getModelResource(CrabEntity object) {
        return new Identifier(PernixMod.MOD_ID, "geo/crab.geo.json");
    }

    @Override
    public Identifier getTextureResource(CrabEntity object) {
        return new Identifier(PernixMod.MOD_ID, "textures/entity/crab/crab.png");
    }

    @Override
    public Identifier getAnimationResource(CrabEntity animatable) {
        return new Identifier(PernixMod.MOD_ID, "animations/crab.animation.json");
    }

}
