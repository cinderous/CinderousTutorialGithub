package com.cinderous.cinderoustutorial.objects.items.food;

import com.cinderous.cinderoustutorial.Main;
import com.cinderous.cinderoustutorial.init.ItemInit;
import com.cinderous.cinderoustutorial.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood implements IHasModel {

	public ItemCustomFood(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.cinderoustab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
