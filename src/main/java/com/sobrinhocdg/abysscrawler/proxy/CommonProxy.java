package com.sobrinhocdg.abysscrawler.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        // Lógica comum de pré-inicialização
    }

    public void init(FMLInitializationEvent event) {
        // Lógica comum de inicialização
    }

    public void postInit(FMLPostInitializationEvent event) {
        // Lógica comum de pós-inicialização
    }
    
    public void registerRenderers() {}
    public void registerTileEntityRenders() {}
}
