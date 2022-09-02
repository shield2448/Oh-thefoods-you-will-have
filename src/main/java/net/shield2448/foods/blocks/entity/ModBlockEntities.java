package net.shield2448.foods.blocks.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shield2448.foods.OhTheFoodsYouWillHave;
import net.shield2448.foods.blocks.ModBlocks;

public class ModBlockEntities {

    public static BlockEntityType<StoveBlockEntity> STOVE;

    public static void registerBlockEntites() {
        STOVE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(OhTheFoodsYouWillHave.MOD_ID, "stove"),
                FabricBlockEntityTypeBuilder.create(StoveBlockEntity::new,
                        ModBlocks.STOVE_LEVEL_1).build(null));
    }
}
