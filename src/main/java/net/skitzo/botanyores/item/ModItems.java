package net.skitzo.botanyores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skitzo.botanyores.BotanyOres;
import net.skitzo.botanyores.block.ModBlocks;

public class ModItems {
    public static final Item TESTITEM = registerItem("testitem", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TESTITEM);
    }

    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.COAL_SOIL);
        entries.add(ModBlocks.IRON_SOIL);
        entries.add(ModBlocks.DIAMOND_SOIL);
        entries.add(ModBlocks.NETHERITE_SOIL);
        entries.add(ModBlocks.CREATIVE_SOIL);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BotanyOres.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BotanyOres.LOGGER.info("Registering Mod Items for " + BotanyOres.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
    }
}
