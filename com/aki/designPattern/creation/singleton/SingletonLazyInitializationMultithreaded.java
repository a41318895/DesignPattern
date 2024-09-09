package com.aki.designPattern.creation.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonLazyInitializationMultithreaded {

    private static volatile SingletonLazyInitializationMultithreaded instance = null ;

    // To erase warning : Instantiation of utility class 'SingletonLazyInitializationMultithreaded'
    private final boolean isUtilityClass = false ;

    private SingletonLazyInitializationMultithreaded() {
        System.out.println("Creating...");
    }

    // Double Lock Checking : It reduces synchronize cost and guarantee thread be safe via double check and volatile keyword
    public static SingletonLazyInitializationMultithreaded getInstance(){
        // Double Lock Checking
        if (instance == null) {
            synchronized (SingletonLazyInitializationMultithreaded.class) {
                if(instance == null) {
                    instance = new SingletonLazyInitializationMultithreaded();
                }
            }
        }
        return instance;
    }
    private static void useSingletonByDoubleLockChecking() {
        SingletonLazyInitializationMultithreaded singleton = SingletonLazyInitializationMultithreaded.getInstance();
        System.out.println("Hashcode of Double Lock Checking Singleton Object : " + singleton.hashCode());
    }

    // Holder Class Loading : Inner Holder Class will be called when getInstanceByHolderInnerClass() method is called.
    private static class Holder {
        private static final SingletonLazyInitializationMultithreaded INSTANCE = new SingletonLazyInitializationMultithreaded();
    }
    public static SingletonLazyInitializationMultithreaded getInstanceByHolderInnerClass() {
        return Holder.INSTANCE;
    }

    private static void useSingletonByInnerClassLoading() {
        SingletonLazyInitializationMultithreaded singleton = SingletonLazyInitializationMultithreaded.getInstanceByHolderInnerClass();
        System.out.println("Hashcode of Holder Class Singleton Object : " + singleton.hashCode());
    }

    // Enumeration : Implementation is simple, and safe thread. Prevent singleton violation of serialize and reflect.
    //               Inheritance and Polymorphism situation will be restricted !
    public enum SingletonEnum {
        INSTANCE ;

        public void printHashcode() {
            System.out.println("Hashcode of Enum Singleton Object : " + this.hashCode());
        }
    }
    private static void useSingletonByEnum() {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.printHashcode();
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        // Using Double Lock Checking
        service.submit(SingletonLazyInitializationMultithreaded::useSingletonByDoubleLockChecking);
        service.submit(SingletonLazyInitializationMultithreaded::useSingletonByDoubleLockChecking);

        // Using Holder Class
        service.submit(SingletonLazyInitializationMultithreaded::useSingletonByInnerClassLoading);
        service.submit(SingletonLazyInitializationMultithreaded::useSingletonByInnerClassLoading);

        // Using Enum Singleton
        service.submit(SingletonLazyInitializationMultithreaded::useSingletonByEnum);
        service.submit(SingletonLazyInitializationMultithreaded::useSingletonByEnum);

        service.shutdown();
    }
}
