package composite.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * This is composite object
 */
public class PlayerMatch implements Tournament {
    private List<Tournament> players = new ArrayList<>();
    private Player winner;

    public void addPlayer(Tournament player) {
        players.add(player);
    }

    // public void fight() {
    //     winner = (Player) players.get(0).getPlayer();
    //     for (int i = 1; i < players.size(); i++) {
    //         Player player = (Player) players.get(i).getPlayer();
    //         if (winner.getStrength() < player.getStrength())
    //             winner = player;
    //     }
    // }

    @Override
    public Tournament getWinner() {
        winner = (Player) players.get(0).getWinner();
        for (int i = 1; i < players.size(); i++) {
            Player player = (Player) players.get(i).getWinner();
            if (winner.getStrength() < player.getStrength())
                winner = player;
        }
        return winner;
    }
}
