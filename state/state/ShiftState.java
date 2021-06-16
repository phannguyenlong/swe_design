package state.state;

import state.KEY;
import state.KeyBoardContext;

/**
 * State when client holding the Shift key
 */
public class ShiftState implements State {

    @Override
    public void tap(KeyBoardContext keyBoard, KEY key) {
        switch (key) {
            case CAPS_LOCK:
                System.out.println("No effect when press Caps");
                break;
            case SHIFT:
                System.out.println("No effect cause SHIFT is holding");
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
                System.out.println("Can not hold the SHIFT twice");
                break;
            default:
                tap(keyBoard, key);
                break;
        }
    }

    @Override
    public void unHold(KeyBoardContext keyBoard, KEY key) {
        switch (key) {
            case SHIFT:
                System.out.println("UNHOLD: SHIFT");
                keyBoard.setState(new NormalState()); // when shift is release => return to normal
                break;
            default:
                System.out.println("Can not unhold cause it is not hold yet");
                break;
        }
    }
    
}
