package net.pretzel.pretzelsfoods.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pretzel.pretzelsfoods.PretzelsFoods;
import net.pretzel.pretzelsfoods.block.custom.TomatoCropBlock;

public class ModBlocks {
    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(PretzelsFoods.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PretzelsFoods.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PretzelsFoods.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        PretzelsFoods.LOGGER.info("Registering ModBlocks for " + PretzelsFoods.MOD_ID);
    }
}
