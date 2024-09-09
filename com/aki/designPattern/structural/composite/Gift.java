package com.aki.designPattern.structural.composite;

public class Gift implements Packable {

    private String itemName ;

    public Gift(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void add(Packable packable) {
        throw new UnsupportedOperationException("[ Gift ] doesn't support add operation.");
    }

    @Override
    public void remove(Packable packable) {
        throw new UnsupportedOperationException("[ Gift ] doesn't support remove operation.");
    }

    @Override
    public void display(int depth) {
        System.out.println("--".repeat(depth) + itemName);
    }
}
