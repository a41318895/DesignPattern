package com.aki.designPattern.creation.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class SingletonReflection {

    private static final SingletonReflection uniqueInstance = new SingletonReflection();

    private Integer number = 1 ;

    private SingletonReflection() {
        System.out.println("Creating instance ...");

        // (Prevent) Use reflection to access private constructor
        if(uniqueInstance != null) {
            throw new RuntimeException("Can't create an instance of this class. Please use getInstance() instead.") ;
        }
    }

    public static SingletonReflection getInstance() {
        return uniqueInstance;
    }

    public void increaseNumber() {
        this.number ++ ;
    }

    public static void main(String[] args) {

        try {
            // Use reflection to access private constructor
            Class<?> clazz = Class.forName("com.aki.designPattern.creation.singleton.SingletonReflection");
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);

            SingletonReflection s3 = (SingletonReflection) constructor.newInstance();
            System.out.println("Hashcode of Object s3 " + s3.hashCode());
            System.out.println(s3.number);

        } catch (InvocationTargetException e) {
            System.out.println("InvocationTargetException caught:");
            Throwable cause = e.getCause();  // Get the original exception (RuntimeException)
            System.out.println("Cause: " + cause.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()).replace(", ", ",\n"));
        } catch (Exception e) {
            System.out.println("Exception caught:");
            System.out.println(Arrays.toString(e.getStackTrace()).replace(", ", ",\n"));
        }
    }
}
