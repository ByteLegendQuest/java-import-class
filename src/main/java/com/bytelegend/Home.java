package com.bytelegend;

import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void homeHasCatAndDog() {
        import Cat
        import Dog
        Home home;
        home = new Home();
        home.cat = new com.bytelegend.pet.Cat();
        home.dog = new com.bytelegend.pet.Dog();
    }
}
