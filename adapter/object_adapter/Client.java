package adapter.object_adapter;

import adapter.object_adapter.adapter.LightningToMicroUSBAdapter;
import adapter.object_adapter.adapter.MicroUSBToLightningAdapter;
import adapter.object_adapter.phone.Android;
import adapter.object_adapter.phone.Huwaei;
import adapter.object_adapter.phone.Iphone;
import adapter.object_adapter.phone.LightningPhone;
import adapter.object_adapter.phone.MircoUSBPhone;

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
         * Client need to charge iPhone (which is lightning) => which is now incompatiple
         * ==> mircoUSB is target and LightningPhone (which include Iphone) is adaptee
         * ==> Use Adapter to conver Lighnight to use MircoUSB
         */
        // recharge lightning with MircoUSB
        System.out.println("============Recharge with Lighning to MicroUSB adapter============");
        rechargeMicroUSBPhone(new LightningToMicroUSBAdapter(iphone));

        /**
         * Explain
         * Client use Lighning 
         * Client need to charge Android (which is MircoUSB) => which is now incompatiple
         * ==> Lightning is target and MircoUSB (which include Android) is adaptee
         * ==> Use Adapter to conver MircoUSB to use Lighning
         */
        // recharge MircoUSB with lightning
        System.out.println("============Recharge with MicroUSB to Lighning adapter============");
        rechargeLightningPhone(new MicroUSBToLightningAdapter(android));
        
        // recharge with other MicroUSBPhone
        System.out.println("============Test to recharge with other MircoUSBPhone============");
        rechargeLightningPhone(new MicroUSBToLightningAdapter(huwaei));
    }    
}
