package state.state;

import state.KEY;
import state.KeyBoardContext;

/**
 * State when client press the Caplock => turn on caplock mode
 */
public class CaplockState implements State {
    @Override
    public void tap(KeyBoardContext keyBoard, KEY key) {
        switch (key) {
            case CAPS_LOCK:
                keyBoard.setState(new NormalState());
                System.out.println("Caplock: OFF");
                break;
            case SHIFT:
                System.out.println("No effect when press Shift");
                break;
            default:
                System.out.println(key.getValue().toUpperCase());
                break;
        }
    }

    @Override
    public void hold(KeyBoardContext keyBoard, KEY key) {
        switch (key) {
            case SHIFT:
                System.out.println("No effect");
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
