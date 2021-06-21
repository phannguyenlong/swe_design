package observer.simple.observer;

/**
 * This is the implementation with the Observer to print the uppercase of the input
 */
public class UpperObserver implements Observer {


    @Override
    public void start(String line) {
        System.out.println("Uppercase: " + line.toUpperCase());
    }
    
}
