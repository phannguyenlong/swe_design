package exam.phase2.questionthree;

import exam.phase2.questionthree.interator.Interator;

public class BadmintonMatch extends Tournament{
    public BadmintonMatch(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public Interator getInterator() {
        return null;
    }

    @Override
    public Tournament getLeftBracket() {
        return null;
    }

    @Override
    public Tournament getRightBracket() {
        return null;
    }
}
