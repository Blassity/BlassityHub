package com.blassity.hub.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.blassity.hub.Messages;
import com.blassity.hub.Var;

public class Spawn implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if (!(sender instanceof Player)){
			sender.sendMessage(Messages.notAPlayer());
			return true;
		}
		
		Player player = (Player) sender;
		player.teleport(Var.spawnLocation());
		return true;
	}

}
