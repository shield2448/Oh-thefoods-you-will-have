package net.shield2448.foods.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shield2448.foods.OhTheFoodsYouWillHave;

public class ModRecipes {

    public static void registerRecipes(){
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(OhTheFoodsYouWillHave.MOD_ID, StoveRecipe.Serializer.ID),
                StoveRecipe.Serializer.INSTANCE);

        Registry.register(Registry.RECIPE_TYPE, new Identifier(OhTheFoodsYouWillHave.MOD_ID, StoveRecipe.Type.ID),
                StoveRecipe.Type.INSTANCE);
    }
}
