package com.pickleface.ruby.items;

import com.pickleface.ruby.Ruby;
import com.pickleface.ruby.util.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;

public class RubyMusicDisc extends MusicDiscItem {
    public RubyMusicDisc() {
        super(14, RegistryHandler.MUSIC_DISC_PEACE_AND_TRANQUILITY, new Item.Properties().maxStackSize(1).rarity(Rarity.RARE).group(Ruby.TAB));
    }
}
