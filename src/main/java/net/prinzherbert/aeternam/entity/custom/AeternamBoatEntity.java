package net.prinzherbert.aeternam.entity.custom;

import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import net.prinzherbert.aeternam.Aeternam;
import net.prinzherbert.aeternam.entity.ModEntityTypes;
import net.prinzherbert.aeternam.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class AeternamBoatEntity extends Boat {
    public AeternamBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public AeternamBoatEntity(Level pLevel, double pX, double pY, double pZ) {
        this(ModEntityTypes.AETERNAM_BOAT.get(), pLevel);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
        setNoGravity(true);
    }

    @Nullable
    @Override
    protected SoundEvent getPaddleSound() {
        return SoundEvents.BEACON_AMBIENT;
    }

    @Override
    public Item getDropItem() {
        return ModItems.AETERNAM_BOAT.get();
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }

    @Override
    public void setNoGravity(boolean pNoGravity) {
        super.setNoGravity(pNoGravity);
    }

    @Override
    public ItemStack getPickedResult(HitResult target) {
        return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(Aeternam.MOD_ID, "aeternam_boat")));
    }
}
