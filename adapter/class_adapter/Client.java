package adapter.class_adapter;

import adapter.class_adapter.adapter.AndroidToLighningAdapter;
import adapter.class_adapter.adapter.HuaweiToLighningAdapter;
import adapter.class_adapter.adapter.IPhoneToMicroUSBAdapter;
import adapter.class_adapter.phone.Android;
import adapter.class_adapter.phone.Huwaei;
import adapter.class_adapter.phone.Iphone;
import adapter.class_adapter.phone.LightningPhone;
import adapter.class_adapter.phone.MircoUSBPhone;

public class Client {
    static void rechargeMicroUSBPhone(MircoUSBPhone phone) {
        phone.useMicroUSB();
        phone.recharge();
    }

    static void rechargeLightningPhone(LightningPhone phone) {
        phone.useLightning();
        phone.recharge();
    }
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Android android = new Android();
        Huwaei huwaei = new Huwaei();

        // rechange normal
        System.out.println("=============Recharge Lightning phone================");
        rechargeLightningPhone(iphone);
        System.out.println("============Recharge MircorUSB phone============");
        rechargeMicroUSBPhone(android);

        /**
         * Explain
         * Client use mircroUSB 
         * Client need to charge iPhone => which is now incompatiple
         * ==> mircoUSB is target and Iphone is adaptee
         * ==> Use Adapter to conver Iphone to use MircoUSB
         */
        // recharge Iphone with MircoUSB
        System.out.println("============Recharge with Iphone to MicroUSB adapter============");
        rechargeMicroUSBPhone(new IPhoneToMicroUSBAdapter(iphone));

        /**
         * Explain
         * Client use Lighning 
         * Client need to charge Android => which is now incompatiple
         * ==> Lightning is target and Android is adaptee
         * ==> Use Adapter to conver MircoUSB to use Lighning
         */
        // recharge Android with lightning
        System.out.println("============Recharge Android to Lighning adapter============");
        rechargeLightningPhone(new AndroidToLighningAdapter(android));
        
        // recharge with other MicroUSBPhone
        System.out.println("============Test to recharge Huawei with other MircoUSBPhone============");
        rechargeLightningPhone(new HuaweiToLighningAdapter(huwaei));
    }    
}
