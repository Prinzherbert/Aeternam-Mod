package net.prinzherbert.aeternam.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prinzherbert.aeternam.Aeternam;
import net.prinzherbert.aeternam.item.custom.AeternamIngotItem;
import net.prinzherbert.aeternam.item.custom.AeternamSpeckItem;
import net.prinzherbert.aeternam.item.custom.AncientNucleusItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Aeternam.MOD_ID);

    public static final RegistryObject<Item> AETERNAM_SPECK = ITEMS.register("aeternam_speck",
            () -> new AeternamSpeckItem(new Item.Properties()));
    public static final RegistryObject<Item> AETERNAM_INGOT = ITEMS.register("aeternam_ingot",
            () -> new AeternamIngotItem(new Item.Properties()));

    public static final RegistryObject<Item> ANCIENT_NUCLEUS = ITEMS.register("ancient_nucleus",
            () -> new AncientNucleusItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
