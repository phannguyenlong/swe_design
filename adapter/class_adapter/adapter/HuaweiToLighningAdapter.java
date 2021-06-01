package adapter.class_adapter.adapter;

import adapter.class_adapter.phone.Huwaei;
import adapter.class_adapter.phone.LightningPhone;

public class HuaweiToLighningAdapter extends Huwaei implements LightningPhone {
    
    public HuaweiToLighningAdapter(Huwaei huwaei) {
    }
    
    @Override
    public void useLightning() {
        System.out.println("Lighning connected");
        useMicroUSB();
    }
}
