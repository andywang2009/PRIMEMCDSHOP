package Command;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class MainCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings.length==0){
            commandSender.sendMessage(ChatColor.RED + "DirtShop By Andywangdream(PrimeMc Network 2024)" + "\n" + ChatColor.AQUA + "Command Help" );

        }
        else if(strings.length==1){
            String args_to_String = strings[0];
            if (args_to_String.equals("gonggao")){
               commandSender.sendMessage("公告是单独语句 用/gonggao + string试试？");
                return true;
            }
            return true;
        }
        return true;
    }}



