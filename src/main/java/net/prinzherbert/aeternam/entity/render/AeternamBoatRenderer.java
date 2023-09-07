package net.prinzherbert.aeternam.entity.render;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.prinzherbert.aeternam.Aeternam;

import java.util.Map;
import java.util.stream.Stream;

public class AeternamBoatRenderer extends BoatRenderer {

    public AeternamBoatRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, false);
    }

    @Override
    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(Boat boat) {
        return Pair.of(new ResourceLocation(Aeternam.MOD_ID, "textures/entity/boat/aeternam_boat.png"), super.getModelWithLocation(boat).getSecond());
    }
}
