package com.sobrinhocdg.abysscrawler.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAbyssChest extends BlockContainer {
    public BlockAbyssChest() {
        super(Material.wood);
        this.setStepSound(Block.soundTypeWood);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityAbyssChest();
    }
    
    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @Override
    public int getRenderType() {
        return -1;
    }
}
