package com.sobrinhocdg.abysscrawler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
    public void init() {
        // Adicionar nomes em português
        addLocalization();
    }
    
    private void addLocalization() {
        // Blocos
        LanguageRegistry.addName("abysscrawler.abyssStone", "Pedra do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssDirt", "Terra do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssGrass", "Grama do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssObsidian", "Obsidiana do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssPortal", "Portal do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssChest", "Baú do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssSpawner", "Gerador do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssBricks", "Tijolos do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssPillar", "Pilar do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssLantern", "Lanterna do Abismo");
        
        // Items
        LanguageRegistry.addName("abysscrawler.abyssGem", "Gema do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssSword", "Espada do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssPickaxe", "Picareta do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssAxe", "Machado do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssShovel", "Pá do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssHoe", "Enxada do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssHelmet", "Capacete do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssChestplate", "Peitoral do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssLeggings", "Calças do Abismo");
        LanguageRegistry.addName("abysscrawler.abyssBoots", "Botas do Abismo");
    }
}
