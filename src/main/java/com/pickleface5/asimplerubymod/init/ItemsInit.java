package com.pickleface5.asimplerubymod.init;

import com.pickleface5.asimplerubymod.ASimpleRubyMod;
import com.pickleface5.asimplerubymod.items.ModArmorMaterials;
import com.pickleface5.asimplerubymod.items.ModTiers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ASimpleRubyMod.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModTiers.RUBY, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModTiers.RUBY, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModTiers.RUBY, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModTiers.RUBY, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModTiers.RUBY, -3, 0, new Item.Properties()));

    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Properties()));
    public static final RegistryObject<HorseArmorItem> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () ->
            new HorseArmorItem(15, new ResourceLocation(ASimpleRubyMod.MODID + ":textures/entity/horse/armor/horse_armor_ruby.png"), new Item.Properties()));

    public static final RegistryObject<BlockItem> RUBY_BLOCK_ITEM = registerBlockItem("ruby_block", BlocksInit.RUBY_BLOCK);
    public static final RegistryObject<BlockItem> RUBY_ORE_ITEM = registerBlockItem("ruby_ore", BlocksInit.RUBY_ORE);
    public static final RegistryObject<BlockItem> DEEPSLATE_RUBY_ORE_ITEM = registerBlockItem("deepslate_ruby_ore", BlocksInit.DEEPSLATE_RUBY_ORE);

    private static RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}
