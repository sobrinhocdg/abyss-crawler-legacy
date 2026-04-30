package com.seumod.projeto;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "meumod", name = "Meu Mod Legacy", version = "2.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MeuMod {
    
    @SidedProxy(clientSide = "com.seumod.projeto.ClientProxy", serverSide = "com.seumod.projeto.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance("meumod")
    public static MeuMod instance;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Registro de blocos e itens
        ModBlocks.init();
        ModItems.init();
        
        // Registro de receitas
        ModRecipes.init();
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        
        // Registro do gerador de mundo
        GameRegistry.registerWorldGenerator(new WorldGenMeuMod(), 0);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Lógica pós-inicialização
    }
}
