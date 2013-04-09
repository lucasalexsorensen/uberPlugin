package uberslayer;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import uberslayer.commandexecutors.CommandUberSword;

public class UberPlugin extends JavaPlugin implements Listener{

	@Override
	public void onDisable(){
		getLogger().info("UberPlugin has been disabled!");
	}
	
	@Override
	public void onEnable(){
		getLogger().info("UberPlugin has been enabled!");
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		
		getCommand("ubersword").setExecutor(new CommandUberSword(this));
	}
	
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onBlockBreak(BlockBreakEvent event){
		if(event.getBlock().getType() == Material.IRON_FENCE){
			Block blk = event.getBlock();
			blk.getDrops().clear();
			blk.getDrops().add(new ItemStack(Material.IRON_INGOT));
		}
	}
	
}
