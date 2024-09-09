package com.aki.designPattern.creation.singleton;

import java.util.Arrays;

public class SingletonClone implements Cloneable {

    private static final SingletonClone uniqueInstance = new SingletonClone() ;

    private SingletonClone() {
        System.out.println("Creating instance ...");
    }

    public static SingletonClone getInstance() {
        return uniqueInstance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        // (Prevent) Use clone to violate Singleton design pattern
        if(uniqueInstance != null) {
            throw new CloneNotSupportedException("Can't create instance. Please use getInstance() to create it.") ;
        }

        return super.clone();
    }

    public static void main(String[] args) {

        SingletonClone s1 = SingletonClone.getInstance();
        SingletonClone s2 = SingletonClone.getInstance();
        System.out.println("Hashcode of Object s1 : " + s1.hashCode());
        System.out.println("Hashcode of Object s2 : " + s2.hashCode());

        try {

            SingletonClone s3 = (SingletonClone) s2.clone();
            System.out.println("Hashcode of Object s3 : " + s3.hashCode());

        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException caught:");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()).replace(", ", ",\n"));
        }
    }

}
