package com.aki.designPattern.creation.builder;

import com.aki.designPattern.creation.builder.builder.inner.Cake;

public class InnerBuilderTest {

    public static void main(String[] args) {

        Cake myCustomChocoCake =
                new Cake.Builder()
                        .cakeName("Choco Cake")
                        .sugar(1.0)
                        .butter(0.5)
                        .milk(1.5)
                        .hasChocolate(true)
                        .build();

        System.out.println(myCustomChocoCake);
    }
}
