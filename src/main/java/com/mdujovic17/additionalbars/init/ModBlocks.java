/*
MIT License

Copyright (c) 2020 Marko Dujović

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.mdujovic17.additionalbars.init;

import com.mdujovic17.additionalbars.content.block.*;
import com.mdujovic17.additionalbars.events.ModRegistryKeys;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ModBlocks
{
    public static final List<BarsBlock> BARS_BLOCKS = new LinkedList<>();
    public static final List<HorizontalPaneBlock>  HORIZONTAL_BARS_BLOCKS = new LinkedList<>();

    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos)
    {
        return false;
    }

    private static final AbstractBlock.Settings METALLIC_BARS_SETTINGS = AbstractBlock.Settings.create().nonOpaque().solidBlock(ModBlocks::never).blockVision(ModBlocks::never).suffocates(ModBlocks::never).requiresTool().hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL);
    private static final AbstractBlock.Settings WOODEN_BARS_SETTINGS = AbstractBlock.Settings.create().nonOpaque().solidBlock(ModBlocks::never).blockVision(ModBlocks::never).suffocates(ModBlocks::never).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.WOOD);
    private static final AbstractBlock.Settings NETHER_BARS_SETTINGS = AbstractBlock.Settings.create().nonOpaque().solidBlock(ModBlocks::never).blockVision(ModBlocks::never).suffocates(ModBlocks::never).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.NETHER_STEM);

    private static final AbstractBlock.Settings HORIZONTAL_METALLIC_BARS_SETTINGS = AbstractBlock.Settings.create().nonOpaque().solidBlock(ModBlocks::never).blockVision(ModBlocks::never).suffocates(ModBlocks::never).requiresTool().hardness(5.0F).resistance(6.0F).sounds(BlockSoundGroup.METAL);
    private static final AbstractBlock.Settings HORIZONTAL_WOODEN_BARS_SETTINGS = AbstractBlock.Settings.create().nonOpaque().solidBlock(ModBlocks::never).blockVision(ModBlocks::never).suffocates(ModBlocks::never).nonOpaque().hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.WOOD);
    private static final AbstractBlock.Settings HORIZONTAL_NETHER_BARS_SETTINGS = AbstractBlock.Settings.create().nonOpaque().solidBlock(ModBlocks::never).blockVision(ModBlocks::never).suffocates(ModBlocks::never).hardness(3.0F).resistance(4.0F).sounds(BlockSoundGroup.NETHER_STEM);
    //public static final Block DIAMOND_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR);
    //public static final Block NETHERITE_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR);

    //public static final Block BRICK_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR);
    //public static final Block NETHER_BRICK_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS, BarsType.REGULAR);

    public static final BarsBlock GOLD_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.GOLD_BARS_KEY), BarsType.REGULAR, BarsType.METAL);
    public static final BarsBlock ACACIA_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.ACACIA_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock BIRCH_BARS    = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.BIRCH_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock DARK_OAK_BARS = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.DARK_OAK_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock JUNGLE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.JUNGLE_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock SPRUCE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.SPRUCE_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock OAK_BARS      = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.OAK_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock MANGROVE_BARS = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.MANGROVE_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock CHERRY_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CHERRY_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock PALE_OAK_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.PALE_OAK_BARS_KEY), BarsType.REGULAR);
    public static final BarsBlock CRIMSON_BARS  = new BarsBlock(NETHER_BARS_SETTINGS.registryKey(ModRegistryKeys.CRIMSON_BARS_KEY), BarsType.REGULAR, BarsType.NETHER);
    public static final BarsBlock WARPED_BARS   = new BarsBlock(NETHER_BARS_SETTINGS.registryKey(ModRegistryKeys.WARPED_BARS_KEY), BarsType.REGULAR, BarsType.NETHER);

    public static final BarsBlock CROSSED_IRON_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_IRON_BARS_KEY), BarsType.CROSSED, BarsType.METAL);
    public static final BarsBlock CROSSED_GOLD_BARS     = new BarsBlock(METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_GOLD_BARS_KEY), BarsType.CROSSED, BarsType.METAL);
    public static final BarsBlock CROSSED_ACACIA_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_ACACIA_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_BIRCH_BARS    = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_BIRCH_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_DARK_OAK_BARS = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_DARK_OAK_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_JUNGLE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_JUNGLE_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_SPRUCE_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_SPRUCE_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_OAK_BARS      = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_OAK_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_CHERRY_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_CHERRY_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_PALE_OAK_BARS   = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_PALE_OAK_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_MANGROVE_BARS = new BarsBlock(WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_MANGROVE_BARS_KEY), BarsType.CROSSED);
    public static final BarsBlock CROSSED_CRIMSON_BARS  = new BarsBlock(NETHER_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_CRIMSON_BARS_KEY), BarsType.CROSSED, BarsType.NETHER);
    public static final BarsBlock CROSSED_WARPED_BARS   = new BarsBlock(NETHER_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_WARPED_BARS_KEY), BarsType.CROSSED, BarsType.NETHER);

    public static final HorizontalPaneBlock HORIZONTAL_IRON_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_IRON_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL);
    public static final HorizontalPaneBlock HORIZONTAL_GOLD_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_GOLD_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL);
    public static final HorizontalPaneBlock HORIZONTAL_ACACIA_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_ACACIA_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_BIRCH_BARS     = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_BIRCH_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_DARK_OAK_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_DARK_OAK_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_JUNGLE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_JUNGLE_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_OAK_BARS       = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_OAK_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_SPRUCE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_SPRUCE_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_MANGROVE_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_MANGROVE_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_CHERRY_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CHERRY_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_PALE_OAK_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_PALE_OAK_BARS_KEY), BarsType.HORIZONTAL);
    public static final HorizontalPaneBlock HORIZONTAL_CRIMSON_BARS   = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CRIMSON_BARS_KEY), BarsType.HORIZONTAL, BarsType.NETHER);
    public static final HorizontalPaneBlock HORIZONTAL_WARPED_BARS    = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_WARPED_BARS_KEY), BarsType.HORIZONTAL, BarsType.NETHER);

    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_IRON_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_IRON_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_GOLD_BARS      = new HorizontalPaneBlock(HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_GOLD_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_ACACIA_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_ACACIA_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_BIRCH_BARS     = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_BIRCH_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_DARK_OAK_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_DARK_OAK_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_JUNGLE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_JUNGLE_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_OAK_BARS       = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_OAK_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_SPRUCE_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_SPRUCE_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_CHERRY_BARS    = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_MANGROVE_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_MANGROVE_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_CHERRY_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_PALE_OAK_BARS  = new HorizontalPaneBlock(HORIZONTAL_WOODEN_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_PALE_OAK_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_CRIMSON_BARS   = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_CRIMSON_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.NETHER);
    public static final HorizontalPaneBlock HORIZONTAL_CROSSED_WARPED_BARS    = new HorizontalPaneBlock(HORIZONTAL_NETHER_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_WARPED_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.NETHER);

    public static final OxidizableBarsBlock COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.COPPER_BARS_KEY), BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableBarsBlock EXPOSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.EXPOSED, METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.EXPOSED_COPPER_BARS_KEY), BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableBarsBlock WEATHERED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.WEATHERED, METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.WEATHERED_COPPER_BARS_KEY), BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableBarsBlock OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.OXIDIZED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.OXIDIZED_COPPER_BARS_KEY), BarsType.REGULAR, BarsType.METAL, BarsType.OXIDIZING);

    public static final OxidizableBarsBlock CROSSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.CROSSED_COPPER_BARS_KEY), BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableBarsBlock CROSSED_EXPOSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.EXPOSED, METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.CROSSED_EXPOSED_COPPER_BARS_KEY), BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableBarsBlock CROSSED_WEATHERED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.WEATHERED, METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.CROSSED_WEATHERED_COPPER_BARS_KEY), BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableBarsBlock CROSSED_OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.OXIDIZED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.CROSSED_OXIDIZED_COPPER_BARS_KEY), BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);

    public static final OxidizableHorizontalPaneBlock HORIZONTAL_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.HORIZONTAL_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableHorizontalPaneBlock HORIZONTAL_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.HORIZONTAL_EXPOSED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableHorizontalPaneBlock HORIZONTAL_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.HORIZONTAL_WEATHERED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableHorizontalPaneBlock HORIZONTAL_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_OXIDIZED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL, BarsType.OXIDIZING);

    public static final OxidizableHorizontalPaneBlock HORIZONTAL_CROSSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableHorizontalPaneBlock HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableHorizontalPaneBlock HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS.ticksRandomly().registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);
    public static final OxidizableHorizontalPaneBlock HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.OXIDIZING);

    public static final OxidizableBarsBlock WAXED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_COPPER_BARS_KEY), BarsType.REGULAR, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableBarsBlock WAXED_EXPOSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.EXPOSED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_EXPOSED_COPPER_BARS_KEY), BarsType.REGULAR, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableBarsBlock WAXED_WEATHERED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.WEATHERED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_WEATHERED_COPPER_BARS_KEY), BarsType.REGULAR, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableBarsBlock WAXED_OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.OXIDIZED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_OXIDIZED_COPPER_BARS_KEY), BarsType.REGULAR, BarsType.METAL, BarsType.WAXED);

    public static final OxidizableBarsBlock WAXED_CROSSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_CROSSED_COPPER_BARS_KEY), BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableBarsBlock WAXED_CROSSED_EXPOSED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.EXPOSED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_CROSSED_EXPOSED_COPPER_BARS_KEY), BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableBarsBlock WAXED_CROSSED_WEATHERED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.WEATHERED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_CROSSED_WEATHERED_COPPER_BARS_KEY), BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableBarsBlock WAXED_CROSSED_OXIDIZED_COPPER_BARS = new OxidizableBarsBlock(Oxidizable.OxidationLevel.OXIDIZED, METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_CROSSED_OXIDIZED_COPPER_BARS_KEY), BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);

    public static final OxidizableHorizontalPaneBlock WAXED_HORIZONTAL_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_HORIZONTAL_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableHorizontalPaneBlock WAXED_HORIZONTAL_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableHorizontalPaneBlock WAXED_HORIZONTAL_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableHorizontalPaneBlock WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.METAL, BarsType.WAXED);

    public static final OxidizableHorizontalPaneBlock WAXED_HORIZONTAL_CROSSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_HORIZONTAL_CROSSED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableHorizontalPaneBlock WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.EXPOSED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableHorizontalPaneBlock WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.WEATHERED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);
    public static final OxidizableHorizontalPaneBlock WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS = new OxidizableHorizontalPaneBlock(Oxidizable.OxidationLevel.OXIDIZED, HORIZONTAL_METALLIC_BARS_SETTINGS.registryKey(ModRegistryKeys.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS_KEY), BarsType.HORIZONTAL, BarsType.CROSSED, BarsType.METAL, BarsType.WAXED);

    static {
        BARS_BLOCKS.add(GOLD_BARS);
        BARS_BLOCKS.add(ACACIA_BARS);
        BARS_BLOCKS.add(BIRCH_BARS);
        BARS_BLOCKS.add(DARK_OAK_BARS);
        BARS_BLOCKS.add(JUNGLE_BARS);
        BARS_BLOCKS.add(SPRUCE_BARS);
        BARS_BLOCKS.add(OAK_BARS);
        BARS_BLOCKS.add(MANGROVE_BARS);
        BARS_BLOCKS.add(CHERRY_BARS);
        BARS_BLOCKS.add(PALE_OAK_BARS);
        BARS_BLOCKS.add(CRIMSON_BARS);
        BARS_BLOCKS.add(WARPED_BARS);

        BARS_BLOCKS.add(COPPER_BARS);
        BARS_BLOCKS.add(EXPOSED_COPPER_BARS);
        BARS_BLOCKS.add(WEATHERED_COPPER_BARS);
        BARS_BLOCKS.add(OXIDIZED_COPPER_BARS);

        BARS_BLOCKS.add(WAXED_COPPER_BARS);
        BARS_BLOCKS.add(WAXED_EXPOSED_COPPER_BARS);
        BARS_BLOCKS.add(WAXED_WEATHERED_COPPER_BARS);
        BARS_BLOCKS.add(WAXED_OXIDIZED_COPPER_BARS);

        BARS_BLOCKS.add(CROSSED_GOLD_BARS);
        BARS_BLOCKS.add(CROSSED_ACACIA_BARS);
        BARS_BLOCKS.add(CROSSED_BIRCH_BARS);
        BARS_BLOCKS.add(CROSSED_DARK_OAK_BARS);
        BARS_BLOCKS.add(CROSSED_JUNGLE_BARS);
        BARS_BLOCKS.add(CROSSED_SPRUCE_BARS);
        BARS_BLOCKS.add(CROSSED_OAK_BARS);
        BARS_BLOCKS.add(CROSSED_MANGROVE_BARS);
        BARS_BLOCKS.add(CROSSED_CHERRY_BARS);
        BARS_BLOCKS.add(CROSSED_PALE_OAK_BARS);
        BARS_BLOCKS.add(CROSSED_CRIMSON_BARS);
        BARS_BLOCKS.add(CROSSED_WARPED_BARS);

        BARS_BLOCKS.add(CROSSED_COPPER_BARS);
        BARS_BLOCKS.add(CROSSED_EXPOSED_COPPER_BARS);
        BARS_BLOCKS.add(CROSSED_WEATHERED_COPPER_BARS);
        BARS_BLOCKS.add(CROSSED_OXIDIZED_COPPER_BARS);

        BARS_BLOCKS.add(WAXED_CROSSED_COPPER_BARS);
        BARS_BLOCKS.add(WAXED_CROSSED_EXPOSED_COPPER_BARS);
        BARS_BLOCKS.add(WAXED_CROSSED_WEATHERED_COPPER_BARS);
        BARS_BLOCKS.add(WAXED_CROSSED_OXIDIZED_COPPER_BARS);

        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_GOLD_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_ACACIA_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_BIRCH_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_DARK_OAK_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_JUNGLE_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_SPRUCE_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_OAK_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_MANGROVE_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CHERRY_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_PALE_OAK_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CRIMSON_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_WARPED_BARS);

        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_EXPOSED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_WEATHERED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_OXIDIZED_COPPER_BARS);

        HORIZONTAL_BARS_BLOCKS.add(WAXED_HORIZONTAL_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(WAXED_HORIZONTAL_EXPOSED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(WAXED_HORIZONTAL_WEATHERED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS);

        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_GOLD_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_ACACIA_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_BIRCH_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_DARK_OAK_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_JUNGLE_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_SPRUCE_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_OAK_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_MANGROVE_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_CHERRY_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_PALE_OAK_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_CRIMSON_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_WARPED_BARS);

        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);

        HORIZONTAL_BARS_BLOCKS.add(WAXED_HORIZONTAL_CROSSED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS);
        HORIZONTAL_BARS_BLOCKS.add(WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS);
    }
}