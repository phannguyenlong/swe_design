package state.state;

import state.KEY;
import state.KeyBoardContext;

/** 
 * Normal state without any mode on
 */
public class NormalState implements State {
    @Override
    public void tap(KeyBoardContext keyBoard, KEY key) {
        switch (key) {
            case CAPS_LOCK:
                keyBoard.setState(new CaplockState());
                System.out.println("Caplock: ON");
                break;
            case SHIFT:
                System.out.println("No effect when press Shift");
                break;
            default:
                System.out.println(key.getValue());
                break;
        }
    }

    @Override
    public void hold(KeyBoardContext keyBoard, KEY key) {
        switch (key) {
            case SHIFT:
                System.out.println("HOLD: SHIFT");
                keyBoard.setState(new ShiftState()); // when shift is hold => change to shif state
                break;
            default:
                tap(keyBoard, key); // if hold not shift => act like normal
                break;
        }
    }

    @Override
    public void unHold(KeyBoardContext keyBoard, KEY key) {
        switch (key) {
            case SHIFT:
                System.out.println("Can not unhold Shift at this state");
                break;
            default:
                break;
        }
    }
}
