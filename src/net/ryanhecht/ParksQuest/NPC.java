package net.ryanhecht.ParksQuest;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

//Everything WIP, of course, and still messy as I work on stuff
public class NPC {
	Plugin plugin = Main.getPlugin();
	ArmorStand stand;
	public NPC(Location l) {
		
		stand = l.getWorld().spawn(l, ArmorStand.class);
		stand.setArms(true);
		stand.setBasePlate(false);
		stand.setMarker(true);
	}
	void walk(final Location d) {
        new BukkitRunnable() {
        	
            @Override
            public void run() {
                if((int)stand.getLocation().getX()==(int)d.getX() && (int)stand.getLocation().getY()==(int)d.getY() && (int)stand.getLocation().getZ() ==(int)d.getZ()) {
                	stand.setVelocity(new Vector(0,0,0));                	
                	this.cancel();
                }
                else {
                	stand.setVelocity(new Vector(0.2,0,0));
                	stand.setLeftArmPose(new EulerAngle(stand.getLeftArmPose().getX()-1, stand.getLeftArmPose().getY(), stand.getLeftArmPose().getZ()));
                	stand.setRightArmPose(new EulerAngle(stand.getLeftArmPose().getX()+1, stand.getLeftArmPose().getY(), stand.getLeftArmPose().getZ()));
                	stand.setLeftLegPose(new EulerAngle(stand.getLeftArmPose().getX()+1, stand.getLeftArmPose().getY(), stand.getLeftArmPose().getZ()));
                	stand.setRightLegPose(new EulerAngle(stand.getLeftArmPose().getX()-1, stand.getLeftArmPose().getY(), stand.getLeftArmPose().getZ()));
                    
                }
            }
           
        }.runTaskTimer(plugin, 1, 1);
        Bukkit.getServer().getLogger().info("test");
	}
}
