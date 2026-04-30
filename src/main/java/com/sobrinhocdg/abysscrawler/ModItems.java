package com.sobrinhocdg.abysscrawler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
    public static Item abyssEssence;
    public static Item abyssShard;
    public static Item abyssIngot;
    public static Item abyssSword;
    public static Item abyssPickaxe;
    public static Item abyssAxe;
    public static Item abyssShovel;
    public static Item abyssHoe;
    public static Item abyssHelmet;
    public static Item abyssChestplate;
    public static Item abyssLeggings;
    public static Item abyssBoots;
    public static Item abyssApple;
    
    public static void init() {
        abyssEssence = new ItemAbyssBase().setUnlocalizedName("abyssEssence").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssShard = new ItemAbyssBase().setUnlocalizedName("abyssShard").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssIngot = new ItemAbyssBase().setUnlocalizedName("abyssIngot").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        
        abyssSword = new ItemAbyssSword(Item.ToolMaterial.DIAMOND).setUnlocalizedName("abyssSword").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssPickaxe = new ItemAbyssPickaxe(Item.ToolMaterial.DIAMOND).setUnlocalizedName("abyssPickaxe").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssAxe = new ItemAbyssAxe(Item.ToolMaterial.DIAMOND).setUnlocalizedName("abyssAxe").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssShovel = new ItemAbyssShovel(Item.ToolMaterial.DIAMOND).setUnlocalizedName("abyssShovel").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssHoe = new ItemAbyssHoe(Item.ToolMaterial.DIAMOND).setUnlocalizedName("abyssHoe").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        
        abyssHelmet = new ItemAbyssArmor(0).setUnlocalizedName("abyssHelmet").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssChestplate = new ItemAbyssArmor(1).setUnlocalizedName("abyssChestplate").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssLeggings = new ItemAbyssArmor(2).setUnlocalizedName("abyssLeggings").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        abyssBoots = new ItemAbyssArmor(3).setUnlocalizedName("abyssBoots").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
        
        abyssApple = new ItemAbyssFood(4, 0.8f).setUnlocalizedName("abyssApple").setCreativeTab(AbyssCrawlerCreativeTab.tabAbyssCrawler);
    }
    
    public static void register() {
        GameRegistry.registerItem(abyssEssence, "abyssEssence");
        GameRegistry.registerItem(abyssShard, "abyssShard");
        GameRegistry.registerItem(abyssIngot, "abyssIngot");
        GameRegistry.registerItem(abyssSword, "abyssSword");
        GameRegistry.registerItem(abyssPickaxe, "abyssPickaxe");
        GameRegistry.registerItem(abyssAxe, "abyssAxe");
        GameRegistry.registerItem(abyssShovel, "abyssShovel");
        GameRegistry.registerItem(abyssHoe, "abyssHoe");
        GameRegistry.registerItem(abyssHelmet, "abyssHelmet");
        GameRegistry.registerItem(abyssChestplate, "abyssChestplate");
        GameRegistry.registerItem(abyssLeggings, "abyssLeggings");
        GameRegistry.registerItem(abyssBoots, "abyssBoots");
        GameRegistry.registerItem(abyssApple, "abyssApple");
    }
}
