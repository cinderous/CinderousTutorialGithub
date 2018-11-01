package com.cinderous.cinderoustutorial;

import com.cinderous.cinderoustutorial.proxy.CommonProxy;
import com.cinderous.cinderoustutorial.tabs.CinderousTab;
import com.cinderous.cinderoustutorial.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	public static final CreativeTabs cinderoustab = new CinderousTab("cinderoustab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
//    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
//        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
//        // some example code
//        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
