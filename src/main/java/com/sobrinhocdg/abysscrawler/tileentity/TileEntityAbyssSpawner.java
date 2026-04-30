package com.sobrinhocdg.abysscrawler.tileentity;

import net.minecraft.tileentity.TileEntityMobSpawner;

public class TileEntityAbyssSpawner extends TileEntityMobSpawner {
    public TileEntityAbyssSpawner() {
        super();
        // Configurar para spawnar mobs do abismo (pode ser personalizado)
        this.setEntityName("Zombie"); // Mob padrão, pode ser alterado
    }
}
