package net.falsera.flashhelm;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlashHelm implements ModInitializer {
	public static final String MOD_ID = "flashehelm";
    public static final Logger LOGGER = LoggerFactory.getLogger("flashhelm");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}