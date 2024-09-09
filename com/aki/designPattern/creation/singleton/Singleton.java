package com.aki.designPattern.creation.singleton;

// 當 JVM 讀取此類時, 會創建一個實例 uniqueInstance 裡面有 private Integer number = 1 的變量
public class Singleton {

    private static final Singleton uniqueInstance = new Singleton();

    private Integer number = 1 ;

    // Prevent creating other instances
    private Singleton() { System.out.println("Creating instance ..."); }

    // The only way to get instance of Singleton Class
    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void increaseNumber() {
        this.number ++ ;
    }

    public static void main(String[] args) {

        // Same Object
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Hashcode of Object s1 " + s1.hashCode());
        System.out.println("Hashcode of Object s2 " + s2.hashCode());

        // Increase the private Integer "number"
        s1.increaseNumber();
        System.out.println("S1's number: " + s1.number);
        System.out.println("S2's number: " + s2.number);
    }
}

