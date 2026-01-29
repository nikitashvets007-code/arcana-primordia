package com.arcana.primordia;

import com.arcana.primordia.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ArcanaPrimordia.MOD_ID)
public class ArcanaPrimordia {
    public static final String MOD_ID = "arcana_primordia";

    public ArcanaPrimordia() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
    }
}
