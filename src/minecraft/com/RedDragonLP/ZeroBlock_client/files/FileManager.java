package com.RedDragonLP.ZeroBlock_client.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.Consumer;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;

import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class FileManager
{
	public final File zeroBlockDir = new File(Minecraft.getMinecraft().mcDataDir, "ZeroBlock");
	public final File autobuildDir = new File(zeroBlockDir, "autobuild");
	public final File skinDir = new File(zeroBlockDir, "skins");
	public final File serverlistsDir = new File(zeroBlockDir, "serverlists");
	public final File spamDir = new File(zeroBlockDir, "spam");
	public final File scriptsDir = new File(spamDir, "autorun");
	
	public final File alts = new File(zeroBlockDir, "alts.json");
	public final File friends = new File(zeroBlockDir, "friends.json");
	public final File gui = new File(zeroBlockDir, "gui.json");
	public final File modules = new File(zeroBlockDir, "modules.json");
	public final File navigatorData = new File(zeroBlockDir, "navigator.json");
	public final File keybinds = new File(zeroBlockDir, "keybinds.json");
	public final File options = new File(zeroBlockDir, "options.json");
	public final File autoMaximize = new File(Minecraft.getMinecraft().mcDataDir + "/ZeroBlock/automaximize.json");
	public final File xray = new File(zeroBlockDir, "xray.json");
	
	public void init()
	{
		if(!zeroBlockDir.exists())
			zeroBlockDir.mkdir();
		if(!autobuildDir.exists())
			autobuildDir.mkdir();
		if(!spamDir.exists())
			spamDir.mkdir();
		if(!scriptsDir.exists())
			scriptsDir.mkdir();
		if(!skinDir.exists())
			skinDir.mkdir();
		if(!serverlistsDir.exists())
			serverlistsDir.mkdir();
	}
}
