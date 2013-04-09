package uberslayer;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class UberPlugin extends JavaPlugin{
	
	@Override
	public void onEnable(){
		getLogger().info("UberPlugin has been enabled!");
		getLogger().info("UberPlugin is initializing..");
		getCommand("uber").setExecutor(new UberPluginCommandExecutor(this));
		
		ShapedRecipe lavaBucket = new ShapedRecipe(new ItemStack(Material.LAVA_BUCKET)).shape("***","*%*","***").setIngredient('*', Material.NETHER_BRICK).setIngredient('%', Material.WATER_BUCKET);

		getServer().addRecipe(lavaBucket);
	}
	
	@Override
	public void onDisable(){
		getLogger().info("UberPlugin has been disabled!");
	}

}
