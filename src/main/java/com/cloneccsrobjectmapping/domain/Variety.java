package com.cloneccsrobjectmapping.domain;

import lombok.NonNull;

public class Variety {

    @NonNull
    VarietyName varietyName;

    @NonNull
    VarietyNumber varietyNumber = VarietyNumber.generate();

    public Variety(VarietyName varietyName, VarietyIdentifier varietyIdentifier) {
        this.varietyName   = varietyName;
        this.varietyNumber = varietyIdentifier;
    }

    public VarietyName varietyName() {
        return varietyName;
    }

    public VarietyIdentifier varietyIdentifier() {
        return varietyNumber;
    }

    @Override
    public String toString() {
        return "Variety{" + "varietyName=" + varietyName + ", varietyNumber=" + varietyNumber + '}';
    }
}
