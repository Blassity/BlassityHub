package com.blassity.hub.listeners;

import static org.bukkit.ChatColor.GOLD;
import static org.bukkit.ChatColor.GRAY;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.blassity.hub.Var;

public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		String pn = player.getName();
		event.setJoinMessage(GOLD + ">> " + GRAY + pn + GOLD + " has joined the server");
		
		Location spawn = Var.spawnLocation();
		player.teleport(spawn);
	}

}
