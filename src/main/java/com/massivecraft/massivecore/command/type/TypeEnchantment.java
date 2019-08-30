package com.massivecraft.massivecore.command.type;

import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.collections.MassiveSet;
import com.massivecraft.massivecore.util.Txt;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TypeEnchantment extends TypeAbstractChoice<Enchantment>
{
	// -------------------------------------------- //
	// DATA
	// -------------------------------------------- //
	// http://minecraft.gamepedia.com/Enchanting#Enchantments
	
	// The first name is taken from the wiki. Those names are those people think of.
	// The second name is the Bukkit enum name.
	// Thereafter comes assorted extras

	public static Map<String, List<String>> KEY_TO_RAWNAMES = new MassiveMap<>(
			"fire_protection", new MassiveList<>("Fire Protection", "PROTECTION_FIRE"),
			"sharpness", new MassiveList<>("Sharpness", "sharpness"),
			"flame", new MassiveList<>("Flame", "flame"),
			"aqua_affinity", new MassiveList<>("Fire Protection", "aqua_affinity"),
			"punch", new MassiveList<>("Punch", "punch"),
			"loyalty", new MassiveList<>("Loyalty", "loyalty"),
			"depth_strider", new MassiveList<>("Depth Strider", "depth_strider"),
			"vanishing_curse", new MassiveList<>("Curse of Vanishing", "vanishing_curse"),
			"unbreaking", new MassiveList<>("Unbreaking", "unbreaking"),
			"knockback", new MassiveList<>("Knockback", "knockback"),
			"luck_of_the_sea", new MassiveList<>("Luck of the Sea", "luck_of_the_sea"),
			"binding_curse", new MassiveList<>("Curse of Binding", "binding_curse"),
			"fortune", new MassiveList<>("Fortune", "fortune"),
			"protection", new MassiveList<>("Protection", "protection"),
			"efficiency", new MassiveList<>("Efficiency", "efficiency"),
			"mending", new MassiveList<>("Mending", "mending"),
			"frost_walker", new MassiveList<>("Frost Walker", "frost_walker"),
			"lure", new MassiveList<>("Lure", "lure"),
			"looting", new MassiveList<>("Looting", "looting"),
			"piercing", new MassiveList<>("Piercing", "piercing"),
			"blast_protection", new MassiveList<>("Blast Protection", "blast_protection"),
			"smite", new MassiveList<>("Smite", "smite"),
			"multishot", new MassiveList<>("Multishot", "multishot"),
			"fire_aspect", new MassiveList<>("Fire Aspect", "fire_aspect"),
			"channeling", new MassiveList<>("Channeling", "channeling"),
			"sweeping", new MassiveList<>("Sweeping Edge", "sweeping"),
			"thorns", new MassiveList<>("Thorns", "thorns"),
			"bane_of_arthropods", new MassiveList<>("Bane of Arthropods", "bane_of_arthropods"),
			"respiration", new MassiveList<>("Respiration", "respiration"),
			"riptide", new MassiveList<>("Riptide", "riptide"),
			"silk_touch", new MassiveList<>("Silk Touch", "silk_touch"),
			"quick_charge", new MassiveList<>("Quick Charge", "quick_charge"),
			"projectile_protection", new MassiveList<>("Projectile Protection", "projectile_protection"),
			"impaling", new MassiveList<>("Impaling", "impaling"),
			"feather_falling", new MassiveList<>("Feather Falling", "feather_falling"),
			"power", new MassiveList<>("Power", "power"),
			"infinity", new MassiveList<>("Infinity", "infinity")
		);
	
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static TypeEnchantment i = new TypeEnchantment();
	public static TypeEnchantment get() { return i; }
	public TypeEnchantment()
	{
		super(Enchantment.class);
		this.setVisualColor(ChatColor.AQUA);
		this.setAll(Enchantment.values());
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public String getNameInner(Enchantment enchantment)
	{
		String rawname = enchantment.getKey().getKey();
		return Txt.getNicedEnumString(rawname);
	}
	
	@Override
	public Set<String> getNamesInner(Enchantment enchantment)
	{
		// Create
		Set<String> ret = new MassiveSet<>();
		
		// Fill
		List<String> raws = new MassiveList<>();
		List<String> rawnames = KEY_TO_RAWNAMES.get(enchantment.getKey().getKey());
		if (rawnames != null) raws.addAll(rawnames);
		raws.add(enchantment.getName());
		for (String raw : raws)
		{
			ret.add(Txt.getNicedEnumString(raw));
		}
		
		// Return
		return ret;
	}
	
	@Override
	public String getIdInner(Enchantment enchantment)
	{
		return enchantment.getKey().getKey();
	}

}
