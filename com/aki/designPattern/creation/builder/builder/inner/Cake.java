package com.aki.designPattern.creation.builder.builder.inner;

public class Cake {

    private final String cakeName ;
    private final Double sugar ;
    private final Double butter ;
    private final Integer egg ;
    private final Double flour ;
    private final Double milk ;
    private final Boolean hasChocolate ;
    private final Boolean hasStrawBerry ;

    public Cake(Builder builder) {
        this.cakeName = builder.cakeName;
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.egg = builder.egg;
        this.flour = builder.flour;
        this.milk = builder.milk;
        this.hasChocolate = builder.hasChocolate ;
        this.hasStrawBerry = builder.hasStrawBerry ;
    }

    public static class Builder {

        private String cakeName ;
        private Double sugar ;
        private Double butter ;
        private Integer egg ;
        private Double flour ;
        private Double milk ;
        private Boolean hasChocolate ;
        private Boolean hasStrawBerry ;

        public Builder cakeName(String cakeName) {this.cakeName = cakeName; return this;}
        public Builder sugar(Double sugar) {this.sugar = sugar; return this;}
        public Builder butter(Double butter) {this.butter = butter; return this;}
        public Builder egg(Integer egg) {this.egg = egg; return this;}
        public Builder flour(Double flour) {this.flour = flour; return this;}
        public Builder milk(Double milk) {this.milk = milk; return this;}
        public Builder hasChocolate(Boolean hasChocolate) {this.hasChocolate = hasChocolate; return this;}
        public Builder hasStrawBerry(Boolean hasStrawBerry) {this.hasStrawBerry = hasStrawBerry; return this;}

        public Cake build() {
            return new Cake(this) ;
        }
    }

    @Override
    public String toString() {

        return String.format
                ("Cake ->\n[ CakeName = %s ]\n[ Sugar = %s ]\n[ Butter = %s ]\n[ Egg = %d ]\n[ Flour : %s ]\n[ Milk = %s ]\n[ HasChocolate = %b ]\n[ HasStrawBerry = %b ]",
                            cakeName,
                            formatDoubleValue(sugar),
                            formatDoubleValue(butter),
                            egg,
                            formatDoubleValue(flour),
                            formatDoubleValue(milk),
                            hasChocolate,
                            hasStrawBerry
                );
    }

    private String formatDoubleValue(Double value) {
        return value != null ? String.format("%.1f", value) : null ;
    }
}
