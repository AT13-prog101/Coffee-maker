package org.fundacionjala.prog101CoffeeMaker.coffeeMaker;

public class DeliveryPipe {
    private boolean deliveryWarmWater;

    /**
     * Description: this method get the state of the delivery pipe
     *
     * @return
     */
    public boolean getDeliveryWarmWater() {
        return deliveryWarmWater;
    }

    /**
     * Description: this method change the state of the delivery pipe
     * @return
     */
    public void setDeliveryWarmWater(final boolean deliveryWarmWater1) {
        this.deliveryWarmWater = deliveryWarmWater1;
    }
}
