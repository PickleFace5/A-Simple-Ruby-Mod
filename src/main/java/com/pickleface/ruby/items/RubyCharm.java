package com.pickleface.ruby.items;

import com.pickleface.ruby.Ruby;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

public class RubyCharm extends Item {
    public RubyCharm() {
        super(new Item.Properties()
                .maxStackSize(1)
                .rarity(Rarity.UNCOMMON)
                .group(Ruby.TAB)
        );
    }
}
