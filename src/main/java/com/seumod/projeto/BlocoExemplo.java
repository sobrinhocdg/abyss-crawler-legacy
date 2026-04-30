package com.seumod.projeto;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.Random;

public class BlocoExemplo extends Block {
    
    public BlocoExemplo() {
        super(Material.rock);
        // Configurações básicas do bloco 1.7.10
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabBlock);
    }
    
    @Override
    public int quantityDropped(Random random) {
        return 1;
    }
}
