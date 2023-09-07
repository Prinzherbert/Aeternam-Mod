package net.prinzherbert.aeternam.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties AERIAL_APPLE = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(4)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 200), 1f)
            .build();

}
