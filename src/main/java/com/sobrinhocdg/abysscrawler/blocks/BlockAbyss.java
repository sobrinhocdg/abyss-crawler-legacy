package com.sobrinhocdg.abysscrawler.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAbyss extends Block {

    public BlockAbyss(Material material) {
        super(material);
        this.setHardness(1.5F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
    }

    public BlockAbyss(Material material, float hardness, float resistance) {
        super(material);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setStepSound(soundTypeStone);
    }

    @Override
    public Block setBlockName(String name) {
        super.setBlockName(name);
        this.setBlockTextureName("abysscrawler:" + name);
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(this.getTextureName());
    }
}
