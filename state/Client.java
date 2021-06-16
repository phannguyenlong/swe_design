package state;

/**
 * Clien dont care about the state, just use the KeyboardContext
 */
public class Client {
    public static void main(String[] args) {
        KeyBoardContext keyboard = new KeyBoardContext();

        // test with pressing caplock on and off
        System.out.println("Test with pressing caplock on and off");
        keyboard.tap(KEY.A);
        keyboard.tap(KEY.CAPS_LOCK); // caplock on
        keyboard.tap(KEY.A);
        keyboard.tap(KEY.CAPS_LOCK); // cap off
        keyboard.tap(KEY.A);

        // test with hold and unhold shift
        System.out.println("\nTest with hold and unhold shif");
        keyboard.tap(KEY.B);
        keyboard.hold(KEY.SHIFT);
        keyboard.tap(KEY.B);
        keyboard.tap(KEY.A);
        keyboard.unHold(KEY.SHIFT);
        keyboard.tap(KEY.B);
        keyboard.tap(KEY.A);
    }
}
