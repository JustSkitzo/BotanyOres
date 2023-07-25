package net.skitzo.botanyores.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skitzo.botanyores.BotanyOres;

public class ModBlocks {

    public static final Block COAL_SOIL = registerBlock("coal_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block IRON_SOIL = registerBlock("iron_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block DIAMOND_SOIL = registerBlock("diamond_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block NETHERITE_SOIL = registerBlock("netherite_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block CREATIVE_SOIL = registerBlock("creative_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BotanyOres.MOD_ID, name), block);
    }
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BotanyOres.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BotanyOres.LOGGER.info("Registering ModBlocks for " + BotanyOres.MOD_ID);
    }
}
