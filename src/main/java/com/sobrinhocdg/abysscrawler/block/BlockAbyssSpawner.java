package com.sobrinhocdg.abysscrawler.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAbyssSpawner extends BlockContainer {
    public BlockAbyssSpawner() {
        super(Material.rock);
        this.setStepSound(Block.soundTypeStone);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityAbyssSpawner();
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
