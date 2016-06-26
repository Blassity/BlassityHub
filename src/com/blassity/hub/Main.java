package com.blassity.hub;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.blassity.hub.listeners.PlayerJoin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable(){
		registerListener(new PlayerJoin());
	}
	@Override
	public void onDisable(){
		
	}
	private void registerListener(Listener listener){
		PluginManager pman = Bukkit.getServer().getPluginManager();
		pman.registerEvents(listener, this);
	}
}