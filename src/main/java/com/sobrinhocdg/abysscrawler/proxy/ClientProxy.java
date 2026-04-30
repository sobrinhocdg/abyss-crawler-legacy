package com.sobrinhocdg.abysscrawler.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        registerRenderers();
        registerTileEntityRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public void registerRenderers() {
        // Renderização específica do cliente
    }

    @Override
    public void registerTileEntityRenders() {
        // Renderização de TileEntities
    }
}
