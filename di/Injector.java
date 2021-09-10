package di;

public class Injector {

    public static void main(String[] args) throws Exception {
        App client = new App(); // create client
        
        // Scenario: Client want to use email service
        // create Service
        Service emailService = new EmailService();
        // Inject server into client
        client.setService(emailService);

        // use email service
        client.run("Send by email");

        // Scenario: Client want to use SMS service
        //create Service
        Service smsService = new SmsService();
        // Inject server into client
        client.setService(smsService);

        // use SM service
        client.run("Send by sms");
        
    }
}
