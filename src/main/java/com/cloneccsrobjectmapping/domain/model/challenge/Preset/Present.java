package com.cloneccsrobjectmapping.domain.model.challenge.Preset;

import java.util.List;
import java.util.UUID;

public class Present {
    String presentNumber = UUID.randomUUID().toString().toLowerCase();
    FruitBucket fruitBucket = new FruitBucket();

    Present() {
    }

    private Present(String presentNumber, FruitBucket fruitBucket) {
        this.presentNumber = presentNumber;
        this.fruitBucket = fruitBucket;
    }

    String presentNumber() {
        return presentNumber;
    }

    List<Fruit> fruitBucket() {
        return fruitBucket.asList();
    }

    public Present withFruit(FruitBucket fruitBucket) {
        return new Present(this.presentNumber, fruitBucket);
    }

    public Present addFruit(Fruit fruit) {
        return withFruit(fruitBucket.addFruits(fruit));
    }

    @Override
    public String toString() {
        return "Present{" + "presentNumber='" + presentNumber + '\'' + ", fruitBucket=" + fruitBucket + '}';
    }
}

