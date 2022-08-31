package net.shield2448.foods.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shield2448.foods.OhTheFoodsYouWillHave;

public class ModItemGroup {

    public static final ItemGroup MORE_FOODS =
            FabricItemGroupBuilder.
                    build(
                            new Identifier(OhTheFoodsYouWillHave.MOD_ID, "more_foods"),
                            ()-> new ItemStack(ModItems.BIRYANI)
                    );
}
