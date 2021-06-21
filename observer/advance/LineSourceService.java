package observer.advance;

import observer.advance.observer.Observer;

/**
 * This is the Subject abstract class (not interface cause it need to hold the state)
 * It will content method for client adding Observer and method for client run all observer that is added
 * It also inform the observer with change for the client
 * It also be pass to the Observer in order to let the observer design when it is ready to attach to the Service
 */
public abstract class LineSourceService {
    protected String state;

    public abstract void attachObserver(Observer service);

    public abstract void dettachObserver(Observer service);

    public abstract void startProc();

    public abstract String getState();
}
