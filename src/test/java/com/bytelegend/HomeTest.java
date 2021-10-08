package com.bytelegend;

import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void homeHasCatAndDog() {
        Home home = new Home();
        home.cat = new Cat();
        home.dog = new Dog();
    }
}
