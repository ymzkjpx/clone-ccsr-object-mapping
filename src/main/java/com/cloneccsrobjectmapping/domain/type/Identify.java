package com.cloneccsrobjectmapping.domain.type;

import java.util.Locale;
import java.util.UUID;

public class Identify {
    String format;

    @Deprecated
    Identify(){}

    public Identify(String format) {
        this.format = format;
    }

    public String generate(){
        String source = UUID.randomUUID().toString().toUpperCase();
        String[] elements = source.substring(4,28).split("-");
        return String.format(format, elements);
    }
}
