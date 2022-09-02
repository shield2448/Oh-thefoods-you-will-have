package net.shield2448.foods;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.shield2448.foods.blocks.ModBlocks;
import net.shield2448.foods.screen.ModScreenHandler;
import net.shield2448.foods.screen.StoveScreen;

public class OhTheFoodsYouWillHaveClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STOVE_LEVEL_1, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandler.STOVE_SCREEN_HANDLER, StoveScreen::new);

    }
}
