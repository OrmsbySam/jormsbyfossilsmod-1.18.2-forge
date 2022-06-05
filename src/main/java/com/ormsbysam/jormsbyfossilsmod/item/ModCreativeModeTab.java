package com.ormsbysam.jormsbyfossilsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FOSSILS_TAB = new CreativeModeTab("fossilstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CITRINE.get());
        }
    };
}

// To make another tab copy over public static final CreativeModeTab FOSSILS_TAB = new CreativeModeTab("fossilstab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.CITRINE.get());
//        }
//    }
