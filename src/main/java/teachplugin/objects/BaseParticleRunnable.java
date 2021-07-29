package teachplugin.objects;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

/**
 * 代表一個抽象的特效計時器
 * @author LinSy
 */
public abstract class BaseParticleRunnable
        extends BukkitRunnable
        implements ParticleRunnable {

    // 特效類型
    @NotNull
    protected final Particle particle;

    // 特效擁有者
    @NotNull
    protected final Player owner;

    /**
     * 建構子
     * @param particle 特效類型
     * @param owner 擁有者
     */
    public BaseParticleRunnable(final @NotNull Particle particle, final @NotNull Player owner) {
        this.particle = particle;
        this.owner = owner;
    }

    /**
     * 開啟計數
     */
    public abstract void start();

    /**
     * 關閉計數
     */
    public abstract void stop();

    /**
     * 獲取特效類型
     * @return 特效類型
     */
    @NotNull
    public final Particle getParticle() {
        return this.particle;
    }

    /**
     * 獲取擁有者
     * @return 擁有者
     */
    @NotNull
    public final Player getOwner() {
        return owner;
    }

}
