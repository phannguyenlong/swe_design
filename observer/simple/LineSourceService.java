package observer.simple;

import observer.simple.observer.Observer;

/**
 * This is the Serive interface
 * It will content method for client adding Observer and method for client run all observer that is added
 * It also inform the observer with change for the client
 */
public interface LineSourceService {
    public void attachObserver(Observer service);

    public void dettachObserver(Observer service);

    public void startProc();    
}
