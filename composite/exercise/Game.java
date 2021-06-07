package composite.exercise;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("1", 20);
        Player player2 = new Player("2", 30);
        Player player3 = new Player("3", 40);
        Player player4 = new Player("4", 10);

        PlayerMatch qualifyMatch1 = new PlayerMatch();
        qualifyMatch1.addPlayer(player1);
        qualifyMatch1.addPlayer(player2);

        PlayerMatch qualifyMatch2 = new PlayerMatch();
        qualifyMatch2.addPlayer(player3);
        qualifyMatch2.addPlayer(player4);


        PlayerMatch finalMatch = new PlayerMatch();
        
        finalMatch.addPlayer(qualifyMatch1);
        finalMatch.addPlayer(qualifyMatch2);

        System.out.println("Winner of qualify 1 is " + qualifyMatch1.getWinner());
        System.out.println("Winner of qualify 2 is " + qualifyMatch2.getWinner());
        System.out.println("Champion is " + finalMatch.getWinner());
    }
}
