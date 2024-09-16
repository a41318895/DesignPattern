package com.aki.designPattern.structural.proxy;

public class ProxyTest {

    public static void main(String[] args) {

        // Pass the authentication, and this is the first time to create 'ServiceImpl' instance.
        User currentUser1 = new User("dev", "123456") ;

        RemoteServiceProxy remoteServiceProxy1 = new RemoteServiceProxy(currentUser1) ;
        remoteServiceProxy1.execute();

        System.out.println("====================================");

        // The second time or so on, we don't need to authenticate again.
        remoteServiceProxy1.execute();

        System.out.println("====================================");

        // Can't pass the authentication.
        User currentUser2 = new User("anonymous", "123") ;

        RemoteServiceProxy remoteServiceProxy2 = new RemoteServiceProxy(currentUser2) ;
        remoteServiceProxy2.execute();
    }
}
