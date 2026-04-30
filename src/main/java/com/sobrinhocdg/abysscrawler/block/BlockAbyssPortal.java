package com.sobrinhocdg.abysscrawler.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockAbyssPortal extends Block {
    public BlockAbyssPortal() {
        super(Material.portal);
        this.setTickRandomly(true);
    }
    
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        if (world.isRemote) return;
        
        // Lógica simples de portal - teletransporta para outra altura no Nether
        int newY = findValidSpawnLocation(world, x, z);
        if (newY > 0 && newY != y) {
            // Teletransporta o jogador que entrar em contato
            // Implementação básica - pode ser expandida
        }
    }
    
    private int findValidSpawnLocation(World world, int x, int z) {
        for (int y = 120; y > 10; y--) {
            if (!world.isAirBlock(x, y, z) && world.isAirBlock(x, y + 1, z)) {
                return y + 1;
            }
        }
        return -1;
    }
    
    @Override
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
        // Partículas do portal
        for (int l = 0; l < 4; ++l) {
            double d0 = (double)((float)x + random.nextFloat());
            double d1 = (double)((float)y + random.nextFloat());
            double d2 = (double)((float)z + random.nextFloat());
            double d3 = ((double)random.nextFloat() - 0.5D) * 0.5D;
            double d4 = ((double)random.nextFloat() - 0.5D) * 0.5D;
            double d5 = ((double)random.nextFloat() - 0.5D) * 0.5D;
            int i1 = random.nextInt(2) * 2 - 1;
            
            if (world.getBlock(x - 1, y, z) != this && world.getBlock(x + 1, y, z) != this) {
                d0 = (double)x + 0.5D + 0.25D * (double)i1;
                d3 = (double)(random.nextFloat() * 2.0F * (float)i1);
            } else {
                d2 = (double)z + 0.5D + 0.25D * (double)i1;
                d5 = (double)(random.nextFloat() * 2.0F * (float)i1);
            }
            
            world.spawnParticle("portal", d0, d1, d2, d3, d4, d5);
        }
    }
}
