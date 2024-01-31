package net.falsera.flashhelm;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.falsera.flashhelm.item.ModItemGroups;
import net.falsera.flashhelm.item.ModItems;
import net.minecraft.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlashHelm implements ModInitializer {
	public static final String MOD_ID = "flashhelm";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.RegisterItemGroups();
	}

}