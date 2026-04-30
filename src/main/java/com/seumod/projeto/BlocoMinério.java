package com.seumod.projeto;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.Random;

public class BlocoMinério extends Block {
    
    public BlocoMinério() {
        super(Material.rock);
        // Configurações básicas do minério 1.7.10
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabBlock);
    }
    
    @Override
    public int quantityDropped(Random random) {
        return 1 + random.nextInt(2); // Dropa 1-2 itens
    }
}
