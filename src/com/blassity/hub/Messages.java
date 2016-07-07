package com.blassity.hub;

import static org.bukkit.ChatColor.*;

public class Messages {
	
	private static String prefix = GOLD + "Blassity" + GRAY + " >> ";
	
	public static String notAPlayer(){
		return prefix + RED + "You must be a player to execute this command";
	}
	
	public static String hostInfo(){
		return prefix + YELLOW + "This server is hosted by RobinMC. Website: http://robinmc.com";
	}

}
