package su_ctrl.main.plugin;

import java.util.logging.Logger;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {
	
	Logger log = Logger.getLogger("Minecraft");
	
	@EventHandler
	public void block (BlockPlaceEvent e) {
		Block b = e.getBlock();
		Player p = e.getPlayer();
		
		if(b.getType().equals(Material.PISTON)) {
			log.warning(p.getDisplayName() + " placed " + b.getType() + " on X: " + b.getX() + "; Y: " + b.getY() + "; Z: " + b.getZ() + ";");
		} else if(b.getType().equals(Material.STICKY_PISTON)) {
			log.warning(p.getDisplayName() + " placed " + b.getType() + " on X: " + b.getX() + "; Y: " + b.getY() + "; Z: " + b.getZ() + ";");
		} else if(b.getType().equals(Material.DISPENSER)) {
			log.warning(p.getDisplayName() + " placed " + b.getType() + " on X: " + b.getX() + "; Y: " + b.getY() + "; Z: " + b.getZ() + ";");
		} else if(b.getType().equals(Material.DROPPER)) {
			log.warning(p.getDisplayName() + " placed " + b.getType() + " on X: " + b.getX() + "; Y: " + b.getY() + "; Z: " + b.getZ() + ";");
		} else if(b.getType().equals(Material.OBSERVER)) {
			log.warning(p.getDisplayName() + " placed " + b.getType() + " on X: " + b.getX() + "; Y: " + b.getY() + "; Z: " + b.getZ() + ";");
		} else if(b.getType().equals(Material.HOPPER)) {
			log.warning(p.getDisplayName() + " placed " + b.getType() + " on X: " + b.getX() + "; Y: " + b.getY() + "; Z: " + b.getZ() + ";");
		}
	}
}
