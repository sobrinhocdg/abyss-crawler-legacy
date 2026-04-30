package com.seumod.projeto;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenMeuMod implements IWorldGenerator {
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, 
                         net.minecraft.world.IChunkProvider chunkGenerator, 
                         IChunkProvider chunkProvider) {
        
        // Multiplica por 16 para obter coordenadas de bloco (padrão 1.7.10)
        int xCoord = chunkX * 16;
        int zCoord = chunkZ * 16;
        
        // Geração no Overworld
        if (world.provider.dimensionId == 0) {
            gerarMinério(world, random, xCoord, zCoord);
        }
    }
    
    private void gerarMinério(World world, Random random, int xCoord, int zCoord) {
        // Gera minério usando WorldGenMinable (padrão 1.7.10)
        WorldGenMinable geradorMinério = new WorldGenMinable(ModBlocks.minérioExemplo, 4);
        
        // Tenta gerar em várias posições no chunk
        for (int i = 0; i < 5; i++) {
            int x = xCoord + random.nextInt(16);
            int y = random.nextInt(64); // Gera até Y=64
            int z = zCoord + random.nextInt(16);
            
            geradorMinério.generate(world, random, x, y, z);
        }
    }
}
