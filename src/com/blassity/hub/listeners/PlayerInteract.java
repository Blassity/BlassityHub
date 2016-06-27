package com.blassity.hub.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteract implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent event){
		if (!(event.getPlayer().hasPermission("blassityhub.interact"))){
			event.setCancelled(true);
		}
	}

}
