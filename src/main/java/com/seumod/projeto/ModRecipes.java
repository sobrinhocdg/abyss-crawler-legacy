package com.seumod.projeto;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
    
    public static void init() {
        // Receitas usando ShapedOreRecipe para compatibilidade
        
        // Receita do bloco exemplo (usando pedra como exemplo)
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blocoExemplo, 1),
            "###",
            "###",
            "###",
            '#', net.minecraft.init.Blocks.stone);
        
        // Receita do item exemplo
        GameRegistry.addRecipe(new ItemStack(ModItems.itemExemplo, 4),
            "#",
            '#', ModBlocks.blocoExemplo);
        
        // Receita do cristal (usando minério)
        GameRegistry.addRecipe(new ItemStack(ModItems.cristalExemplo, 2),
            " # ",
            "# #",
            " # ",
            '#', ModBlocks.minérioExemplo);
    }
}
