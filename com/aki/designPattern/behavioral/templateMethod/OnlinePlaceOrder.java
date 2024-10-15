package com.aki.designPattern.behavioral.templateMethod;

import com.aki.designPattern.behavioral.templateMethod.exception.AddressInvalidException;

public class OnlinePlaceOrder extends PlaceOrderTemplate{

    private final String address ;

    public OnlinePlaceOrder(String productName, String address) {
        super(productName);
        this.address = address ;

        if(address == null || address.isEmpty()) {
            throw new AddressInvalidException("Please enter a valid address") ;
        }
    }

    @Override
    public void doSelectProduct() {
        System.out.println("Selected the product from shopping site...") ;
    }

    @Override
    public void doPayment() {
        System.out.println("Paying for the product in shopping cart using netBank/card...");
    }

    @Override
    public void doDelivery() {
        System.out.printf("The product %s will deliver to %s.\n\n", super.getProductName(), address);
    }
}
