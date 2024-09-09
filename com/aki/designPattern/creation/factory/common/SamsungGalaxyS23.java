package com.aki.designPattern.creation.factory.common;

import com.aki.designPattern.creation.factory.factory.IMobile;

public class SamsungGalaxyS23 implements IMobile {

    @Override
    public void showCost() {
        System.out.println("It costs 15999 NTD");
    }

    @Override
    public void showBatteryPower() {
        System.out.println("Battery power : 3785 mAh");
    }

    @Override
    public void showStorageSpace() {
        System.out.println("Storage space : 128 GB");
    }

    public void showSamsungStore() {
        System.out.println("This is Samsung Store");
    }
}
