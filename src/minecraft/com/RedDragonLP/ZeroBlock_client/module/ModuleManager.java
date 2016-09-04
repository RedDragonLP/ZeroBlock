package com.RedDragonLP.ZeroBlock_client.module;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RedDragonLP.ZeroBlock_client.module.modules.*;

public class ModuleManager
{
	private static final Logger LOGGER = LogManager.getLogger();
	
	public static ArrayList<Module> moduleList = new ArrayList<Module>();
	public static ArrayList<Module> activeMods = new ArrayList<Module>();
	
	public ModuleManager()
	{
		this.moduleList.add(new JesusMod()); 	// KEY_J
		this.moduleList.add(new SprintMod());	// KEY_C
	}
	
	public ArrayList<Module> getEnabledMods()
	{
		return activeMods;
	}
	
	public Module getModByClassName(String name)
	{
		for (Module mod : moduleList)
		{
			if (mod.getClass().getSimpleName().equals(name));
			{
				return mod;
			}
		}
		return null;
	}
	
	public Module getModByName(String name)
	{
		for (Module mod : moduleList)
		{
			if (mod.getName().equals(name))
			{
				return mod;
			}
		}
		return null;
	}
	
	public Module findMod(Class<?extends Module> clazz)
	{
		for (Module m : moduleList)
		{
			if (m.getClass() == clazz)
			{
				return m;
			}
		}
		return null;
	}
	
	public Module findMod(String name)
	{
		Module m = getModByName(name);
		if (m != null)
		{
			return m;
		}
		m = getModByClassName(name);
		return m;
	}
}
