package Command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class restartServer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        boolean isop = commandSender.hasPermission("group.admin");
        Player player = (Player) commandSender;
        GameMode gamemode = player.getGameMode();

        if (isop){
            Bukkit.getServer().shutdown();
        }
        else{
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.RED + "小鬼别烦 给你个创造好好玩玩");

        }
        return false;
    }
}
