package com.blassity.hub.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Host implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		sender.sendMessage(ChatColor.GOLD + "Blassity" + ChatColor.GRAY + " >> " + ChatColor.YELLOW +  "This server is hosted by RobinMC. Website: http://robinmc.com");
		return true;
	}

}
