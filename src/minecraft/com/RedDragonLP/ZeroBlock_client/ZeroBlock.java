package com.RedDragonLP.ZeroBlock_client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RedDragonLP.ZeroBlock_client.files.FileManager;
import com.RedDragonLP.ZeroBlock_client.module.Module;
import com.RedDragonLP.ZeroBlock_client.module.ModuleManager;
import com.RedDragonLP.ZeroBlock_client.utils.ConsoleUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;

public enum ZeroBlock {
	
	INSTANCE;
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	//ClientVars
	public static String NAME = "ZeroBlock";
	public static String VERSION = "1.0.0";
	public static String FULL_VERSION = "ZeroBlock v1.0.0(MC:1.10.X)";
	
	//Resources
	public ResourceLocation LOCATION_MAIN_BACKGROUND = new ResourceLocation("textures/gui/title/background/zeroblock.png");
	public ResourceLocation LOCATION_LOADING_SCREEN = new ResourceLocation("textures/gui/title/loading.png");
	
	//UtilVars
	public static Minecraft mc =  Minecraft.getMinecraft();
	public static FontRenderer fr = Minecraft.getMinecraft().fontRendererObj;
	
	public FileManager files;
	public ModuleManager mods;
		
	public void startClient()
	{
		files = new FileManager();
		mods = new ModuleManager();
		
		//TODO:Authorisation
		LOGGER.info("Validating ZeroBlock license.");
		LOGGER.info("ZeroBlock license valid.");
		
		files.init();
	}
	
}
