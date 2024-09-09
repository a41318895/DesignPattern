package com.aki.designPattern.creation.factory.abstractFactory;

import com.aki.designPattern.creation.factory.common.IPhone16;

public class IPhone16MobileFactory extends MobileFactory {

    public IPhone16 createIPhone16Mobile() {
        return new IPhone16();
    }
}
