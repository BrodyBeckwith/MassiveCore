package com.massivecraft.massivecore.command.type.enumeration;

import org.bukkit.Particle;

public class TypeParticleEffect extends TypeEnum<Particle>
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static TypeParticleEffect i = new TypeParticleEffect();
	public static TypeParticleEffect get() { return i; }
	public TypeParticleEffect()
	{
		super(Particle.class);
	}

}
