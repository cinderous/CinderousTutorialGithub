package com.cinderous.cinderoustutorial.tabs;

import com.cinderous.cinderoustutorial.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CinderousTab extends CreativeTabs {

	public CinderousTab(String label) { super("cinderoustab");
	this.setBackgroundImageName("cinderous.png");
	}
	
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_CINDEROUS); }
}
