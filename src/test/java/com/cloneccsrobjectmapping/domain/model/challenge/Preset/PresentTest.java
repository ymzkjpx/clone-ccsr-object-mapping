package com.cloneccsrobjectmapping.domain.model.challenge.Preset;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class PresentTest {
    @Test
    void test() {
        test1();
    }

    void test1() {
        Present present = new Present();
        display(present);
        Present present1 = present.addFruit(Fruit.ORANGE);
        display(present1);
    }

    void display(Object obj) {
        System.out.println("-----------------------------" + LocalDateTime.now().toString());
        System.out.println(obj);
    }
}