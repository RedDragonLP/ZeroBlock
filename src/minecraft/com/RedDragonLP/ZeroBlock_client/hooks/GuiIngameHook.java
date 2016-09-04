package com.RedDragonLP.ZeroBlock_client.hooks;

import com.RedDragonLP.ZeroBlock_client.ZeroBlock;
import com.RedDragonLP.ZeroBlock_client.module.Module;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

public class GuiIngameHook extends GuiIngame
{
	public GuiIngameHook(Minecraft mcIn)
	{
		super(mcIn);
	}

	public void renderGameOverlay(float partialTicks)
	{
		super.renderGameOverlay(partialTicks);
		this.renderClientName();
		this.renderFPS();
		this.renderCoords();
		this.renderMods();
	}
	
	private void renderClientName()
	{
		drawString(Minecraft.getMinecraft().fontRendererObj, ZeroBlock.NAME, 5, 5, 0xFFF);
	}
	
	private void renderFPS()
	{
		drawString(Minecraft.getMinecraft().fontRendererObj, String.valueOf("FPS: " + ZeroBlock.mc.getDebugFPS()), 5, 15, 0xFFFFFF);
	}
	
	private void renderCoords()
	{
		drawString(Minecraft.getMinecraft().fontRendererObj, String.valueOf("X: " + Math.round(ZeroBlock.mc.thePlayer.posX) + " Y: " + Math.round(ZeroBlock.INSTANCE.mc.thePlayer.posY) + " Z: " + Math.round(ZeroBlock.INSTANCE.mc.thePlayer.posZ)), 5, 25, 0xFFFFFF);
	}
	
	private void renderMods()
	{
		drawString(Minecraft.getMinecraft().fontRendererObj, "Active Mods:", 100, 5, 0xFFFFFF);
		int y = 34;
		for (Module m : ZeroBlock.INSTANCE.mods.moduleList)
		{
			if (!m.isEnabled())
				continue;
			drawString(Minecraft.getMinecraft().fontRendererObj, m.getName(), 5, y, 0xFFFFFF);
			y += 10;
		}
	}
}
