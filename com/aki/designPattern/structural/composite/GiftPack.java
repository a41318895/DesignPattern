package com.aki.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GiftPack implements Packable {

    private final String itemName ;
    private final List<Packable> giftPacks = new ArrayList<>();

    public GiftPack(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void add(Packable packable) {
        giftPacks.add(packable);
    }

    @Override
    public void remove(Packable packable) {
        giftPacks.remove(packable);
    }

    @Override
    public void display(int depth) {
        System.out.println("--".repeat(depth) + itemName);
        for (Packable packable : giftPacks) {
            packable.display(depth + 2);
        }
    }
}
