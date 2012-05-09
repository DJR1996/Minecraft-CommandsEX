package com.github.zathrus_writer.commandsex.handlers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.github.zathrus_writer.commandsex.CommandsEX;
import com.github.zathrus_writer.commandsex.helpers.Utils;

public class Handler_motd implements Listener {
	
	/***
	 * Activate event listener.
	 */
	public Handler_motd() {
		CommandsEX.plugin.getServer().getPluginManager().registerEvents(this, CommandsEX.plugin);
	}
	
	/***
	 * Welcomes a player on server join.
	 * @param e
	 * @return
	 */
	@EventHandler(priority = EventPriority.LOW)
	public void passChat(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		ChatColor.getByChar("a");
		if (p.hasPlayedBefore()) {
			String[] msg = CommandsEX.getConf().getString("motd").replace("{playername}", p.getName()).split("\\{newline\\}");
			for (String s : msg) {
				p.sendMessage(Utils.replaceChatColors(s));
			}
		} else {
			String[] msg = CommandsEX.getConf().getString("motdNewPlayer").replace("{playername}", p.getName()).split("\\{newline\\}");
			for (String s : msg) {
				p.sendMessage(Utils.replaceChatColors(s));
			}
		}
	}
	
}