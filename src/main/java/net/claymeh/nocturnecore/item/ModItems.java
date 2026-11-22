package net.claymeh.nocturnecore.item;

import net.claymeh.nocturnecore.NocturneCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NocturneCore.MOD_ID);

    public static final DeferredItem<Item> RAW_TIN = ITEMS.register(
            "raw_tin",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
