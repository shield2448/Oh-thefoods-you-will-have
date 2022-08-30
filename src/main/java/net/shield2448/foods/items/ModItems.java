package net.shield2448.foods.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shield2448.foods.OhTheFoodsYouWillHave;

public class ModItems {

    public static final Item RICE =
            registerItem("rice",
                    new Item(
                            new FabricItemSettings()
                                    .group(ItemGroup.FOOD)
                    ));

    public static Item registerItem(String name, Item item){
        return Registry.register(
                Registry.ITEM,
                new Identifier(OhTheFoodsYouWillHave.MOD_ID, name),
                item);
    }

    public static void registerModItems(){
        OhTheFoodsYouWillHave.LOGGER.debug("Registering Items for "+OhTheFoodsYouWillHave.MOD_ID);
    }
}
