package com.sobrinhocdg.abysscrawler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.ItemStack;

public class CommonProxy {
    public void init() {
        // Registrar tile entities
        GameRegistry.registerTileEntity(TileEntityAbyssChest.class, "abyssChest");
        GameRegistry.registerTileEntity(TileEntityAbyssSpawner.class, "abyssSpawner");
        
        // Adicionar nomes em português
        addLocalization();
    }
    
    private void addLocalization() {
        // Blocos
        LanguageRegistry.addName(ModBlocks.abyssStone, "Pedra do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssDirt, "Terra do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssGrass, "Grama do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssObsidian, "Obsidiana do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssPortal, "Portal do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssChest, "Baú do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssSpawner, "Gerador do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssBricks, "Tijolos do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssPillar, "Pilar do Abismo");
        LanguageRegistry.addName(ModBlocks.abyssLantern, "Lanterna do Abismo");
        
        // Items
        LanguageRegistry.addName(ModItems.abyssEssence, "Essência do Abismo");
        LanguageRegistry.addName(ModItems.abyssShard, "Fragmento do Abismo");
        LanguageRegistry.addName(ModItems.abyssIngot, "Lingote do Abismo");
        LanguageRegistry.addName(ModItems.abyssSword, "Espada do Abismo");
        LanguageRegistry.addName(ModItems.abyssPickaxe, "Picareta do Abismo");
        LanguageRegistry.addName(ModItems.abyssAxe, "Machado do Abismo");
        LanguageRegistry.addName(ModItems.abyssShovel, "Pá do Abismo");
        LanguageRegistry.addName(ModItems.abyssHoe, "Enxada do Abismo");
        LanguageRegistry.addName(ModItems.abyssHelmet, "Capacete do Abismo");
        LanguageRegistry.addName(ModItems.abyssChestplate, "Peitoral do Abismo");
        LanguageRegistry.addName(ModItems.abyssLeggings, "Calças do Abismo");
        LanguageRegistry.addName(ModItems.abyssBoots, "Botas do Abismo");
        LanguageRegistry.addName(ModItems.abyssApple, "Maçã do Abismo");
    }
}
