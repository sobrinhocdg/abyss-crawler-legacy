package com.seumod.projeto;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    
    // Declaração dos blocos
    public static Block blocoExemplo;
    public static Block minérioExemplo;
    
    public static void init() {
        // Inicialização e registro dos blocos
        // Usa Material.rock conforme padrão 1.7.10
        blocoExemplo = new BlocoExemplo().setBlockName("blocoExemplo").setBlockTextureName("meumod:blocoExemplo");
        GameRegistry.registerBlock(blocoExemplo, "blocoExemplo");
        
        minérioExemplo = new BlocoMinério().setBlockName("minérioExemplo").setBlockTextureName("meumod:minérioExemplo");
        GameRegistry.registerBlock(minérioExemplo, "minérioExemplo");
    }
}
