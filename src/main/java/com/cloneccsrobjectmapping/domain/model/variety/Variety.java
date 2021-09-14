package com.cloneccsrobjectmapping.domain.model.variety;


import org.springframework.lang.NonNull;

import javax.validation.Valid;

public class Variety {

    @Valid
    VarietyName varietyName;

    @NonNull
    VarietyNumber varietyNumber = VarietyNumber.numbering();

    @Deprecated
    Variety() {
    }

    public Variety(VarietyName varietyName) {
        this.varietyName = varietyName;
    }

    public String show() {
        return String.format("%s [%s]", varietyName.value(), varietyNumber);
    }

    public VarietyName varietyName() {
        return varietyName;
    }

    @NonNull
    public VarietyNumber varietyNumber() {
        return varietyNumber;
    }

    @Override
    public String toString() {
        return "Variety{" + "varietyName=" + varietyName + ", varietyNumber=" + varietyNumber + '}';
    }
}
