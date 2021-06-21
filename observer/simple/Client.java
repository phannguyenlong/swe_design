package observer.simple;

import observer.simple.observer.CountObserver;
import observer.simple.observer.RecieveObserver;
import observer.simple.observer.UpperObserver;

public class Client {
    public static void main(String[] args) {
        // Creating the service
        LineSourceService service = new ConcreteLineSourceService();

        // Register for Observer that client need to use
        service.attachObserver(new RecieveObserver());
        service.attachObserver(new CountObserver());
        service.attachObserver(new UpperObserver());

        // start the service
        service.startProc();
    }
}
