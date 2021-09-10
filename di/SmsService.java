package di;

public class SmsService implements Service{
    @Override
    public void sendMessage(String message) {
        sendSms(message);
    }

    private void sendSms(String message) {
        System.out.println("SMS Message: " + message);
    }
}
