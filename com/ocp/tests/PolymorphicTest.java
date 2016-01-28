package com.ocp.tests;

import com.ocp.polymorphism.Apple;
import com.ocp.polymorphism.Food;
import com.ocp.polymorphism.Tuna;
import org.junit.Test;

/**
 * Created by Alejandro on 1/24/2016.
 */
public class PolymorphicTest {
    @Test
    public void testPolymorphic(){
        Food food = new Food();
        food.eat();
        food = new Apple();
        food.eat();
        food = new Tuna();
        food.eat();
        Tuna tuna = new Tuna();
        tuna.eat();
    }
}
