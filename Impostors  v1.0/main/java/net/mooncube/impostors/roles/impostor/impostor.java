package net.mooncube.impostors.roles.impostor;

import org.bukkit.entity.Player;

public class Impostor {
    private final Player player;

    public Impostor(Player player) {
        this.player = player;
    }

    public void sabotage() {
        player.sendMessage("Sabotage triggered!");
    }

    public void eliminate(Player target) {
        target.setHealth(0); // Zabicie gracza
        player.sendMessage("You eliminated " + target.getName() + "!");
    }
}
