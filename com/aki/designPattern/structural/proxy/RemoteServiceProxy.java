package com.aki.designPattern.structural.proxy;

public class RemoteServiceProxy implements Service {

    private ServiceImpl serviceImpl;
    private final User user;

    public RemoteServiceProxy(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        if (authenticate()) {
            if (serviceImpl == null) {
                serviceImpl = new ServiceImpl();
            }
            System.out.println("Calling remote service...");
            serviceImpl.execute();
        } else {
            System.out.println("Failed to call remote service...");
        }
    }

    // Authentication Mechanism
    private boolean authenticate() {
        return "dev".equalsIgnoreCase(user.getUsername()) && "123456".equals(user.getPassword());
    }
}

