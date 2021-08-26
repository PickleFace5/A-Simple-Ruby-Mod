package com.pickleface.ruby.world.gen;

import com.pickleface.ruby.Ruby;
import com.pickleface.ruby.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Ruby.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OreGen {
    @SubscribeEvent
    public static void generateOres(BiomeLoadingEvent event) {
        ConfiguredFeature<?, ?> ORE_RUBY = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, RegistryHandler.RUBY_ORE.get().getDefaultState(), 4)).range(16).square();
        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_RUBY);
    }
}
