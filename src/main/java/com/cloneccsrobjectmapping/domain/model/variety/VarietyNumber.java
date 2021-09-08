package com.cloneccsrobjectmapping.domain.model.variety;

public class VarietyNumber {
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
        return "VarietyNumber{" + "value='" + value + '\'' + '}';
    }
}

