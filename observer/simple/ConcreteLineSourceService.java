package observer.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import observer.simple.observer.Observer;

/**
 * This is the implementation of the the Service
 * This will has the list to hold all reigstered Observer
 * It will content method for client adding Observer and method for client run all observer that is added
 * It also inform the observer with change for the client
 */
public class ConcreteLineSourceService implements LineSourceService {
    List<Observer> services = new ArrayList<>(); // use for holding registered Observer

    @Override
    public void attachObserver(Observer service) { // use for register Observer
        services.add(service);
    }

    @Override
    public void dettachObserver(Observer service) { // use for deregister Observer
        services.remove(service);
    }

    @Override
    public void startProc() { // run all the registered Observers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line: ");
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            for (Observer s : services) {
                s.start(line);
            }
            System.out.print("Enter line: ");
        }
        scanner.close();
    }
}
