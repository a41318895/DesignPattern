package com.aki.designPattern.creation.factory.factory;

import com.aki.designPattern.creation.factory.common.IPhone16;
import com.aki.designPattern.creation.factory.common.SamsungGalaxyS23;

public class MobileFactory {

    public MobileFactory() {}

    public IMobile createMobile(String mobileType) {

        IMobile mobile = null;

        switch (mobileType.toLowerCase()) {
            case "iphone16":
                mobile = new IPhone16();
                System.out.println("Iphone 16 created !");
                return mobile;
            case "samsung23":
                mobile = new SamsungGalaxyS23() ;
                System.out.println("Samsung 23 created !");
                return mobile;
            default:
                System.out.println("Unknown mobile type : " + mobileType);
        }

        return mobile;
    }
}
