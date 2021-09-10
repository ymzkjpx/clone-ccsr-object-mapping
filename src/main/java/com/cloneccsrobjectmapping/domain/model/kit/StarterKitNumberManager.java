package com.cloneccsrobjectmapping.domain.model.kit;

import java.util.UUID;

public class StarterKitNumberManager {
    String format;

    @Deprecated
    StarterKitNumberManager() {
    }

    public StarterKitNumberManager(String format) {
        this.format = format;
    }

    public String nextNumber() {
        String uuid = UUID.randomUUID()
                .toString()
                .toUpperCase();
        String[] elements = uuid.substring(4, 28)
                .split("-");
        return String.format(format, elements[0], elements[1], elements[3], elements[4]);
    }
}
