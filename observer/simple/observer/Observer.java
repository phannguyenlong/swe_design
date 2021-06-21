package observer.simple.observer;

/**
 * This is the interface for the Observer
 * This will implement the action client need to use
 * It will be register to the Service to run
 * Serivce will update (notify) Observer when client change/update something
 */
public interface Observer {

    // method to start the Observer
    public void start(String line);
}
