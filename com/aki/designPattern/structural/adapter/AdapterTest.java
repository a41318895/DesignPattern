package com.aki.designPattern.structural.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        // The earphone used
        Earphone earphone = new Earphone();

        // Put the earphone into adapter, and adapter links to the type-c interface on phone
        USBTypeC usbTypeC = new EarphoneAdapter(earphone) ;

        // Use the earphone with phone's type-c interface via adapter
        usbTypeC.use();
    }
}
