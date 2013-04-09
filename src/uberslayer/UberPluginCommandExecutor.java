package uberslayer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class UberPluginCommandExecutor implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private UberPlugin plugin;
	
	public UberPluginCommandExecutor(UberPlugin plugin){
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		return false;
	}
	
}
