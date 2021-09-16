package com.cloneccsrobjectmapping.domain.model.Preset;

import java.util.ArrayList;
import java.util.List;

public class FruitBucket {
    List<Fruit> list = new ArrayList<>();

    public FruitBucket() {
    }

    private FruitBucket(List<Fruit> list) {
        this.list = list;
    }

    static FruitBucket from(List<Fruit> other) {
        return new FruitBucket(other);
    }

    public List<Fruit> asList() {
        return list;
    }

    public FruitBucket addFruits(Fruit fruit) {
        list.add(fruit);
        return new FruitBucket(list);
    }
}
