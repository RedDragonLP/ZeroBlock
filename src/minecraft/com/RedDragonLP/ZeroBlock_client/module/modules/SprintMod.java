package com.RedDragonLP.ZeroBlock_client.module.modules;

import org.lwjgl.input.Keyboard;

import com.RedDragonLP.ZeroBlock_client.module.Module;

import net.minecraft.entity.player.EntityPlayer;

public class SprintMod extends Module
{

	public SprintMod()
	{
		super("Sprint", Keyboard.KEY_C);
	}

	@Override
	public void onEnable()
	{
		
	}

	@Override
	public void onDisable()
	{
		mc.thePlayer.setSprinting(false);
	}

	@Override
	public void onToggle()
	{
		
	}

	@Override
	public void onTick()
	{
		if (!this.isEnabled())
			return;
		
		if (!mc.thePlayer.isSprinting() && !mc.thePlayer.isSneaking() && mc.thePlayer.moveForward != 0F && !mc.thePlayer.isCollidedHorizontally)
		{
			mc.thePlayer.setSprinting(true);
		}
	}

	@Override
	public void onRender()
	{
		
	}

}
