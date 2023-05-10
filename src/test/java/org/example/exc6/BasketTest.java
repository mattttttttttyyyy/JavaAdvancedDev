package org.example.exc6;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.Assert.*;
import org.assertj.core.data.Percentage;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.MessageDigest;
import java.util.stream.Stream;

import static org.junit.Assert.*;
public class BasketTest {

    @Test
    public void checkAdditionToBasket(){
        //given
        Basket<String> basket1 = new Basket();
        Basket<Integer> basket2 = new Basket();
        //when
        basket1.addToBasket("Item1");
        basket2.addToBasket(1);
        //then
        assertThat(basket1.getItems().size()).isEqualTo(1);
        assertThat(basket1.getItems().size()).isEqualTo(1);
    }
    @Test
    public void checkAdditionToBasketWhenBasketIsFull(){
        //given
        Basket<String> basket1 = new Basket();
        basket1.addToBasket("Item1");
        basket1.addToBasket("Item2");
        basket1.addToBasket("Item3");
        //when
        //then
        assertThatThrownBy(() -> basket1.addToBasket("Item4")).isInstanceOf(BasketException.class);
    }
    @Test
    public void checkSubtractionFromBasket(){
        //given
        Basket<String> basket1 = new Basket();
        basket1.addToBasket("Item1");
        basket1.addToBasket("Item2");
        //when
        basket1.removeFromBasket("Item1");
        //then
        assertThat(basket1.getItems().size()).isEqualTo(1);
    }



}