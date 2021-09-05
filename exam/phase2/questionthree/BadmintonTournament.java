package exam.phase2.questionthree;

import exam.phase2.questionthree.interator.Interator;
import exam.phase2.questionthree.interator.TournamentInterator;

public class BadmintonTournament extends Tournament {
    private Tournament leftBracket;
    private Tournament rightBracket;

    public Tournament getLeftBracket() {
        return leftBracket;
    }

    public void setLeftBracket(Tournament leftBracket) {
        this.leftBracket = leftBracket;
    }
    
    public Tournament getRightBracket() {
        return rightBracket;
    }

    public void setRightBracket(Tournament rightBracket) {
        this.rightBracket = rightBracket;
    }

    public Interator getInterator() {
        return new TournamentInterator(this); // return Interator for this
    }
}
