package EventDetect;

import com.avaje.ebean.validation.NotNull;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.ItemStack;

public class ArenaBlock implements Listener {
    @EventHandler
    public void onBlockDamage(BlockDamageEvent blockDamageEvent){
        Player player = blockDamageEvent.getPlayer();
        Block block = blockDamageEvent.getBlock();
        ItemStack iteminhand = blockDamageEvent.getItemInHand();
        boolean instaBreak = blockDamageEvent.getInstaBreak();
        boolean DiamondAxe = iteminhand.equals(blockDamageEvent.getItemInHand().getType() == Material.DIAMOND_AXE);
        if (DiamondAxe){
          Location Location = block.getLocation();
          int X = Location.getBlockX();
          int Y = Location.getBlockY();
          int Z = Location.getBlockZ();
            int[] pos1 = new int [2];
            pos1[0] = X;
            pos1[1] = Y;
            pos1[2] = Z;
            player.sendMessage("请选择你的第二个点");
        }
    }
}
