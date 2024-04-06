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
import org.example.Main;

import java.util.Arrays;

public class MainCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings.length > 0 && strings[0].equals("help")){
                commandSender.sendMessage(ChatColor.RED + "DirtShop By Andywangdream(PrimeMc Network 2024)" + "\n" + ChatColor.AQUA + "Command Help" + "\n" + ChatColor.AQUA + "/dirtshop setArena <Vaule>" + "\n" + ChatColor.AQUA + "/dirtshop open" + "\n" + ChatColor.RED + "OpenDirtShop Online Menu");
            }
        else{
            commandSender.sendMessage("Grammar error");
        }

                return true;
            }
        }



