package com.seumod.projeto;

import net.minecraft.item.Item;

public class ItemCristal extends Item {
    
    public ItemCristal() {
        super();
        // Configurações básicas do item 1.7.10
        this.setMaxStackSize(64);
        this.setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabMaterials);
    }
}
