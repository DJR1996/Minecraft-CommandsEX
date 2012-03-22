package com.github.zathrus_writer.commandsex.api;

import org.bukkit.command.CommandSender;

import com.github.zathrus_writer.commandsex.CommandsEX;

public class CommandTpaccept {
	
	/***
	 * <ol>
	 *  <li><u>CommandTpaccept.execute(<em>Player (1)</em>, <em>Player (2)</em>)</u></li>
	 * 	<ul>
	 * 		<li>accepts a /tpa or /tpahere request for Player (1) that was placed by Player (2) - if Player (1) has permissions to use the command</li>
	 *	</ul>
	 * </ol>
	 * 
	 * @param sender <strong><em>CommandSender</em></strong>	Player instance - use <em>getServer().getPlayer(&quot;name&quot;)</em>
	 * @param args <strong><em>String[]</em></strong>			Player instance
	 */
	public static void execute(CommandSender sender, String... args) {
		CommandsEX.plugin.getServer().getPluginCommand("cex_tpaccept").execute(sender, "cex_tpaccept", args);
	}
}