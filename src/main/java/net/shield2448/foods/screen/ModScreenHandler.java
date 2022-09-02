package net.shield2448.foods.screen;


import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandler{
    public static ScreenHandlerType<StoveScreenHandler> STOVE_SCREEN_HANDLER;

    public static void registerAllScreenHandlers(){
        STOVE_SCREEN_HANDLER = new ScreenHandlerType<>(StoveScreenHandler::new);
    }
}
