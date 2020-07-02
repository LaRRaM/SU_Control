package su_ctrl.main.plugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;
import org.bukkit.scoreboard.Team.Option;
import org.bukkit.scoreboard.Team.OptionStatus;

public class Main extends JavaPlugin implements Listener{
	Team team;
	
	@Override
	public void onEnable() {
		Scoreboard s = Bukkit.getScoreboardManager().getMainScoreboard();
		
		Bukkit.getPluginManager().registerEvents(new BlockPlace(), this);
		
		team = s.getTeam("su");
		if(team == null) {
			team = s.registerNewTeam("su");
		}
		
		team.setAllowFriendlyFire(true);
		team.setCanSeeFriendlyInvisibles(false);
		team.setOption(Option.NAME_TAG_VISIBILITY, OptionStatus.NEVER);
		
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void join(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		String name = p.getName();
		team.addEntry(name);		
	}
}
