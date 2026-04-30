package com.sobrinhocdg.abysscrawler.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import com.sobrinhocdg.abysscrawler.AbyssCrawlerCreativeTab;

public class ModItems {
    // Material personalizado
    public static ToolMaterial abyssToolMaterial;
    public static ArmorMaterial abyssArmorMaterial;
    
    // Items básicos
    public static Item abyssGem;
    
    // Ferramentas
    public static Item abyssSword;
    public static Item abyssPickaxe;
    public static Item abyssAxe;
    public static Item abyssShovel;
    public static Item abyssHoe;
    
    // Armaduras
    public static Item abyssHelmet;
    public static Item abyssChestplate;
    public static Item abyssLeggings;
    public static Item abyssBoots;
    
    public static void init() {
        // Registrar material das ferramentas e armaduras
        abyssToolMaterial = EnumHelper.addToolMaterial("ABYSS", 3, 1500, 8.0f, 3.0f, 20);
        abyssArmorMaterial = EnumHelper.addArmorMaterial("ABYSS", 30, new int[]{3, 6, 8, 3}, 20);
        
        // Item base
        abyssGem = new Item().setUnlocalizedName("abysscrawler.abyssGem").setTextureName("abysscrawler:abyssGem").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        
        // Ferramentas
        abyssSword = new Item(abyssToolMaterial).setUnlocalizedName("abysscrawler.abyssSword").setTextureName("abysscrawler:abyssSword").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssPickaxe = new Item(abyssToolMaterial).setUnlocalizedName("abysscrawler.abyssPickaxe").setTextureName("abysscrawler:abyssPickaxe").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssAxe = new Item(abyssToolMaterial).setUnlocalizedName("abysscrawler.abyssAxe").setTextureName("abysscrawler:abyssAxe").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssShovel = new Item(abyssToolMaterial).setUnlocalizedName("abysscrawler.abyssShovel").setTextureName("abysscrawler:abyssShovel").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssHoe = new Item(abyssToolMaterial).setUnlocalizedName("abysscrawler.abyssHoe").setTextureName("abysscrawler:abyssHoe").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        
        // Armaduras
        abyssHelmet = new ItemArmor(abyssArmorMaterial, 0, 0).setUnlocalizedName("abysscrawler.abyssHelmet").setTextureName("abysscrawler:abyssHelmet").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssChestplate = new ItemArmor(abyssArmorMaterial, 0, 1).setUnlocalizedName("abysscrawler.abyssChestplate").setTextureName("abysscrawler:abyssChestplate").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssLeggings = new ItemArmor(abyssArmorMaterial, 0, 2).setUnlocalizedName("abysscrawler.abyssLeggings").setTextureName("abysscrawler:abyssLeggings").setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssBoots = new ItemArmor(abyssArmorMaterial, 0, 3).setUnlocalizedName("abysscrawler.abyssBoots").setTextureName("abysscrawler:abyssBoots").setCreativeTab(AbyssCrawlerCreativeTab.tab);
    }
    
    public static void register() {
        GameRegistry.registerItem(abyssGem, "abyssGem");
        GameRegistry.registerItem(abyssSword, "abyssSword");
        GameRegistry.registerItem(abyssPickaxe, "abyssPickaxe");
        GameRegistry.registerItem(abyssAxe, "abyssAxe");
        GameRegistry.registerItem(abyssShovel, "abyssShovel");
        GameRegistry.registerItem(abyssHoe, "abyssHoe");
        GameRegistry.registerItem(abyssHelmet, "abyssHelmet");
        GameRegistry.registerItem(abyssChestplate, "abyssChestplate");
        GameRegistry.registerItem(abyssLeggings, "abyssLeggings");
        GameRegistry.registerItem(abyssBoots, "abyssBoots");
    }
}
