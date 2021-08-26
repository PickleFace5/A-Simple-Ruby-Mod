package com.pickleface.ruby.util;

import com.pickleface.ruby.Ruby;
import com.pickleface.ruby.armor.ModArmorMaterial;
import com.pickleface.ruby.blocks.BlockItemBase;
import com.pickleface.ruby.blocks.RubyBlock;
import com.pickleface.ruby.blocks.RubyOre;
import com.pickleface.ruby.items.RubyApple;
import com.pickleface.ruby.items.RubyItem;
import com.pickleface.ruby.items.RubyMusicDisc;
import com.pickleface.ruby.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.particles.ParticleType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class RegistryHandler {
    public static final DeferredRegister<Enchantment> ENCHANTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Ruby.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ruby.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ruby.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Ruby.MOD_ID);
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Ruby.MOD_ID);

    public static void init() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        SOUNDS.register(modEventBus);
        BLOCKS.register(modEventBus);
        PARTICLES.register(modEventBus);
        ITEMS.register(modEventBus);
    }

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", RubyItem::new);
    public static final RegistryObject<RubyApple> RUBY_APPLE = ITEMS.register("ruby_apple", RubyApple::new);
    public static final RegistryObject<MusicDiscItem> MUSIC_DISC_P_A_T = ITEMS.register("music_disc_peace_and_tranquility", RubyMusicDisc::new);

    // Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 7, -2.4F, new Item.Properties().group(Ruby.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 8, -3.0F, new Item.Properties().group(Ruby.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 4, -2.8F, new Item.Properties().group(Ruby.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 6, -3.0F, new Item.Properties().group(Ruby.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, 0, 0, new Item.Properties().group(Ruby.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Ruby.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Ruby.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Ruby.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Ruby.TAB)));
    public static final RegistryObject<HorseArmorItem> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () ->
            new HorseArmorItem(15, new ResourceLocation(Ruby.MOD_ID + ":textures/entity/horse/armor/horse_armor_ruby.png"), new Item.Properties().group(Ruby.TAB)));

    // Blocks
    public static final RegistryObject<Block> BLOCK_OF_RUBY = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<OreBlock> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    // Block Items
    public static final RegistryObject<Item> BLOCK_OF_RUBY_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(BLOCK_OF_RUBY.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));

    // Sound Events
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PEACE_AND_TRANQUILITY = SOUNDS.register("music_disc.peace_and_tranquility", () -> new SoundEvent(new ResourceLocation(Ruby.MOD_ID, "music_disc.peace_and_tranquility")));
}
