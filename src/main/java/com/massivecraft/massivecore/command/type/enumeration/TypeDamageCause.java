package com.massivecraft.massivecore.command.type.enumeration;

import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class TypeDamageCause extends TypeEnum<DamageCause>
{
    // -------------------------------------------- //
    // INSTANCE & CONSTRUCT
    // -------------------------------------------- //

    private static TypeDamageCause i = new TypeDamageCause();
    public static TypeDamageCause get() { return i; }
    public TypeDamageCause()
    {
        super(DamageCause.class);
    }
}

