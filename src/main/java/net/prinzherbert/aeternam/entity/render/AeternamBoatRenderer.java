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
    private final Map<Boat.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

    public AeternamBoatRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, false);
        this.boatResources = Stream.of(Boat.Type.OAK).collect(ImmutableMap.toImmutableMap((boatType) -> {
            return boatType;
        }, (boatType) -> {
            return Pair.of(new ResourceLocation(Aeternam.MOD_ID, "textures/entity/boat/aeternam_boat"), this.createBoatModel(pContext, boatType, false));
        }));
    }

    private ListModel<Boat> createBoatModel(EntityRendererProvider.Context pContext, Boat.Type pType, boolean pChestBoat) {
        ModelLayerLocation modellayerlocation = ModelLayers.createBoatModelName(Boat.Type.OAK);
        ModelPart modelpart = pContext.bakeLayer(modellayerlocation);
        return (ListModel<Boat>)(new BoatModel(modelpart));
    }
}
