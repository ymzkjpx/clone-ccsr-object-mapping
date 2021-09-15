package com.cloneccsrobjectmapping.domain.model.row;

import com.cloneccsrobjectmapping.domain.model.variety.Variety;

import javax.validation.constraints.NotNull;

public class Row {
    @NotNull(message = "NULL are forbidden.")
    Variety variety;

    //    @Range(min = 1, max = 20, message = "Tolerance is between 1~20.")
    int seedsPerCell;

    public String varietyNumber(){
        return variety.varietyNumber().value();
    }

    public String variety() {
        return variety.show();
    }

    public String seedsPerCell() {
        return String.format("%d粒", seedsPerCell);
    }

    @Override
    public String toString() {
        return "Row{" + "variety=" + variety + ", numberOfSeed=" + seedsPerCell + '}';
    }
}
