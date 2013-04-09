package uberslayer;

import org.bukkit.plugin.java.JavaPlugin;

import uberslayer.commandexecutors.CommandUberSword;

public class UberPlugin extends JavaPlugin{

	@Override
	public void onDisable(){
		getLogger().info("UberPlugin has been disabled!");
	}
	
	@Override
	public void onEnable(){
		getLogger().info("UberPlugin has been enabled!");
		
		getCommand("ubersword").setExecutor(new CommandUberSword(this));
	}
	
	
}
