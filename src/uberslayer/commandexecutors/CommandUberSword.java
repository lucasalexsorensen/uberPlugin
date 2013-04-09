package uberslayer.commandexecutors;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import uberslayer.UberPlugin;

public class CommandUberSword implements CommandExecutor{
	@SuppressWarnings("unused")
	private UberPlugin plugin;
	
	public CommandUberSword(UberPlugin plugin){
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player){
			Player plr = (Player) sender;
			PlayerInventory pi = plr.getInventory();
			ItemStack uberSword = new ItemStack(Material.DIAMOND_SWORD);
			uberSword.addEnchantment(Enchantment.KNOCKBACK, 2);
			uberSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
			uberSword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
			uberSword.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
			plr.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 2));
			pi.addItem(uberSword);
			sender.sendMessage(ChatColor.GOLD + "You are now uber! Have fun murdering biches!");
			
		}else{
			sender.sendMessage("You have to be a player to issue that command!");
			return false;
		}
		return false;
	}
	
	
}
