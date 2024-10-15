package com.aki.designPattern.behavioral.observer;

public interface Subject {

    void registerObserver(Observer observer) ;

    void unregisterObserver(Observer observer) ;

    void notifyObservers() ;

    Object getUpdatedState() ;
}
