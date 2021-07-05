package observer.advance;

import observer.advance.observer.RecieveObserver;
import observer.advance.observer.UpperObserver;
import observer.advance.observer.CountObserver;

/**
 * This is more advance cause Observer can choose when it ready to be attached to Service
 * => Client dont need to add Observer to the Service
 * Client only need to create the Observer and it will be automaticaly add to Service when it is ready
 */
public class Client {
    public static void main(String[] args) {
        // Creating the service
        LineSourceService service = new ConcreteLineSourceService();

        // Create the Observer and let them decide when it ready to attach into the Service
        new RecieveObserver(service);
        new CountObserver(service);
        new UpperObserver(service);

        // start the service
        service.startProc();
    }
}
