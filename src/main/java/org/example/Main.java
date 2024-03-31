package org.example;
import Command.MainCommand;
import Command.gonggao;
import Command.restartServer;
import com.avaje.ebean.annotation.Sql;
import com.mysql.jdbc.MySQLConnection;
import net.minecraft.server.v1_8_R3.CommandHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        getServer().getLogger();
        System.out.println("DirtShop By PRIMEMC Loaded");
        getServer().broadcastMessage(ChatColor.RED + "此插件由PRIMEMC编写，如果你在别的服务器看到了这个插件，那么请来PRMC.XYZ游玩正版有更新的纯正泥土商店！");
        Bukkit.getPluginCommand("DirtShop").setExecutor((new MainCommand()));
        Bukkit.getPluginCommand("gonggao").setExecutor(new gonggao());
        Bukkit.getPluginCommand("stop").setExecutor(new restartServer());
    }
}