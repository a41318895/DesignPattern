package com.aki.designPattern.behavioral.templateMethod;

public class TemplateMethodTest {

    public static void main(String[] args) {

        PlaceOrderTemplate offlineOrder = new StorePlaceOrder("Computer X123") ;
        offlineOrder.processPlaceOrder();

        // Testing : No Stock (Making constant MOCK_STOCK_NUMBER in PlaceOrderTemplate 0 to test)
        //PlaceOrderTemplate offlineOrderWithNoStock = new StorePlaceOrder("Battery X456") ;
        //offlineOrderWithNoStock.processPlaceOrder() ;

        // Has Address Situation
        PlaceOrderTemplate onlineOrderHasAddress = new OnlinePlaceOrder("Necklace Y456", "Taiwan Taipei ABC Road 112") ;
        onlineOrderHasAddress.processPlaceOrder();

        // No Address Situation
        //PlaceOrderTemplate onlineOrderNoAddress = new OnlinePlaceOrder("Necklace Y789", "") ;
        //onlineOrderNoAddress.processPlaceOrder();

        // Testing : Packing
        PlaceOrderTemplate offlineOrderWithPacking = new StorePlaceOrder("Battery X000") ;
        offlineOrderWithPacking.setIsGift(true) ;
        offlineOrderWithPacking.processPlaceOrder() ;
    }
}
