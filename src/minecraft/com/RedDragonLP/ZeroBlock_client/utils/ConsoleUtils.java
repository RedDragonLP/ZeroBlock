package com.RedDragonLP.ZeroBlock_client.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.RedDragonLP.ZeroBlock_client.ZeroBlock;

public class ConsoleUtils
{
	private static DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	private static Date date;
	
	public static void writeINFO(String message)
	{
		date = new Date();
		System.out.println("[" + dateFormat.format(date) + "] [ZeroBlock/INFO]: " + message);
	}
	public static void writeWARN(String message)
	{
		date = new Date();
		System.out.println("[" + dateFormat.format(date) + "] [ZeroBlock/WARN]: " + message);
	}
	public static void writeERROR(String message)
	{
		date = new Date();
		System.out.println("[" + dateFormat.format(date) + "] [ZeroBlock/ERROR]: " + message);
	}
}
