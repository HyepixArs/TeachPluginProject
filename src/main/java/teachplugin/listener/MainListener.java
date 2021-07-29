package teachplugin.listener;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import teachplugin.objects.CircleParticle;
import teachplugin.objects.ParticleRunnable;

/**
 * 該類為事件的主要類
 * @author LinSy
 */
public final class MainListener
        implements Listener {

    @EventHandler
    public void onPlayerInteractEvent(final PlayerInteractEvent event) {
        final Player player = event.getPlayer();
        if (event.getAction().equals(Action.LEFT_CLICK_AIR)) {
            final ParticleRunnable runnable = new CircleParticle(Particle.VILLAGER_HAPPY, player);
            runnable.start();
        }
    }

}
