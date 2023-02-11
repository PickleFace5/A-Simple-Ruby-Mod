package com.pickleface5.asimplerubymod.items;

import com.pickleface5.asimplerubymod.init.ItemsInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModTiers implements Tier {
   RUBY(3, 1816, 10.0F, 3.5F, 15, () -> {
      return Ingredient.of(ItemsInit.RUBY.get());
   });

   private final int level;
   private final int uses;
   private final float speed;
   private final float damage;
   private final int enchantmentValue;
   private final Supplier<Ingredient> repairIngredient;

   ModTiers(int pLevel, int pUses, float pSpeed, float pDamage, int pEnchantmentValue, Supplier<Ingredient> pRepairIngredient) {
      this.level = pLevel;
      this.uses = pUses;
      this.speed = pSpeed;
      this.damage = pDamage;
      this.enchantmentValue = pEnchantmentValue;
      this.repairIngredient = pRepairIngredient;
   }

   public int getUses() {
      return this.uses;
   }

   public float getSpeed() {
      return this.speed;
   }

   public float getAttackDamageBonus() {
      return this.damage;
   }

   public int getLevel() {
      return this.level;
   }

   public int getEnchantmentValue() {
      return this.enchantmentValue;
   }

   public Ingredient getRepairIngredient() {
      return this.repairIngredient.get();
   }

   public net.minecraft.tags.@NotNull TagKey<net.minecraft.world.level.block.Block> getTag() {
      return BlockTags.NEEDS_DIAMOND_TOOL;
   }
}
