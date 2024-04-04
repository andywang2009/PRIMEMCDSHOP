package Command;
import EventDetect.ArenaBlock;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class MainCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings.length==0){
            commandSender.sendMessage(ChatColor.RED + "DirtShop By Andywangdream(PrimeMc Network 2024)" + "\n" + ChatColor.AQUA + "Command Help" + "\n" + ChatColor.AQUA + "/dirtshop setArena <Vaule>" + "\n" + ChatColor.AQUA + "/dirtshop open" + ChatColor.RED + "OpenDirtShop Online Menu" );

        }
        else if(strings.length==8){
            String args_to_String = strings[0];
            if (args_to_String.equals("setArena")){
                Player Operator = (Player) commandSender;
                Operator.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE));
                Operator.sendMessage(ChatColor.AQUA + "请选择你的第一个区域点");

                return true;
            }
            return true;
        }
        return true;
    }

    }



