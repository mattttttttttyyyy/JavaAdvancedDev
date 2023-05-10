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

public class Basket<T> {
    private T item;
    private final int SIZE = 3;
    private List<T> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addToBasket(T item) {
        if (checkEmptySpacesInBasket(item)) items.add(item);
        else throw new BasketException("Basket is full!");
    }

    public void removeFromBasket(T item) {
        if (checkEmptySpacesInBasket(item)) items.remove(item);
        else throw new BasketException("Basket is empty!");
    }

    private boolean checkEmptySpacesInBasket(T item) {
        return items.size() < SIZE;
    }

    public List<T> getItems() {
        return items;
    }
}

class BasketException extends RuntimeException {
    public BasketException(String str) {
        super(str);
    }
}