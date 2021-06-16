package state;

import state.state.NormalState;
import state.state.State;

/**
 * This is the Object that has many state
 * This will has the state will be change over time
 * Instead of doing the method => let the state do it
 */
public class KeyBoardContext {
    State state = new NormalState();

    public void setState(State state) {
        this.state = state;
    }

    public void tap(KEY key) {
        state.tap(this, key);
    }

    public void hold(KEY key) {
        state.hold(this, key);
    }

    public void unHold(KEY key) {
        state.unHold(this, key);
    }
}
