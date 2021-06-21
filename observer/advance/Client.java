package observer.advance;

import observer.advance.observer.RecieveObserver;
import observer.advance.observer.UpperObserver;
import observer.advance.observer.CountObserver;

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
