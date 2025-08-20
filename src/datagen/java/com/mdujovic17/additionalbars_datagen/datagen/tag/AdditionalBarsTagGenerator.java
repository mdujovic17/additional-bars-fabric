package com.mdujovic17.additionalbars_datagen.datagen.tag;

import com.mdujovic17.additionalbars.AdditionalBars;
import com.mdujovic17.additionalbars.init.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class AdditionalBarsTagGenerator extends FabricTagProvider<Item> {

    private static final TagKey<Item> BARS_ITEMS = TagKey.of(RegistryKeys.ITEM, Identifier.of(AdditionalBars.MODID, "bars"));

    private static final TagKey<Item> METALLIC_BARS = TagKey.of(RegistryKeys.ITEM, Identifier.of(AdditionalBars.MODID, "bars/metallic"));
    private static final TagKey<Item> WOODEN_BARS = TagKey.of(RegistryKeys.ITEM, Identifier.of(AdditionalBars.MODID, "bars/wooden"));

    public AdditionalBarsTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, RegistryKeys.ITEM, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        builder(METALLIC_BARS)
                .add(ModBlocks.GOLD_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_IRON_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_GOLD_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_IRON_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_GOLD_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_IRON_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_GOLD_BARS.asItem().getRegistryEntry().registryKey())

                .add(ModBlocks.COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())

                .add(ModBlocks.EXPOSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_EXPOSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_EXPOSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())

                .add(ModBlocks.WEATHERED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_WEATHERED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_WEATHERED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.asItem().getRegistryEntry().registryKey())

                .add(ModBlocks.OXIDIZED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_OXIDIZED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.asItem().getRegistryEntry().registryKey())

                .add(ModBlocks.WAXED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_CROSSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_HORIZONTAL_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_HORIZONTAL_CROSSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())

                .add(ModBlocks.WAXED_EXPOSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_CROSSED_EXPOSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_HORIZONTAL_EXPOSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.asItem().getRegistryEntry().registryKey())

                .add(ModBlocks.WAXED_WEATHERED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_CROSSED_WEATHERED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_HORIZONTAL_WEATHERED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.asItem().getRegistryEntry().registryKey())

                .add(ModBlocks.WAXED_OXIDIZED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_CROSSED_OXIDIZED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_HORIZONTAL_OXIDIZED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WAXED_HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.asItem().getRegistryEntry().registryKey())
        ;


        builder(WOODEN_BARS)
                .add(ModBlocks.ACACIA_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.BIRCH_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.DARK_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.JUNGLE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.SPRUCE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.MANGROVE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CHERRY_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.PALE_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CRIMSON_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.WARPED_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_ACACIA_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_BIRCH_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_DARK_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_JUNGLE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_SPRUCE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_MANGROVE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_CHERRY_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_PALE_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_CRIMSON_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.CROSSED_WARPED_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_ACACIA_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_BIRCH_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_DARK_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_JUNGLE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_SPRUCE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_MANGROVE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CHERRY_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_PALE_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CRIMSON_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_WARPED_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_ACACIA_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_BIRCH_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_MANGROVE_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_CHERRY_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_PALE_OAK_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS.asItem().getRegistryEntry().registryKey())
                .add(ModBlocks.HORIZONTAL_CROSSED_WARPED_BARS.asItem().getRegistryEntry().registryKey());

        builder(BARS_ITEMS)
                .addOptionalTag(METALLIC_BARS)
                .addOptionalTag(WOODEN_BARS);
    }

    @Override
    public String getName() {
        return "Additional Bars Tag provider";
    }
}
