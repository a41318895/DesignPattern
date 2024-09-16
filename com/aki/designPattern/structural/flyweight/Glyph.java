package com.aki.designPattern.structural.flyweight;

// Act as 內部狀態 ( Intrinsic State ) :
// Unchanged and shared part
public class Glyph {

    private final char character ;

    public Glyph(char character) {
        this.character = character;
    }

    public void display(int showPosition) {
        System.out.println("Display " + character + " at the position " + showPosition) ;
    }

    @Override
    public String toString() {
        return String.format("[ %c ]", character);
    }
}
