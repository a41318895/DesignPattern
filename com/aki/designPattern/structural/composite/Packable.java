package com.aki.designPattern.structural.composite;

public interface Packable {

    void add(Packable packable);
    void remove(Packable packable);
    void display(int depth) ;
}
