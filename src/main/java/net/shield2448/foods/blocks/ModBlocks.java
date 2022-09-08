package net.shield2448.foods.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shield2448.foods.OhTheFoodsYouWillHave;
import net.shield2448.foods.blocks.custom.StoveLevel1;
import net.shield2448.foods.items.ModItemGroup;

public class ModBlocks {

    public static final Block STOVE_LEVEL_1 =
            registerBlock(
                    "stove_level_1",
                    new StoveLevel1(FabricBlockSettings.
                            of(Material.METAL).
                            requiresTool().
                            strength(4f).
                            nonOpaque().
                            luminance(state -> state.get(StoveLevel1.LIT)? 15:0)
                    ),
                    ModItemGroup.MORE_FOODS
            );




    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(OhTheFoodsYouWillHave.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(OhTheFoodsYouWillHave.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(OhTheFoodsYouWillHave.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        OhTheFoodsYouWillHave.LOGGER.debug("Registering ModBlocks for "+ OhTheFoodsYouWillHave.MOD_ID);
    }


}
