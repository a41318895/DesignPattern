package com.aki.designPattern.creation.factory.factory;

import com.aki.designPattern.creation.factory.common.IPhone16;
import com.aki.designPattern.creation.factory.common.SamsungGalaxyS23;

public class FactoryTest {

    private static final MobileFactory mobileFactory = new MobileFactory();

    public static void main(String[] args) {

        IPhone16 iphone16 = (IPhone16) mobileFactory.createMobile("iphone16");
        iphone16.showCost();
        iphone16.showBatteryPower();
        iphone16.showStorageSpace();
        iphone16.showAppStore();

        SamsungGalaxyS23 samsungGalaxyS23 = (SamsungGalaxyS23) mobileFactory.createMobile("samsung23") ;
        samsungGalaxyS23.showCost();
        samsungGalaxyS23.showBatteryPower();
        samsungGalaxyS23.showStorageSpace();
        samsungGalaxyS23.showSamsungStore();
    }
}
