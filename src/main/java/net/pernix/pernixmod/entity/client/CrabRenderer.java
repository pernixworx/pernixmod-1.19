package net.pernix.pernixmod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.pernix.pernixmod.PernixMod;
import net.pernix.pernixmod.entity.custom.CrabEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CrabRenderer extends GeoEntityRenderer<CrabEntity> {
    public CrabRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new CrabModel());
    }

    @Override
    public Identifier getTextureResource(CrabEntity instance) {
        return new Identifier(PernixMod.MOD_ID, "textures/entity/crab/crab.png");
    }
}
