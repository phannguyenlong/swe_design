package di;

public class EmailService implements Service{

    @Override
    public void sendMessage(String message) {
        sendEmail(message);
    }
 
    private void sendEmail(String message) {
        System.out.println("Email Message: " + message);
    }
}