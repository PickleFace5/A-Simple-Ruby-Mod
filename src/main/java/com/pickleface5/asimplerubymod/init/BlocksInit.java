package com.pickleface5.asimplerubymod.init;

import com.pickleface5.asimplerubymod.ASimpleRubyMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ASimpleRubyMod.MODID);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(RUBY_ORE.get()).strength(4.5F, 3.0F).color(MaterialColor.DEEPSLATE).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

}
