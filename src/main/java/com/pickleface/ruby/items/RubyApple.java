package com.pickleface.ruby.items;

import com.pickleface.ruby.Ruby;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RubyApple extends Item {

    public RubyApple() {
        super(new Properties()
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(9.6F)
                        .setAlwaysEdible()
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 200, 3), 1)
                        .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 1200, 1), 1)
                        .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 1, 100), 1)
                        .build()
                )
                .group(Ruby.TAB)
        );
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
