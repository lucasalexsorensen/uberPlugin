package uberslayer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class UberPluginCommandExecutor implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private UberPlugin plugin;
	
	public UberPluginCommandExecutor(UberPlugin plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("uber")){
			if(!(sender instanceof Player)){
				sender.sendMessage("This command can only be used by a player ingame!");
			}else if(args[0].equalsIgnoreCase("speed")){
				
				Player plr = (Player) sender;
				if(plr.getWalkSpeed() == 1F){
					plr.setWalkSpeed(.25F);
					sender.sendMessage("Set your speed to .25F!");
				}else{
					plr.setWalkSpeed(1F);
					sender.sendMessage("Set your speed to 1F!");
				}
				
				
			}else if(args[0].equalsIgnoreCase("enchant")){
				if(args[1] != null && args[2] != null){
					Player plr2 = (Player) sender;
					ItemStack hldItm = plr2.getItemInHand();
					int effectId = Integer.parseInt(args[1]);
					int enchLevel = Integer.parseInt(args[2]);
					Enchantment tmpEnch = new EnchantmentWrapper(effectId);
					hldItm.addEnchantment(tmpEnch, enchLevel);
					sender.sendMessage("Succesfully enchanted your item!");
				}else{
					sender.sendMessage("Not a valid enchantment ID or level.");
				}
			}
			return true;
		}
		return false;
	}
	
}
