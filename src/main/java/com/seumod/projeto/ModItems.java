package com.seumod.projeto;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    
    // Declaração dos itens
    public static Item itemExemplo;
    public static Item cristalExemplo;
    
    public static void init() {
        // Inicialização e registro dos itens
        itemExemplo = new Item().setUnlocalizedName("itemExemplo").setTextureName("meumod:itemExemplo");
        GameRegistry.registerItem(itemExemplo, "itemExemplo");
        
        cristalExemplo = new ItemCristal().setUnlocalizedName("cristalExemplo").setTextureName("meumod:cristalExemplo");
        GameRegistry.registerItem(cristalExemplo, "cristalExemplo");
    }
}
