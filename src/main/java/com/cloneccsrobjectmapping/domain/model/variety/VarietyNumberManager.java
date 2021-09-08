package com.cloneccsrobjectmapping.domain.model.variety;

import java.util.UUID;

public class VarietyNumberManager {
    String format;

    @Deprecated
    VarietyNumberManager() {}

    public VarietyNumberManager(String format) {
        this.format = format;
    }

    public String nextNumber() {
        String uuid = UUID.randomUUID()
                          .toString()
                          .toUpperCase();
        String[] elements = uuid.substring(4, 28)
                                .split("-");
        String textId = String.join(elements[0], "-", elements[1]);
        return String.format(format, textId);
    }
}
