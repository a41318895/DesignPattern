package com.aki.designPattern.structural.composite;

public class CompositeTest {

    public static void main(String[] args) {

        try {

            GiftPack giftPackRoot = new GiftPack("Root Gift Pack");
            giftPackRoot.add(new Gift("Gift - 1"));
            giftPackRoot.add(new Gift("Gift - 2"));

            GiftPack smallGiftPack = new GiftPack("Small Gift Pack");
            smallGiftPack.add(new Gift("Gift - 3"));
            smallGiftPack.add(new Gift("Gift - 4"));

            giftPackRoot.add(smallGiftPack);

            giftPackRoot.display(1);

        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
