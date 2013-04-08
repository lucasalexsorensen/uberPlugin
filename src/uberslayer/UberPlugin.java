package uberslayer;

import org.bukkit.plugin.java.JavaPlugin;

public class UberPlugin extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getLogger().info("UberPlugin has been enabled!");
		getCommand("uber").setExecutor(new UberPluginCommandExecutor(this));
	}
	
	@Override
	public void onDisable(){
		getLogger().info("UberPlugin has been disabled! :(");
	}

}
