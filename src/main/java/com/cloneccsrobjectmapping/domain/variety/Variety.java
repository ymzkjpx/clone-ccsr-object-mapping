package com.cloneccsrobjectmapping.domain.variety;

import lombok.NonNull;

public class Variety {

    @NonNull
    VarietyName varietyName;

    @NonNull
    VarietyNumber varietyNumber = VarietyNumber.numbering();

    public Variety(VarietyName varietyName) {
        this.varietyName   = varietyName;
    }

    public VarietyName varietyName() {
        return varietyName;
    }

    public VarietyNumber varietyNumber() {
        return varietyNumber;
    }

    @Override
    public String toString() {
        return "Variety{" + "varietyName=" + varietyName + ", varietyNumber=" + varietyNumber + '}';
    }
}
