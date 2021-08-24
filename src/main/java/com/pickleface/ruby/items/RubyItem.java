package com.pickleface.ruby.items;

import com.pickleface.ruby.Ruby;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RubyItem extends Item {
    public RubyItem() {
        super(new Item.Properties().group(Ruby.TAB));
    }
}
