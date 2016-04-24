package com.massivecraft.massivecore.item;

import org.bukkit.Color;
import org.bukkit.potion.PotionEffect;

public class WriterPotionEffectColor extends WriterAbstractPotionEffect<Integer, Color>
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static final WriterPotionEffectColor i = new WriterPotionEffectColor();
	public static WriterPotionEffectColor get() { return i; }
	public WriterPotionEffectColor()
	{
		super("color");
		this.setConverterTo(ConverterToColor.get());
		this.setConverterFrom(ConverterFromColor.get());
	}
	
	// -------------------------------------------- //
	// ACCESS
	// -------------------------------------------- //
	
	@Override
	public Integer getA(DataPotionEffect ca)
	{
		return ca.getColor();
	}
	
	@Override
	public void setA(DataPotionEffect ca, Integer fa)
	{
		ca.setColor(fa);
	}
	
	@Override
	public Color getB(PotionEffect cb)
	{
		return cb.getColor();
	}
	
}
