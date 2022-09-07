package net.shield2448.foods.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.PotionItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shield2448.foods.OhTheFoodsYouWillHave;

public class ModItems {

    public static final Item RICE =
            registerItem("rice",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                    ));
    public static final Item RICE_BOWL =
            registerItem("rice_bowl",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                    ));
    public static final Item BIRYANI =
            registerItem("biryani",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                            .saturationModifier(6.0f)
                                            .hunger(7)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 1), 1.0f)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f)
                                            .build())
                    ));
    public static final Item NOODLES =
            registerItem("noodles",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                    .saturationModifier(4.0f)
                                    .hunger(5)
                                    .build())
                    ));
    public static final Item RED_BULL =
            registerItem("red_bull",
                    new PotionItem(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                            .snack()
                                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 2), 1.0f)
                                            .build())
                    ));
    public static final Item SALT =
            registerItem("salt",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                            .snack()
                                            .alwaysEdible()
                                            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 2), 1.0f)
                                            .build())
                    ));
    public static final Item RED_CAPSICUM =
            registerItem("red_capsicum",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                    .build())
                    ));
    public static final Item YELLOW_CAPSICUM =
            registerItem("yellow_capsicum",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                            .build())
                    ));
    public static final Item GREEN_CAPSICUM =
            registerItem("green_capsicum",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                            .build())
                    ));
    public static final Item CURRY =
            registerItem("curry",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                            .build())
                    ));
    public static final Item FRIED_RICE =
            registerItem("steam_rice",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                            .saturationModifier(5.0f)
                                            .hunger(6)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 1), 1.0f)
                                            .build())
                    ));
    public static final Item STEAMED_RICE =
            registerItem("steamed_rice",
                    new Item(
                            new FabricItemSettings()
                                    .group(ModItemGroup.MORE_FOODS)
                                    .food(new FoodComponent.Builder()
                                            .saturationModifier(5.0f)
                                            .hunger(6)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 1), 1.0f)
                                            .build())
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
