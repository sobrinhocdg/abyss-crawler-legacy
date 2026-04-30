package com.sobrinhocdg.abysscrawler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AbyssCrawlerCreativeTab {
    public static CreativeTabs tab;
    
    public static void init() {
        tab = new CreativeTabs("abysscrawler") {
            @Override
            public Item getTabIconItem() {
                return ModItems.abyssGem;
            }
        };
    }
}
