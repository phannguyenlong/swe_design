package adapter.object_adapter.adapter;

import adapter.object_adapter.phone.LightningPhone;
import adapter.object_adapter.phone.MircoUSBPhone;

public class LightningToMicroUSBAdapter implements MircoUSBPhone {
    private final LightningPhone lightningPhone;

    public LightningToMicroUSBAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }

    @Override
    public void useMicroUSB() {
        System.out.println("MicroUSB connected");
        lightningPhone.useLightning();
    }
        
}
