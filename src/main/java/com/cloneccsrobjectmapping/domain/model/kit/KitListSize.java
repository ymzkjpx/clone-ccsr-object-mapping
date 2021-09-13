package com.cloneccsrobjectmapping.domain.model.kit;

public class KitListSize {
    int value;

    @Deprecated
    KitListSize() {
    }

    public KitListSize(int value) {
        this.value = value;
    }

    public static int MAX_BOUNDS = 20;

    public String show() {
        if (value >= MAX_BOUNDS) return MAX_BOUNDS + "セット以上";
        return value + "セット";
    }
}
