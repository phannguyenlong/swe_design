package observer.simple.observer;

/**
 * This is the implementation with the Observer to print the input line
 */
public class RecieveObserver implements Observer {
    @Override
    public void start(String line) {
        System.out.println("Recieved response: " + line);
    }

}
