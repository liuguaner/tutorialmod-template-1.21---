package com.liuguaner.tutorialmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    //public static final FoodComponent PEACH = (new FoodComponent.Builder()).nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent PEACH = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent GOLDEN_PEACH = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F)
            /*.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1),1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INFESTED, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.OOZING, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAVING, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WIND_CHARGED, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RAID_OMEN, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.TRIAL_OMEN, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 2400, 3), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,2400,3),1.0F)*/
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,2400,3),1.0F)
            .alwaysEdible().build();//alwaysEdible()任何状态下皆可食用
}
