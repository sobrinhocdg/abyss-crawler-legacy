package com.sobrinhocdg.abysscrawler.world;

import java.util.Random;

import com.sobrinhocdg.abysscrawler.init.ModBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class AbyssWorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        int chance = random.nextInt(100);
        
        int startX = chunkX * 16;
        int startZ = chunkZ * 16;

        // Geração de Minérios
        if (chance < 40) { 
            generateOre(world, random, startX, startZ, ModBlocks.abyssOreDiamond, 4, 16);
            generateOre(world, random, startX, startZ, ModBlocks.abyssOreEmerald, 3, 16);
        }

        // Geração de Estruturas Simples
        if (chance > 90) {
            generateSmallShrine(world, random, startX, startZ);
        }
    }

    private void generateOre(World world, Random random, int chunkX, int chunkZ, net.minecraft.block.Block block, int maxVeins, int maxY) {
        for (int i = 0; i < maxVeins; i++) {
            int x = chunkX + random.nextInt(16);
            int z = chunkZ + random.nextInt(16);
            int y = random.nextInt(maxY);

            if (world.getBlock(x, y, z) == net.minecraft.init.Blocks.stone) {
                world.setBlock(x, y, z, block, 0, 2);
            }
        }
    }

    private void generateSmallShrine(World world, Random random, int chunkX, int chunkZ) {
        int x = chunkX + random.nextInt(12) + 2;
        int z = chunkZ + random.nextInt(12) + 2;
        
        int y = world.getTopSolidOrLiquidBlock(x, z) - 1;

        if (y < 10 || y > 100) return;

        // Estrutura simples
        world.setBlock(x, y, z, ModBlocks.abyssObsidian);
        world.setBlock(x+1, y, z, ModBlocks.abyssBricks);
        world.setBlock(x-1, y, z, ModBlocks.abyssBricks);
        world.setBlock(x, y, z+1, ModBlocks.abyssBricks);
        world.setBlock(x, y, z-1, ModBlocks.abyssBricks);

        world.setBlock(x, y+1, z, ModBlocks.abyssPillar);
        world.setBlock(x, y+2, z, ModBlocks.abyssPillar);
        
        world.setBlock(x, y+3, z, ModBlocks.abyssLantern);
        
        if (world.isAirBlock(x, y+1, z)) {
             world.setBlock(x, y+1, z, ModBlocks.abyssChest);
        }
    }
}
