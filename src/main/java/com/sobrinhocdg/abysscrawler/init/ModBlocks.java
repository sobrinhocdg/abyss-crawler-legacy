package com.sobrinhocdg.abysscrawler.init;

import com.sobrinhocdg.abysscrawler.AbyssCrawler;
import com.sobrinhocdg.abysscrawler.blocks.BlockAbyss;
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
    public static Block abyssOreDiamond;
    public static Block abyssOreEmerald;

    public static void register() {
        abyssStone = new BlockAbyss(Material.rock).setBlockName("abyss_stone").setHardness(2.0F).setResistance(10.0F);
        abyssDirt = new BlockAbyss(Material.ground).setBlockName("abyss_dirt").setHardness(0.5F).setResistance(2.5F);
        abyssGrass = new BlockAbyss(Material.grass).setBlockName("abyss_grass").setHardness(0.6F).setResistance(3.0F);
        abyssObsidian = new BlockAbyss(Material.rock).setBlockName("abyss_obsidian").setHardness(50.0F).setResistance(2000.0F);
        abyssPortal = new BlockAbyss(Material.portal).setBlockName("abyss_portal").setHardness(-1.0F).setResistance(6000000.0F).setStepSound(soundTypeGlass);
        abyssChest = new BlockAbyss(Material.wood).setBlockName("abyss_chest").setHardness(2.5F).setResistance(5.0F);
        abyssSpawner = new BlockAbyss(Material.rock).setBlockName("abyss_spawner").setHardness(5.0F).setResistance(10.0F).setStepSound(soundTypeMetal);
        abyssBricks = new BlockAbyss(Material.rock).setBlockName("abyss_bricks").setHardness(2.0F).setResistance(10.0F);
        abyssPillar = new BlockAbyss(Material.rock).setBlockName("abyss_pillar").setHardness(3.0F).setResistance(15.0F);
        abyssLantern = new BlockAbyss(Material.rock).setBlockName("abyss_lantern").setHardness(1.0F).setResistance(5.0F).setLightLevel(0.9F);
        abyssOreDiamond = new BlockAbyss(Material.rock).setBlockName("abyss_ore_diamond").setHardness(3.0F).setResistance(5.0F).setStepSound(soundTypeStone);
        abyssOreEmerald = new BlockAbyss(Material.rock).setBlockName("abyss_ore_emerald").setHardness(3.0F).setResistance(5.0F).setStepSound(soundTypeStone);

        GameRegistry.registerBlock(abyssStone, "abyss_stone");
        GameRegistry.registerBlock(abyssDirt, "abyss_dirt");
        GameRegistry.registerBlock(abyssGrass, "abyss_grass");
        GameRegistry.registerBlock(abyssObsidian, "abyss_obsidian");
        GameRegistry.registerBlock(abyssPortal, "abyss_portal");
        GameRegistry.registerBlock(abyssChest, "abyss_chest");
        GameRegistry.registerBlock(abyssSpawner, "abyss_spawner");
        GameRegistry.registerBlock(abyssBricks, "abyss_bricks");
        GameRegistry.registerBlock(abyssPillar, "abyss_pillar");
        GameRegistry.registerBlock(abyssLantern, "abyss_lantern");
        GameRegistry.registerBlock(abyssOreDiamond, "abyss_ore_diamond");
        GameRegistry.registerBlock(abyssOreEmerald, "abyss_ore_emerald");
    }

    public static void registerTileEntities() {
        AbyssCrawler.logger.info("Tile Entities registradas (se houver).");
    }
}
