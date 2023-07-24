package net.skitzo.botanyores;

import net.fabricmc.api.ModInitializer;

import net.skitzo.botanyores.block.ModBlocks;
import net.skitzo.botanyores.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BotanyOres implements ModInitializer {
	public static final String MOD_ID = "botanyores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}