package com.aki.designPattern.structural.adapter;

public class EarphoneAdapter implements USBTypeC{

    private final Earphone earphone ;

    // Put the earphone (Object) into adapter
    public EarphoneAdapter(Earphone earphone) {
        this.earphone = earphone ;
    }

    @Override
    public void use() {
        earphone.useEarphone();
    }
}
