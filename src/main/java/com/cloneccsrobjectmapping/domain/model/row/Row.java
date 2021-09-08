package com.cloneccsrobjectmapping.domain.model.row;

import com.cloneccsrobjectmapping.domain.model.variety.Variety;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Row {
    @NotNull(message = "Not allowed to be null.")
    Variety variety;

    @Min(value = 1, message = "Between 1~20")
    @Max(value = 20, message = "Between 1~20")
    int seedsPerCell;

    Row() {}

    public Variety variety() {
        return variety;
    }

    public int numberOfSeed() {
        return seedsPerCell;
    }

    public String seedsPerCell() {
        return String.format("%d粒", seedsPerCell);
    }

    @Override
    public String toString() {
        return "Row{" + "variety=" + variety + ", numberOfSeed=" + seedsPerCell + '}';
    }
}
