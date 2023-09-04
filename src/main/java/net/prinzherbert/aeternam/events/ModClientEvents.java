package net.prinzherbert.aeternam.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.prinzherbert.aeternam.Aeternam;
import net.prinzherbert.aeternam.entity.ModEntityTypes;
import net.prinzherbert.aeternam.entity.render.AeternamBoatRenderer;

@Mod.EventBusSubscriber(modid = Aeternam.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypes.AETERNAM_BOAT.get(), AeternamBoatRenderer::new);
    }
}
