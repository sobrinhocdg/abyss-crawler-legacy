package com.sobrinhocdg.abysscrawler.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockAbyssGrass extends Block {
    public BlockAbyssGrass() {
        super(Material.grass);
        this.setTickRandomly(true);
    }
    
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(ModBlocks.abyssDirt);
    }
    
    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote) {
            if (world.getBlockLightValue(x, y + 1, z) < 4 && world.getBlockLightOpacity(x, y + 1, z) > 2) {
                world.setBlock(x, y, z, ModBlocks.abyssDirt);
            } else if (world.getBlockLightValue(x, y + 1, z) >= 9) {
                for (int l = 0; l < 4; ++l) {
                    int i1 = x + random.nextInt(3) - 1;
                    int j1 = y + random.nextInt(5) - 3;
                    int k1 = z + random.nextInt(3) - 1;
                    
                    if (world.getBlock(i1, j1 + 1, k1) == ModBlocks.abyssDirt && world.getBlockLightValue(i1, j1 + 1, k1) >= 4 && world.getBlockLightOpacity(i1, j1 + 1, k1) <= 2) {
                        world.setBlock(i1, j1, k1, ModBlocks.abyssGrass);
                    }
                }
            }
        }
    }
}
