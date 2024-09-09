package com.aki.designPattern.creation.factory.common;

import com.aki.designPattern.creation.factory.factory.IMobile;

public class IPhone16 implements IMobile {

    @Override
    public void showCost() {
        System.out.println("It costs 35400 NTD");
    }

    @Override
    public void showBatteryPower() {
        System.out.println("Battery power : 3561 mAh");
    }

    @Override
    public void showStorageSpace() {
        System.out.println("Storage space : 256 GB");
    }

    public void showAppStore() {
        System.out.println("Show App Store");
    }
}
