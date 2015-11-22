package net.ryanhecht.ParksQuest;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {
		
	}
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("pq")) {
			NPC npc = new NPC(player.getLocation());
			double dx = Double.parseDouble(args[0]);
			double v = Double.parseDouble(args[1]);
			npc.walk(new Location(player.getWorld(), player.getLocation().getX()+dx, player.getLocation().getY(), player.getLocation().getZ()),v);
			
		}
		return false;
	}
	public static Plugin getPlugin() {
		return Main.getPlugin(Main.class);
	}
}
