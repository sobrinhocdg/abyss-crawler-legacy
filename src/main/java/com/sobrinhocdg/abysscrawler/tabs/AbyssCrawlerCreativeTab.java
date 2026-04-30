package com.sobrinhocdg.abysscrawler.tabs;

import com.sobrinhocdg.abysscrawler.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AbyssCrawlerCreativeTab extends CreativeTabs {

    public AbyssCrawlerCreativeTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        if (ModBlocks.abyssPortal != null) {
            return Item.getItemFromBlock(ModBlocks.abyssPortal);
        }
        // Fallback para evitar NullPointerException
        return Item.getItemFromBlock(net.minecraft.init.Blocks.stone);
    }

    @Override
    public ItemStack getIconItemStack() {
        if (ModBlocks.abyssPortal != null) {
            return new ItemStack(ModBlocks.abyssPortal);
        }
        return new ItemStack(net.minecraft.init.Blocks.stone);
    }
}
