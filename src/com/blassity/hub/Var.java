package com.blassity.hub;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class Var {
	
	public static Location spawnLocation(){
		return new Location(Bukkit.getWorld("Hub"), 0.5, 32, 0.5);
	}

}
