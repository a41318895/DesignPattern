package com.aki.designPattern.creation.singleton;

import java.io.*;

public class SingletonSerialize implements Serializable {

    private static final SingletonSerialize instance = new SingletonSerialize();

    private SingletonSerialize() {
        System.out.println("Creating instance ...");
    }

    public static SingletonSerialize getInstance() {
        return instance;
    }

    // (Prevent) Use serialize to violate Singleton design pattern
    // ObjectInputStream.readObject() automatically call the readResolve method when the class implements Serializable
    @Serial
    private Object readResolve() {
        System.out.println("Applying readResolve() method......");
        return SingletonSerialize.getInstance();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonSerialize s1 = SingletonSerialize.getInstance();
        SingletonSerialize s2 = SingletonSerialize.getInstance();
        System.out.println("Hashcode of Object s1 : " + s1.hashCode());
        System.out.println("Hashcode of Object s2 : " + s2.hashCode());

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\Desktop\\DesignPattern\\com\\aki\\designPattern\\creation\\singleton\\s2.ser")) ;
        oos.writeObject(s2);

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\DesignPattern\\com\\aki\\designPattern\\creation\\singleton\\s2.ser")) ;
        SingletonSerialize s3 = (SingletonSerialize) ois.readObject();

        System.out.println("Hashcode of Object s3 : " + s3.hashCode());
    }
}
