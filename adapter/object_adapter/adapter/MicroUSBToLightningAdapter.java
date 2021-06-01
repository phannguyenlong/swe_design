package adapter.object_adapter.adapter;

import adapter.object_adapter.phone.LightningPhone;

public class MicroUSBToLightningAdapter implements LightningPhone {
    private final MircoUSBPhone mircoUSBPhone;

    public MicroUSBToLightningAdapter(MircoUSBPhone mircoUSBPhone) {
        this.mircoUSBPhone = mircoUSBPhone;
    }

    @Override
    public void recharge() {
        mircoUSBPhone.recharge();
    }

    @Override
    public void useLightning() {
        System.out.println("Lighning connected");
        mircoUSBPhone.useMicroUSB();
    }
    
}
