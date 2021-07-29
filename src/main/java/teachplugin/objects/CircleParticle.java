package teachplugin.objects;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import teachplugin.main.TeachPlugin;

public final class CircleParticle
        extends BaseParticleRunnable {

    private final static double HIGH_OFFSET_NUMBER = 0.05d;

    private double time = 0d;

    private double high = 0.1d;

    /**
     * 建構子
     *
     * @param particle 特效類型
     * @param owner 擁有者
     */
    public CircleParticle(final @NotNull Particle particle, final @NotNull Player owner) {
        super(particle, owner);
    }

    @Override
    public void start() {
        this.time = 0;

        // 運行
        this.runTaskTimerAsynchronously(
                TeachPlugin.getInstance(),
                0L, 1L
        );
    }

    @Override
    public void stop() {
        this.cancel();
    }

    @Override
    public void run() {
        if (!this.owner.isOnline())
            this.stop();

        if (this.time > 50)
            this.stop();

        final Location location = this.owner.getLocation();

        final double sinX = Math.sin(this.time) * 0.85; // X 軸 偏移
        final double cosZ = Math.cos(this.time) * 0.85; // Z 軸 偏移
        this.high += HIGH_OFFSET_NUMBER;

        final Location addLocation = location.clone().add(sinX, high, cosZ); // 計算特效生成位置

        this.owner.getWorld().spawnParticle(this.particle, addLocation, 2); //生成特效

        time += 1L; //time = time + 2L;
    }

}
