package com.aki.designPattern.behavioral.observer;

// Observer Concrete
public class BlogUser implements Observer{

    private final String observerName ;
    private Subject observeSubject ;
    private String updatedArticleTitle ;

    public BlogUser(String observerName) {
        this.observerName = observerName ;
    }

    @Override
    public void setObserveSubject(Subject subject) {
        this.observeSubject = subject ;
    }

    @Override
    public void updateObserveState() {
        System.out.println("The state of subject changed observed by the observer ( " + observerName + " )");
        updatedArticleTitle = (String) observeSubject.getUpdatedState() ;
    }

    public String getArticleTitle() {
        return updatedArticleTitle ;
    }
}
