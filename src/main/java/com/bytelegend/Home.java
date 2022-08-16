package com.bytelegend;

import bytelegend.pet.Dog();
import bytelegend.pet.Cat();

public class HomeTest {
    @Test
    public void homeHasCatAndDog() {
        Home home = new Home();
        home.cat = new com.bytelegend.pet.Cat();
        home.dog = new com.bytelegend.pet.Dog();
    }
}
