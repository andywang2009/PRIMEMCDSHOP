package Arena;
import org.bukkit.Location;
import org.bukkit.entity.Player;
    public class SetArena {

        private Location regionMin; // 区域最小坐标
        private Location regionMax; // 区域最大坐标

        public void RegionDetector(Location regionMin, Location regionMax) {
            this.regionMin = regionMin;
            this.regionMax = regionMax;
        }

        public boolean isInRegion(Player player) {
            Location playerLocation = player.getLocation();
            double x = playerLocation.getX();
            double y = playerLocation.getY();
            double z = playerLocation.getZ();
            return x >= regionMin.getX() && x <= regionMax.getX()
                    && y >= regionMin.getY() && y <= regionMax.getY()
                    && z >= regionMin.getZ() && z <= regionMax.getZ();
        }
    }

