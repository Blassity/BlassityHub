package com.blassity.hub.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Help implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		//TODO: Custom /help
		sender.sendMessage("Custom help menu coming soon!");
		return true;
	}

}
