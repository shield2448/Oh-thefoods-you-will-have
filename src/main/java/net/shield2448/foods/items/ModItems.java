package net.shield2448.foods.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
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
    public static final Item RICE_BOWL =
            registerItem("rice_bowl",
                    new Item(
                            new FabricItemSettings()
                                    .group(ItemGroup.FOOD)
                    ));
    public static final Item BIRYANI =
            registerItem("biryani",
                    new Item(
                            new FabricItemSettings()
                                    .group(ItemGroup.FOOD)
                                    .food(new FoodComponent.Builder()
                                            .saturationModifier(6.0f)
                                            .hunger(7)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 1), 1.0f)
                                            .build())
                    ));
    public static final Item NOODLES =
            registerItem("noodles",
                    new Item(
                            new FabricItemSettings()
                                    .group(ItemGroup.FOOD)
                    ));
    public static final Item PEPSI =
            registerItem("pepsi",
                    new Item(
                            new FabricItemSettings()
                                    .group(ItemGroup.FOOD)
                    ));
    public static final Item FRIED_RICE =
            registerItem("fried_rice",
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
