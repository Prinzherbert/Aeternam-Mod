package net.prinzherbert.aeternam.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.prinzherbert.aeternam.Aeternam;
import net.minecraftforge.registries.ForgeRegistries;
import net.prinzherbert.aeternam.entity.custom.AeternamBoatEntity;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Aeternam.MOD_ID);

    public static final RegistryObject<EntityType<AeternamBoatEntity>> AETERNAM_BOAT =
            ENTITY_TYPES.register("aeternam_boat",
                    () -> EntityType.Builder.of(AeternamBoatEntity::new, MobCategory.MISC).sized(1.375f, 0.5625f)
                            .build(new ResourceLocation(Aeternam.MOD_ID, "aeternam_boat").toString()));

    public static void register(IEventBus eventBus) { ENTITY_TYPES.register(eventBus); }
}
