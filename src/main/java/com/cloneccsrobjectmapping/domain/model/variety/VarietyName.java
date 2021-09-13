package com.cloneccsrobjectmapping.domain.model.variety;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class VarietyName {
    @NotEmpty(message = "NULL are forbidden.")
    @Length(min = 1, max = 20, message = "Tolerance is between 1~20.")
    String value;

    @Deprecated
    public VarietyName() {
    }

    public VarietyName(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
