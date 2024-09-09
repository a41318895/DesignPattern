package com.aki.designPattern.creation.factory.abstractFactory;

import com.aki.designPattern.creation.factory.common.IPhone16;
import com.aki.designPattern.creation.factory.common.SamsungGalaxyS23;

import java.util.Arrays;

public class AbstractFactoryTest {

    private static final MobileFactory mobileFactory = new MobileFactory();

    public static void main(String[] args) {

        try {
            // Make IPhone Factory
            IPhone16MobileFactory iPhone16MobileFactory =
                    (IPhone16MobileFactory) mobileFactory.createMobile("iphone16");

            // Make Mobile
            IPhone16 iPhone16 = iPhone16MobileFactory.createIPhone16Mobile();
            // Show Mobile Information
            iPhone16.showBatteryPower();

            // Make Samsung Factory
            SamsungGalaxyS23MobileFactory samsungGalaxyS23MobileFactory =
                    (SamsungGalaxyS23MobileFactory) mobileFactory.createMobile("samsung23");

            // Make Mobile
            SamsungGalaxyS23 samsungGalaxyS23 = samsungGalaxyS23MobileFactory.createSamsungGalaxyS23Mobile();
            // Show Mobile Information
            samsungGalaxyS23.showCost();


            // Throw Exception
            SamsungGalaxyS23MobileFactory samsungGalaxyS23MobileFactoryNull =
                    (SamsungGalaxyS23MobileFactory) mobileFactory.createMobile(null);
            // Not be Executed
            SamsungGalaxyS23 samsung23 = samsungGalaxyS23MobileFactoryNull.createSamsungGalaxyS23Mobile();
            samsung23.showBatteryPower();

        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()).replace(", ", ",\n"));
        }
    }
}
