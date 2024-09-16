package com.aki.designPattern.structural.proxy;

public class ServiceImpl implements Service{

    public ServiceImpl() {
        System.out.println("Create ServiceImpl instance...");
    }

    @Override
    public void execute() {
        System.out.println("Executing the service...");
    }
}
