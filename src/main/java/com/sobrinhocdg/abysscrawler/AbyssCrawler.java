package com.sobrinhocdg.abysscrawler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sobrinhocdg.abysscrawler.init.ModBlocks;
import com.sobrinhocdg.abysscrawler.init.ModItems;
import com.sobrinhocdg.abysscrawler.proxy.CommonProxy;
import com.sobrinhocdg.abysscrawler.tabs.AbyssCrawlerCreativeTab;
import com.sobrinhocdg.abysscrawler.world.AbyssWorldGenerator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = AbyssCrawler.MODID, name = AbyssCrawler.NAME, version = AbyssCrawler.VERSION, acceptedMinecraftVersions = "1.7.10")
public class AbyssCrawler {

    public static final String MODID = "abysscrawler";
    public static final String NAME = "Abyss Crawler Legacy";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "com.sobrinhocdg.abysscrawler.proxy.ClientProxy", serverSide = "com.sobrinhocdg.abysscrawler.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final Logger logger = LogManager.getLogger(MODID);
    public static AbyssCrawlerCreativeTab creativeTab;

    @Mod.Instance(MODID)
    public static AbyssCrawler instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger.info("Pre-initialization started...");
        
        creativeTab = new AbyssCrawlerCreativeTab("abyssCrawlerTab");
        ModBlocks.register();
        ModItems.register();
        proxy.preInit(event);
        
        logger.info("Pre-initialization completed.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Initialization started...");
        GameRegistry.registerWorldGenerator(new AbyssWorldGenerator(), 0);
        proxy.init(event);
        logger.info("Initialization completed. Ready to crawl the abyss!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("Post-initialization started...");
        proxy.postInit(event);
        logger.info("Post-initialization completed.");
    }
}
