package teachplugin.objects;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * 代表特效的交互介面
 * @author LinSy
 */
public interface ParticleRunnable {

    @NotNull
    Particle getParticle();

    @NotNull
    Player getOwner();

    void start();

    void stop();

}
