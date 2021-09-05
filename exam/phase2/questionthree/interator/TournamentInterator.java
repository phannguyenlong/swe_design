package exam.phase2.questionthree.interator;

import java.util.ArrayList;

import exam.phase2.questionthree.BadmintonTournament;
import exam.phase2.questionthree.Tournament;

// this will loop through the tournament
public class TournamentInterator implements Interator {
    private Tournament tournament;
    private ArrayList<Tournament> leafs = new ArrayList<>();
    int pointer = 0; // pointer for current match in tournament

    public TournamentInterator(BadmintonTournament tournament) {
        this.tournament = tournament;

        getLeaf(this.tournament);
    }

    // get all leafs and put into arrays
    private void getLeaf(Tournament tournament) {
        if (tournament.getLeftBracket() != null) {
            getLeaf(tournament.getLeftBracket());
        }

        if (tournament.getRightBracket() != null) {
            getLeaf(tournament.getRightBracket());
        }

        if (tournament.getLeftBracket() == null && tournament.getRightBracket() == null) { // means leaf
            leafs.add(tournament);
        }
    }

    @Override
    public void next() {
        this.pointer++;
    }

    @Override
    public boolean hasNext() {
        if ((this.pointer) < leafs.size())
            return true;
        return false;
    }

    @Override
    public Tournament currentBadmintonMatch() {
        return leafs.get(pointer);
    }
    
}
