package exam.phase2.questionthree;

import exam.phase2.questionthree.interator.Interator;

public abstract class Tournament {
    Player player1;
    Player player2;

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }
    
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public abstract Interator getInterator();

    public abstract Tournament getLeftBracket();

    public abstract Tournament getRightBracket();
}
