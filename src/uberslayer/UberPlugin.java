package uberslayer;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class UberPlugin extends JavaPlugin implements Listener{

	@Override
	public void onEnable(){
		getLogger().info("UberPlugin has been enabled!");
		
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(this, this);
		
	}
	
	@EventHandler(ignoreCancelled = true)
	public void onBlockBreak(BlockBreakEvent event){
		Player plr = event.getPlayer();
		plr.sendMessage(ChatColor.GOLD + "You broke a " + event.getBlock().getType());
	}
	
	@EventHandler(ignoreCancelled = true)
	public void onBlockPlace(BlockPlaceEvent event){
		Player plr = event.getPlayer();
		plr.sendMessage(ChatColor.GOLD + "You placed a " + event.getBlock().getType());
	}
}
