package com.aki.designPattern.creation.factory.abstractFactory;

import com.aki.designPattern.creation.factory.common.SamsungGalaxyS23;

public class SamsungGalaxyS23MobileFactory extends MobileFactory{

    public SamsungGalaxyS23 createSamsungGalaxyS23Mobile() {
        return new SamsungGalaxyS23();
    }
}
