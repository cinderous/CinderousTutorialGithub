package com.cinderous.cinderoustutorial.init;

import java.util.ArrayList;
import java.util.List;

import com.cinderous.cinderoustutorial.objects.blocks.BlockBase;
import com.cinderous.cinderoustutorial.objects.blocks.BlockCinderTest;
//import com.cinderous.cinderoustutorial.objects.blocks.BlockCrystalCinderous;
//import com.cinderous.cinderoustutorial.objects.blocks.BlockPlantSpiceCinderous;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOCK_CINDEROUS = new BlockBase("block_cinderous", Material.IRON);
	
	//public static final Block PLANT_SPICE_CINDEROUS = new BlockPlantSpiceCinderous("plant_spice_cinderous");
	
	//public static final Block BLOCK_CRYSTAL_CINDEROUS = new BlockCrystalCinderous("block_crystal_cinderous");

	public static final Block BLOCK_CINDERTEST = new BlockCinderTest("cinder_test");
}
