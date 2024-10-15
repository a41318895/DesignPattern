package com.aki.designPattern.behavioral.templateMethod;

import com.aki.designPattern.behavioral.templateMethod.exception.NoStockException;

// Super abstract class (Encapsulate common behaviors as abstract methods to make subclasses implementing)
public abstract class PlaceOrderTemplate {

    private final String productName ;
    private static final int MOCK_STOCK_NUMBER = 1 ;

    public PlaceOrderTemplate(String productName) {
        this.productName = productName ;
    }

    public abstract void doSelectProduct() ;

    public final boolean hasStock() {
        return MOCK_STOCK_NUMBER != 0 ;
    }

    public abstract void doPayment() ;

    public abstract void doDelivery() ;

    private boolean isGift ;

    public final void doPack() {
        System.out.println("Packing the Product...");
    }

    public final void processPlaceOrder() {

        doSelectProduct() ;

        if(!hasStock()) throw new NoStockException("The product selected is no stock now...") ;

        doPayment() ;

        if(isGift) doPack() ;

        doDelivery() ;
    }

    public String getProductName() {
        return this.productName ;
    }

    public int getProductAmount() {
        return MOCK_STOCK_NUMBER ;
    }

    public void setIsGift(boolean isGift) {
        this.isGift = isGift ;
    }

    public boolean isGift() {
        return isGift ;
    }
}
