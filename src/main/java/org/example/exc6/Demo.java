package org.example.exc6;

public class Demo {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.removeFromBasket();
        for (int i = 0; i < 15; i++) {
            basket.addToBasket(5);
        }


    }
}
