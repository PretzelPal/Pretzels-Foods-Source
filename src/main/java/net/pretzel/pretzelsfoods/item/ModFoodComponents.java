package net.pretzel.pretzelsfoods.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RAW_PRETZEL = new FoodComponent.Builder().hunger(1).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), 0.3f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(5).saturationModifier(0.2f).build();
    public static final FoodComponent RAW_SAUSAGE = new FoodComponent.Builder().hunger(2).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), 0.3f).build();
    public static final FoodComponent COOKED_PRETZEL = new FoodComponent.Builder().hunger(8).saturationModifier(0.4f).build();
    public static final FoodComponent COOKED_SAUSAGE = new FoodComponent.Builder().hunger(10).saturationModifier(0.4f).build();
    public static final FoodComponent SALTED_PRETZEL = new FoodComponent.Builder().hunger(12).saturationModifier(0.6f).build();
    public static final FoodComponent RAW_HOTDOG = new FoodComponent.Builder().hunger(2).saturationModifier(0f).build();
    public static final FoodComponent COOKED_HOTDOG = new FoodComponent.Builder().hunger(15).saturationModifier(0.8f).build();
    public static final FoodComponent KETCHUP_HOTDOG = new FoodComponent.Builder().hunger(16).saturationModifier(0.9f).build();
    public static final FoodComponent MUSTARD_HOTDOG = new FoodComponent.Builder().hunger(16).saturationModifier(0.9f).build();
}
