package net.prinzherbert.aeternam.entity.render;

import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.prinzherbert.aeternam.Aeternam;

public class AeternamBoatRenderer extends BoatRenderer {
    private static final ResourceLocation BOAT_TEXTURE =
            new ResourceLocation(Aeternam.MOD_ID, "textures/entity/boat/aeternam.png");

    public AeternamBoatRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, false);
    }

    public static ResourceLocation getBoatTexture() {
        return BOAT_TEXTURE;
    }
}
