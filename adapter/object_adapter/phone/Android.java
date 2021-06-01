package adapter.object_adapter.phone;

public class Android implements MircoUSBPhone {
    private boolean connector;

    @Override
    public void useMicroUSB() {
        connector = true;
        System.out.println("MicroUsb connected");
    }

    @Override
    public void recharge() {
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect MicroUsb first");
        }
    }

}
