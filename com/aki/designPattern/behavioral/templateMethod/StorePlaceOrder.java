package com.aki.designPattern.behavioral.templateMethod;

public class StorePlaceOrder extends PlaceOrderTemplate{

    public StorePlaceOrder(String productName) {
        super(productName);
    }

    @Override
    public void doSelectProduct() {
        System.out.println("Selected the product from selves...");
    }

    @Override
    public void doPayment() {
        System.out.println("Paying for the product at counter using cash/card...");
    }

    @Override
    public void doDelivery() {
        System.out.printf("The product %s will get at counter after a minute.\n\n", super.getProductName());
    }
}
