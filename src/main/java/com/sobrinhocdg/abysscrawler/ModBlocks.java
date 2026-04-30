package com.sobrinhocdg.abysscrawler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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
        abyssStone = new BlockAbyssBase(Material.rock).setBlockName("abyssStone").setHardness(2.0f).setResistance(10.0f);
        abyssDirt = new BlockAbyssBase(Material.ground).setBlockName("abyssDirt").setHardness(0.5f).setResistance(2.5f);
        abyssGrass = new BlockAbyssGrass().setBlockName("abyssGrass").setHardness(0.6f).setResistance(3.0f);
        abyssObsidian = new BlockAbyssBase(Material.rock).setBlockName("abyssObsidian").setHardness(50.0f).setResistance(2000.0f);
        abyssPortal = new BlockAbyssPortal().setBlockName("abyssPortal").setHardness(-1.0f).setResistance(6000000.0f).setLightLevel(0.75f);
        abyssChest = new BlockAbyssChest().setBlockName("abyssChest").setHardness(2.5f).setResistance(5.0f);
        abyssSpawner = new BlockAbyssSpawner().setBlockName("abyssSpawner").setHardness(5.0f).setResistance(10.0f).setLightLevel(0.5f);
        abyssBricks = new BlockAbyssBase(Material.rock).setBlockName("abyssBricks").setHardness(3.0f).setResistance(15.0f);
        abyssPillar = new BlockAbyssBase(Material.rock).setBlockName("abyssPillar").setHardness(3.0f).setResistance(15.0f);
        abyssLantern = new BlockAbyssLantern().setBlockName("abyssLantern").setHardness(1.5f).setResistance(5.0f).setLightLevel(1.0f);
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
    }
}
