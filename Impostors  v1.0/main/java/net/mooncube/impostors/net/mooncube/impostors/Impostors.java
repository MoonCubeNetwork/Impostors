package net.mooncube.impostors;

import org.bukkit.plugin.java.JavaPlugin;

public class Impostors extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Impostors plugin enabled!");
        // Rejestracja komend i eventów
    }

    @Override
    public void onDisable() {
        getLogger().info("Impostors plugin disabled!");
    }
}
