package net.ryanhecht.ParksQuest.NPCs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

import net.ryanhecht.ParksQuest.*;
public class MinecartMan extends NPC{
	public final static Location loc=new Location(Bukkit.getWorlds().get(0), 100, 60, 100);
	public MinecartMan() {
		super(loc);
		
	}
}
