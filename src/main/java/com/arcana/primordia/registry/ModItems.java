package com.arcana.primordia.registry;

import com.arcana.primordia.ArcanaPrimordia;
import com.arcana.primordia.item.ArcaneCoreItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArcanaPrimordia.MOD_ID);

    public static final RegistryObject<Item> ARCANE_CORE =
            ITEMS.register("arcane_core",
                    () -> new ArcaneCoreItem(new Item.Properties().stacksTo(1)));
}
