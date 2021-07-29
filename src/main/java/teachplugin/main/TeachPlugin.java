package teachplugin.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import teachplugin.listener.MainListener;

/**
 * 該插件的主要類別
 * @author LinSy
 */
public final class TeachPlugin
        extends JavaPlugin {

    /**
     * 該方法在插件啟用時呼叫
     */
    @Override
    public void onEnable() {
        /* Register listener */
        Bukkit.getPluginManager().registerEvents(new MainListener(), this);
    }

    /**
     * 該方法在插件關閉時呼叫
     */
    @Override
    public void onDisable() {
    }

    /**
     * 獲取該插件的主類實例
     * @return 教學插件實例
     */
    public static TeachPlugin getInstance() {
        return JavaPlugin.getPlugin(TeachPlugin.class);
    }

}
