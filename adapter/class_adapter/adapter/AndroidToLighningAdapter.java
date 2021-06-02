package adapter.class_adapter.adapter;

import adapter.class_adapter.phone.Android;
import adapter.class_adapter.phone.LightningPhone;

public class AndroidToLighningAdapter extends Android implements LightningPhone {
    
    @Override
    public void useLightning() {
        System.out.println("Lighning connected");
        useMicroUSB();
    }
}
