package com.cloneccsrobjectmapping.domain.variety;

import com.cloneccsrobjectmapping.domain.type.Identify;

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

    static String format = "SP-%s-%s";
    public static VarietyNumber numbering(){
        String result = new Identify(format).generate();
        return new VarietyNumber(result);
    }

    @Override
    public String toString() {
        return "VarietyNumber{" + "value='" + value + '\'' + '}';
    }
}

