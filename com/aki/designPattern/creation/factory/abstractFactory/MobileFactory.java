package com.aki.designPattern.creation.factory.abstractFactory;

public class MobileFactory implements IMobileFactory{

    public MobileFactory() {}

    /**
     * Creates a specific mobile factory based on the provided mobile type.
     * @param mobileType the type of mobile (e.g., "iphone16", "samsung23")
     *
     * @return an instance of IMobileFactory corresponding to the specified mobile type
     * @throws IllegalArgumentException if the mobile type is unknown
     * @throws NullPointerException if the mobileType is null
     */
    @Override
    public IMobileFactory createMobile(String mobileType) {

        if (mobileType == null) {
            throw new NullPointerException("Mobile type cannot be null");
        }

        return switch (mobileType.toLowerCase()) {
            case "iphone16" -> new IPhone16MobileFactory();
            case "samsung23" -> new SamsungGalaxyS23MobileFactory();
            default -> throw new IllegalArgumentException("Unknown mobile type: " + mobileType);
        };
    }
}
