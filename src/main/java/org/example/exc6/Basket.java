package org.example.exc6;
/*
Create a class named Basket, which simulates a basket and stores the current number
of elements of type T (generic type) in the basket. Add a method named addToBasket()
that adds an element to the basket (increasing the current state by 1) and a method
named removeFromBasket() that removes an element from the basket (decreasing the current state by 1).

        The basket can hold from 0 to 10 elements. In case the user tries to remove
        an element when the state is 0 or add an element when the state is 10,
        throw the appropriate runtime exception (BasketFullException or BasketEmptyException).*/

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Integer> itemsInBasket = new ArrayList<>();
    private final int basketCapacity = 10;



    public void addToBasket(int item){
        if (itemsInBasket.size() == basketCapacity){
            throw new IllegalStateException("Basket full");
        } else itemsInBasket.add(item);
    }

    public void removeFromBasket(){
        try {
            itemsInBasket.remove(itemsInBasket.size()-1);
        } catch (Exception e) {
            System.out.println("BasketEmptyException");;
        }

    }
}
