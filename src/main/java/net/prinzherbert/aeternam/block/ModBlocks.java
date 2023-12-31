package net.prinzherbert.aeternam.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prinzherbert.aeternam.Aeternam;
import net.prinzherbert.aeternam.block.custom.AncientPillar;
import net.prinzherbert.aeternam.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Aeternam.MOD_ID);

    public static final RegistryObject<Block> SOLIDIFIED_CLOUD = registerBlock("solidified_cloud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> AETERNAM_ORE = registerBlock("aeternam_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.SNOW).requiresCorrectToolForDrops()
                    .lightLevel((p_50874_) -> { return 5; }), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> AETERNAM_BLOCK = registerBlock("aeternam_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).lightLevel((p_50874_) -> { return 15; })));

    public static final RegistryObject<Block> ANCIENT_PILLAR_POLE = registerBlock("ancient_pillar_pole",
            () -> new AncientPillar(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SNOW).noOcclusion()));
    public static final RegistryObject<Block> ANCIENT_PILLAR_SINGLE_BASE = registerBlock("ancient_pillar_single_base",
            () -> new AncientPillar(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SNOW).noOcclusion()));
    public static final RegistryObject<Block> ANCIENT_PILLAR_FULL = registerBlock("ancient_pillar_full",
            () -> new AncientPillar(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SNOW).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
