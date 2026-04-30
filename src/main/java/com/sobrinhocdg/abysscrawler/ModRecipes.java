package com.sobrinhocdg.abysscrawler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
    public static void init() {
        // Receitas de blocos do abismo
        GameRegistry.addRecipe(new ItemStack(ModBlocks.abyssBricks, 4), 
            "##", "##", '#', ModBlocks.abyssStone);
        
        GameRegistry.addRecipe(new ItemStack(ModBlocks.abyssPillar), 
            "#", "#", '#', ModBlocks.abyssBricks);
        
        GameRegistry.addRecipe(new ItemStack(ModBlocks.abyssLantern, 2), 
            "#X#", "X#X", "#X#", 
            '#', ModBlocks.abyssBricks, 
            'X', Items.glowstone_dust);
        
        // Receitas de itens
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssSword), 
            "X", "X", "#", 
            'X', ModItems.abyssGem, 
            '#', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssPickaxe), 
            "XXX", " # ", " # ", 
            'X', ModItems.abyssGem, 
            '#', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssAxe), 
            "XX", "X#", "#", 
            'X', ModItems.abyssGem, 
            '#', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssShovel), 
            "X", "#", "#", 
            'X', ModItems.abyssGem, 
            '#', Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssHoe), 
            "XX", " # ", " # ", 
            'X', ModItems.abyssGem, 
            '#', Items.stick);
        
        // Armaduras
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssHelmet), 
            "XXX", "X X", 
            'X', ModItems.abyssGem);
        
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssChestplate), 
            "X X", "XXX", "XXX", 
            'X', ModItems.abyssGem);
        
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssLeggings), 
            "XXX", "X X", "X X", 
            'X', ModItems.abyssGem);
        
        GameRegistry.addRecipe(new ItemStack(ModItems.abyssBoots), 
            "X X", "X X", 
            'X', ModItems.abyssGem);
        
        // Smelting
        GameRegistry.addSmelting(ModBlocks.abyssStone, new ItemStack(ModBlocks.abyssBricks), 0.7f);
    }
}
