package net.shield2448.foods;

import net.fabricmc.api.ModInitializer;
import net.shield2448.foods.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OhTheFoodsYouWillHave implements ModInitializer {

	public static final String MOD_ID = "foods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}
