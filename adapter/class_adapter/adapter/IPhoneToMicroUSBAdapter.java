package adapter.class_adapter.adapter;

import adapter.class_adapter.phone.Iphone;
import adapter.class_adapter.phone.MircoUSBPhone;

public class IPhoneToMicroUSBAdapter extends Iphone implements MircoUSBPhone {

    @Override
    public void useMicroUSB() {
        System.out.println("MicroUSB connected");
        this.useLightning();   
    }
}
