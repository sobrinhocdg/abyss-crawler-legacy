package com.sobrinhocdg.abysscrawler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

import com.sobrinhocdg.abysscrawler.block.ModBlocks;
import com.sobrinhocdg.abysscrawler.item.ModItems;
import com.sobrinhocdg.abysscrawler.worldgen.WorldGeneratorAbyss;

@Mod(modid = AbyssCrawler.MODID, name = "Abyss Crawler Legacy", version = "1.0.0", description = "Explore o abismo infinito! Versão Legacy 1.7.10 otimizada para hardware antigo.")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AbyssCrawler {
    public static final String MODID = "abysscrawler";
    public static final String VERSION = "1.0.0";
    
    private static Logger logger;
    
    @SidedProxy(clientSide = "com.sobrinhocdg.abysscrawler.ClientProxy", serverSide = "com.sobrinhocdg.abysscrawler.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance(MODID)
    public static AbyssCrawler instance;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Abyss Crawler Legacy - PreInitializing...");
        
        // Criar creative tab primeiro
        AbyssCrawlerCreativeTab.init();
        
        // Registrar blocos
        ModBlocks.init();
        ModBlocks.register();
        
        // Registrar items
        ModItems.init();
        ModItems.register();
        
        logger.info("Abyss Crawler Legacy - Blocks and Items registered!");
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Abyss Crawler Legacy - Initializing...");
        
        proxy.init();
        
        // Registrar receitas
        ModRecipes.init();
        
        // Registrar world generator
        GameRegistry.registerWorldGenerator(new WorldGeneratorAbyss(), 1);
        
        logger.info("Abyss Crawler Legacy - Initialized successfully!");
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("Abyss Crawler Legacy - PostInitializing...");
        logger.info("Abyss Crawler Legacy - Ready to crawl the abyss!");
    }
}
