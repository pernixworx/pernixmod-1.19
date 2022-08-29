package net.pernix.pernixmod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.pernix.pernixmod.PernixMod;
import net.pernix.pernixmod.entity.custom.SnailEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SnailRenderer extends GeoEntityRenderer<SnailEntity> {
    public SnailRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SnailModel());
    }

    @Override
    public Identifier getTextureResource(SnailEntity instance) {
        return new Identifier(PernixMod.MOD_ID, "textures/entity/snail/snail.png");
    }
}
