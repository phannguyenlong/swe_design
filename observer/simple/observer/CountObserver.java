package observer.simple.observer;

/**
 * This is the implementation with the Observer to print number of character
 */
public class CountObserver implements Observer {

    @Override
    public void start(String line) {
        System.out.println("Character count: " + line.length());
    }
    
}
