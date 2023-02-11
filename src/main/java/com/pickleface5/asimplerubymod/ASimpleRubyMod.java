package com.pickleface5.asimplerubymod;

import com.mojang.logging.LogUtils;
import com.pickleface5.asimplerubymod.init.BlocksInit;
import com.pickleface5.asimplerubymod.init.ItemsInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ASimpleRubyMod.MODID)
public class ASimpleRubyMod {
    public static final String MODID = "asimplerubymod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ASimpleRubyMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemsInit.ITEMS.register(modEventBus);
        BlocksInit.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.getEntries().putAfter(Items.EMERALD_BLOCK.getDefaultInstance(), ItemsInit.RUBY_BLOCK_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        } else if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.getEntries().putAfter(Items.DEEPSLATE_EMERALD_ORE.getDefaultInstance(), ItemsInit.RUBY_ORE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemsInit.RUBY_ORE_ITEM.get().getDefaultInstance(), ItemsInit.DEEPSLATE_RUBY_ORE_ITEM.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        } else if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.getEntries().putAfter(Items.EMERALD.getDefaultInstance(), ItemsInit.RUBY.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        } else if (event.getTab() == CreativeModeTabs.COMBAT) {
            event.getEntries().putAfter(Items.DIAMOND_SWORD.getDefaultInstance(), ItemsInit.RUBY_SWORD.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_AXE.getDefaultInstance(), ItemsInit.RUBY_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_BOOTS.getDefaultInstance(), ItemsInit.RUBY_HELMET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemsInit.RUBY_HELMET.get().getDefaultInstance(), ItemsInit.RUBY_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemsInit.RUBY_CHESTPLATE.get().getDefaultInstance(), ItemsInit.RUBY_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemsInit.RUBY_LEGGINGS.get().getDefaultInstance(), ItemsInit.RUBY_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.DIAMOND_HORSE_ARMOR.getDefaultInstance(), ItemsInit.RUBY_HORSE_ARMOR.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        } else if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.getEntries().putAfter(Items.DIAMOND_HOE.getDefaultInstance(), ItemsInit.RUBY_SHOVEL.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemsInit.RUBY_SHOVEL.get().getDefaultInstance(), ItemsInit.RUBY_PICKAXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemsInit.RUBY_PICKAXE.get().getDefaultInstance(), ItemsInit.RUBY_AXE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(ItemsInit.RUBY_AXE.get().getDefaultInstance(), ItemsInit.RUBY_HOE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
