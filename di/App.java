package di;

public class App {
    private Service service; // client use service not injector

    public App() {
    }

    // using settter injector
    public void setService(Service service) {
        this.service = service;
    }

    public void run(String message) {
        this.service.sendMessage(message);
    }
}
