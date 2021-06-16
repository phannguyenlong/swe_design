package state.state;

import state.KEY;
import state.KeyBoardContext;

/**
 * Interface of the state for KeyBoardContext
 * Passing keyBoardCOntext cause the some method will change the state of KeyBoardContext
 */
public interface State {
    public void tap(KeyBoardContext keyBoard, KEY key);

    public void hold(KeyBoardContext keyBoard, KEY key);

    public void unHold(KeyBoardContext keyBoard, KEY key);
}
