package com.cloneccsrobjectmapping.domain.row;

import com.cloneccsrobjectmapping.domain.variety.Variety;

public class Row {
    Variety variety;
    int numberOfSeed;

    @Deprecated
    Row() {}

    public Row(Variety variety, int numberOfSeed) {
        this.variety      = variety;
        this.numberOfSeed = numberOfSeed;
    }

    public Variety variety() {
        return variety;
    }

    public int numberOfSeed() {
        return numberOfSeed;
    }

    @Override
    public String toString() {
        return "Row{" + "variety=" + variety + ", numberOfSeed=" + numberOfSeed + '}';
    }
}
