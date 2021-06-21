package observer.advance.observer;

import observer.advance.LineSourceService;

/**
 * This is the abstract class for the Observer (cause it has to hold the Subject(Service))
 * This will implement the action client need to use
 * Client will pass the servicer into the Observer in order to:
 *      This can be register itselft to the serivce when it is ready => client can add Observer dont need to care when it is ready
 *      Observer can get the state from the serverice to execute correctly
 * Serivce will update (notify) Observer when client change/update something
 */
public abstract class Observer {
    protected LineSourceService service;

    // reciece the service from client
    public Observer(LineSourceService service) {
        this.service = service;
    }

    // method to run the Observer
    public abstract void start();
}
