package com.sobrinhocdg.abysscrawler.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAbyssLantern extends Block {
    public BlockAbyssLantern() {
        super(Material.iron);
        this.setStepSound(Block.soundTypeMetal);
    }
}
