package com.cinderous.cinderoustutorial.init;

import java.util.ArrayList;
import java.util.List;

import com.cinderous.cinderoustutorial.objects.items.ItemBase;
import com.cinderous.cinderoustutorial.objects.items.food.ItemCustomFood;
import com.cinderous.cinderoustutorial.objects.items.food.ItemSeed;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item INGOT_CINDEROUS = new ItemBase("ingot_cinderous");
	
	//food
	public static final Item SPICE_CINDEROUS = new ItemCustomFood("spice_cinderous", 1, false);
	public static final Item SEED_SPICE_CINDEROUS = new ItemSeed("seed_spice_cinderous", 1, false);

}
