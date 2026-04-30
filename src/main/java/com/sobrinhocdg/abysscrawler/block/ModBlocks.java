package com.sobrinhocdg.abysscrawler.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import com.sobrinhocdg.abysscrawler.AbyssCrawlerCreativeTab;

public class ModBlocks {
    public static Block abyssStone;
    public static Block abyssDirt;
    public static Block abyssGrass;
    public static Block abyssObsidian;
    public static Block abyssPortal;
    public static Block abyssChest;
    public static Block abyssSpawner;
    public static Block abyssBricks;
    public static Block abyssPillar;
    public static Block abyssLantern;
    
    public static void init() {
        abyssStone = new Block(Material.rock).setBlockName("abysscrawler.abyssStone").setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypeStone).setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssDirt = new Block(Material.ground).setBlockName("abysscrawler.abyssDirt").setHardness(0.5f).setResistance(2.5f).setStepSound(Block.soundTypeGravel).setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssGrass = new BlockAbyssGrass().setBlockName("abysscrawler.abyssGrass").setHardness(0.6f).setResistance(3.0f).setStepSound(Block.soundTypeGrass).setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssObsidian = new Block(Material.rock).setBlockName("abysscrawler.abyssObsidian").setHardness(50.0f).setResistance(2000.0f).setStepSound(Block.soundTypeStone).setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssPortal = new BlockAbyssPortal().setBlockName("abysscrawler.abyssPortal").setHardness(-1.0f).setResistance(6000000.0f).setLightLevel(0.75f);
        abyssChest = new BlockAbyssChest().setBlockName("abysscrawler.abyssChest").setHardness(2.5f).setResistance(5.0f).setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssSpawner = new BlockAbyssSpawner().setBlockName("abysscrawler.abyssSpawner").setHardness(5.0f).setResistance(10.0f).setLightLevel(0.5f).setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssBricks = new Block(Material.rock).setBlockName("abysscrawler.abyssBricks").setHardness(3.0f).setResistance(15.0f).setStepSound(Block.soundTypeStone).setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssPillar = new Block(Material.rock).setBlockName("abysscrawler.abyssPillar").setHardness(3.0f).setResistance(15.0f).setStepSound(Block.soundTypeStone).setCreativeTab(AbyssCrawlerCreativeTab.tab);
        abyssLantern = new BlockAbyssLantern().setBlockName("abysscrawler.abyssLantern").setHardness(1.5f).setResistance(5.0f).setLightLevel(1.0f).setCreativeTab(AbyssCrawlerCreativeTab.tab);
    }
    
    public static void register() {
        GameRegistry.registerBlock(abyssStone, "abyssStone");
        GameRegistry.registerBlock(abyssDirt, "abyssDirt");
        GameRegistry.registerBlock(abyssGrass, "abyssGrass");
        GameRegistry.registerBlock(abyssObsidian, "abyssObsidian");
        GameRegistry.registerBlock(abyssPortal, "abyssPortal");
        GameRegistry.registerBlock(abyssChest, "abyssChest");
        GameRegistry.registerBlock(abyssSpawner, "abyssSpawner");
        GameRegistry.registerBlock(abyssBricks, "abyssBricks");
        GameRegistry.registerBlock(abyssPillar, "abyssPillar");
        GameRegistry.registerBlock(abyssLantern, "abyssLantern");
        
        // Registrar Tile Entities
        GameRegistry.registerTileEntity(TileEntityAbyssChest.class, "abyssChest");
        GameRegistry.registerTileEntity(TileEntityAbyssSpawner.class, "abyssSpawner");
    }
}
