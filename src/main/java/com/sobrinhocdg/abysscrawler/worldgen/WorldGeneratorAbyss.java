package com.sobrinhocdg.abysscrawler.worldgen;

import java.util.Random;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.BiomeGenBase;
import com.sobrinhocdg.abysscrawler.ModBlocks;

public class WorldGeneratorAbyss implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkProvider, IChunkProvider chunkGenerator) {
        // Geração apenas no Nether para simular o abismo
        if (world.provider.dimensionId == -1) {
            generateAbyssStructures(world, random, chunkX * 16, chunkZ * 16);
            generateOres(world, random, chunkX * 16, chunkZ * 16);
        }
    }
    
    private void generateAbyssStructures(World world, Random random, int startX, int startZ) {
        // Pequena chance de gerar um santuário de obsidiana
        if (random.nextInt(50) == 0) {
            int x = startX + random.nextInt(12);
            int z = startZ + random.nextInt(12);
            int y = 60; // Altura fixa no Nether
            
            // Plataforma de obsidiana
            for (int dx = -2; dx <= 2; dx++) {
                for (int dz = -2; dz <= 2; dz++) {
                    world.setBlock(x + dx, y, z + dz, ModBlocks.abyssObsidian);
                }
            }
            
            // Pilar central
            for (int dy = 1; dy <= 3; dy++) {
                world.setBlock(x, y + dy, z, ModBlocks.abyssPillar);
            }
            
            // Lanternas nos cantos
            world.setBlock(x - 2, y + 1, z - 2, ModBlocks.abyssLantern);
            world.setBlock(x + 2, y + 1, z - 2, ModBlocks.abyssLantern);
            world.setBlock(x - 2, y + 1, z + 2, ModBlocks.abyssLantern);
            world.setBlock(x + 2, y + 1, z + 2, ModBlocks.abyssLantern);
            
            // Baú no centro
            world.setBlock(x, y + 4, z, ModBlocks.abyssChest);
        }
    }
    
    private void generateOres(World world, Random random, int startX, int startZ) {
        // Veios de abyss stone
        for (int i = 0; i < 8; i++) {
            int x = startX + random.nextInt(16);
            int y = random.nextInt(100) + 10;
            int z = startZ + random.nextInt(16);
            
            if (world.getBlock(x, y, z) == net.minecraft.init.Blocks.netherrack) {
                // Veio pequeno
                int veinSize = random.nextInt(4) + 3;
                for (int j = 0; j < veinSize; j++) {
                    int ox = x + random.nextInt(3) - 1;
                    int oy = y + random.nextInt(3) - 1;
                    int oz = z + random.nextInt(3) - 1;
                    world.setBlock(ox, oy, oz, ModBlocks.abyssStone);
                }
            }
        }
    }
}
