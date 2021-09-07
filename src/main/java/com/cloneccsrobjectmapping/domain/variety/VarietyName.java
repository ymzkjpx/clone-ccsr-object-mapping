package com.cloneccsrobjectmapping.domain.variety;

public class VarietyName {
    String value;

    @Deprecated
    public VarietyName(){}

    public VarietyName(String value) {
        this.value = value;
    }

    public String value(){
        return value;
    }

    @Override
    public String toString() {
        return "VarietyName{" + "value='" + value + '\'' + '}';
    }
}
