package net.mooncube.impostors.roles.crewmate;

import org.bukkit.entity.Player;

public class Crewmate {
    private final Player player;

    public Crewmate(Player player) {
        this.player = player;
    }

    public void completeTask() {
        player.sendMessage("Task completed!");
    }
}
