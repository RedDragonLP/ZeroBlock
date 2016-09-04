package com.RedDragonLP.ZeroBlock_client.module;

import com.RedDragonLP.ZeroBlock_client.ZeroBlock;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public abstract class Module
{
	protected Minecraft mc = ZeroBlock.INSTANCE.mc;
	private String modulename;
	private int keybind;
	private boolean isEnabled;

	public Module(String modulename, int keybind)
	{
		this.modulename = modulename;
		this.keybind = keybind;
	}

	public abstract void onEnable();
	public abstract void onDisable();
	public abstract void onToggle();
	public abstract void onTick();
	public abstract void onRender();
	
	public String getName()
	{
		return this.modulename;
	}
	
	public int getKeybind()
	{
		return this.keybind;
	}
	
	public boolean isEnabled()
	{
		return this.isEnabled;
	}
	
	public void setState(boolean flag)
	{
		if (this.isEnabled() == flag)
			return;
		
		this.isEnabled = flag;
		if (this.isEnabled())
		{
			this.onEnable();
		}
		else
		{
			this.onDisable();
		}
	}
	
	public void toggle()
	{
		this.setState(!this.isEnabled());
		this.onToggle();
	}
}
