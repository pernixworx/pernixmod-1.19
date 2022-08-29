package net.pernix.pernixmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.state.property.BooleanProperty;
import net.pernix.pernixmod.block.ModBlocks;
import net.pernix.pernixmod.entity.ModEntities;
import net.pernix.pernixmod.entity.client.CrabRenderer;
import net.pernix.pernixmod.entity.client.SnailRenderer;

public class PernixModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COTTON_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BULB, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.SNAIL, SnailRenderer::new);
        EntityRendererRegistry.register(ModEntities.CRAB, CrabRenderer::new);


    }

}
