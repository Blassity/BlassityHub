package com.blassity.hub;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.blassity.hub.commands.Help;
import com.blassity.hub.commands.Host;
import com.blassity.hub.commands.Spawn;
import com.blassity.hub.listeners.EntityDamage;
import com.blassity.hub.listeners.PlayerInteract;
import com.blassity.hub.listeners.PlayerJoin;

public class Main extends JavaPlugin {

	//Casper als je iets wilt toevoegen aan deze lijst, doe het maar!
	//TODO: Command log
	
	@Override
	public void onEnable(){
		registerListener(new PlayerJoin());
		registerListener(new EntityDamage());
		registerListener(new PlayerInteract());
		
		getCommand("host").setExecutor(new Host());
		getCommand("help").setExecutor(new Help());
		getCommand("spawn").setExecutor(new Spawn());
		
		regenerateHunger();
	}
	
	private void registerListener(Listener listener){
		PluginManager pman = Bukkit.getServer().getPluginManager();
		pman.registerEvents(listener, this);
	}
	
	private void regenerateHunger(){
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
			public void run(){
				for (Player player : Bukkit.getOnlinePlayers()){
					player.setFoodLevel(20);
				}
			}
		}, 0, 1*20);
	}
}
