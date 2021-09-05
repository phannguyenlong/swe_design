package exam.phase2.questionthree;

import java.util.ArrayList;

import exam.phase2.questionthree.interator.Interator;

// using interator to create 3 memoth findName, getNamesOfYoungestPlayers, getNamesOfOpponents
// Idea using interator to loop throught the tournament => make client more easily to implement these method
public class Client {
    public static boolean findName(Tournament tournament, String name) {
        
        for (Interator interator = tournament.getInterator(); interator.hasNext(); interator.next()) {
            Tournament match = interator.currentBadmintonMatch();
            if (match.getPlayer1().getName().equals(name) || match.getPlayer2().getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void getNamesOfYoungestPlayers(Tournament tournament) {
        Interator interator = tournament.getInterator();
        ArrayList<Player> youngestPlayers = new ArrayList<>();
        youngestPlayers.add(interator.currentBadmintonMatch().getPlayer1());

        for (Interator i = interator; i.hasNext(); i.next()) {
            Tournament match = i.currentBadmintonMatch();
            // compare with player 1
            if (match.getPlayer1().getAge() < youngestPlayers.get(0).getAge()) {
                youngestPlayers.clear(); // clear the array
                youngestPlayers.add(match.getPlayer1());
            } else if (match.getPlayer1().getAge() == youngestPlayers.get(0).getAge()) {
                youngestPlayers.add(match.getPlayer1());
            }

            // compare with player 2
            if (match.getPlayer2().getAge() < youngestPlayers.get(0).getAge()) {
                youngestPlayers.clear(); // clear the array
                youngestPlayers.add(match.getPlayer2());
            } else if (match.getPlayer2().getAge() == youngestPlayers.get(0).getAge()) {
                youngestPlayers.add(match.getPlayer2());
            }
        }
        
        for (Player player : youngestPlayers)
            System.out.println(player.getName());     
    }

    public static void getNamesOfOpponents(Tournament tournament, String name) {
        ArrayList<Player> opponents = new ArrayList<>();

        for (Interator interator = tournament.getInterator(); interator.hasNext(); interator.next()) {
            Tournament match = interator.currentBadmintonMatch();

            if (match.getPlayer1().getName().equals(name))
                opponents.add(match.getPlayer2());
            if (match.getPlayer2().getName().equals(name))
                opponents.add(match.getPlayer1());
        }

        for (Player player : opponents) 
            System.out.println(player.getName());
    }
    public static void main(String[] args) {
        // use 3 class Player, BadmintonMatch, BadminTournament
        BadmintonTournament tournament = new BadmintonTournament();

        // create player
        Player player1 = new Player("player 1", 18);
        Player player2 = new Player("player 2", 18);
        Player player3 = new Player("player 3", 19);
        Player player4 = new Player("player 4", 22);

        // create match
        BadmintonMatch match1 = new BadmintonMatch(player1, player2);
        BadmintonMatch match2 = new BadmintonMatch(player3, player4);

        // add to tournament
        tournament.setLeftBracket(match1);
        tournament.setRightBracket(match2);

        tournament.getInterator();

        System.out.println(findName(tournament, "player 4"));
        getNamesOfYoungestPlayers(tournament);
        getNamesOfOpponents(tournament, "player 3");
    }
}
