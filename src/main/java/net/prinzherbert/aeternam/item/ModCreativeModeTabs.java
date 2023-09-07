package net.prinzherbert.aeternam.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.prinzherbert.aeternam.Aeternam;
import net.prinzherbert.aeternam.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Aeternam.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AETERNAM_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.AETERNAM_SPECK.get()))
                    .title(Component.translatable("creativetab.aeternam_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AETERNAM_SPECK.get());
                        pOutput.accept(ModItems.AETERNAM_INGOT.get());
                        pOutput.accept(ModItems.ANCIENT_NUCLEUS.get());

                        pOutput.accept(ModBlocks.AETERNAM_ORE.get());
                        pOutput.accept(ModBlocks.SOLIDIFIED_CLOUD.get());
                        pOutput.accept(ModBlocks.AETERNAM_BLOCK.get());
                        pOutput.accept(ModItems.ANCIENT_NUCLEUS.get());

                        pOutput.accept(ModItems.AETERNAM_BOAT.get());

                        pOutput.accept(ModBlocks.AETERNAM_ORE.get());
                        pOutput.accept(ModBlocks.SOLIDIFIED_CLOUD.get());
                        pOutput.accept(ModBlocks.ANCIENT_PILLAR_POLE.get());
                        pOutput.accept(ModBlocks.ANCIENT_PILLAR_SINGLE_BASE.get());
                        pOutput.accept(ModBlocks.ANCIENT_PILLAR_FULL.get());

                        pOutput.accept(ModItems.AERIAL_APPLE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
