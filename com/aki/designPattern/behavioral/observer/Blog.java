package com.aki.designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject Concrete
public class Blog implements Subject {

    private final String subjectName ;
    private final List<Observer> observers ;
    private boolean isStateChanged ;
    private String articleTitle ;

    public Blog(String subjectName) {
        this.subjectName = subjectName ;

        observers = new ArrayList<>() ;
        isStateChanged = false ;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer) ;
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer) ;
    }

    @Override
    public void notifyObservers() {
        if(isStateChanged) {

            for(Observer observer : observers) {
                observer.updateObserveState() ;
                System.out.printf("Subject ( %s ) Notified Observer !\n", subjectName) ;
            }
        }
    }

    @Override
    public Object getUpdatedState() {

        Object updatedStates = null ;

        if(isStateChanged) {
            updatedStates = this.articleTitle ;
        }

        return updatedStates ;
    }

    public void postArticle(String articleTitle) {
        this.articleTitle = articleTitle ;

        isStateChanged = true ;
        notifyObservers() ;
    }
}
