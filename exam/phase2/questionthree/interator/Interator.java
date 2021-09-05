package exam.phase2.questionthree.interator;

import exam.phase2.questionthree.Tournament;

// Interface for Interator
public interface Interator {
    public boolean hasNext();

    public void next();

    public Tournament currentBadmintonMatch();
    
}
