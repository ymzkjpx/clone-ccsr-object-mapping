package com.cloneccsrobjectmapping.domain.model.variety;

import javax.validation.constraints.Pattern;

public class VarietyNumber {
    @Pattern(regexp = "^VA-[A-Z0-9]{4,}", message = "Invalid Identifier")
    String value;

    @Deprecated
    VarietyNumber(){}

    public VarietyNumber(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    static String format = "VA-%s";
    public static VarietyNumber numbering(){
        String result = new VarietyNumberManager(format).nextNumber();
        return new VarietyNumber(result);
    }

    @Override
    public String toString() {
        return value;
    }
}

