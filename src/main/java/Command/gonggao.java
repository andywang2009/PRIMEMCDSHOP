package Command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class gonggao implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender1, Command command1, String label, String[] strings1) {

        if (commandSender1.isOp()) {
            Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "【服务器在线管理公告】" + "\n" + strings1[0]);
            commandSender1.sendMessage("已经给你发送消息了!");
        } else {
            commandSender1.sendMessage(ChatColor.AQUA + "你他妈不是OP发你妈呢");
            String player = commandSender1.getName();
            Bukkit.getServer().broadcastMessage(ChatColor.RED + "【服务器公告】" + "\n" + player + "是个傻逼！");
            World world = commandSender1.getServer().getWorld(player);
            Player player2 = (Player) commandSender1;
            int i = 0;
            for (i = 0;; ){
                ((Player) commandSender1).getWorld().spawnEntity(((Player) commandSender1).getLocation(), EntityType.PRIMED_TNT);
                int i1 = i+1;
                try {
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (i1 == 10){
                    break;
                }
            }

        }
        return false;
    }
}
