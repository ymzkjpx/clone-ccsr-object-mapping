package com.cloneccsrobjectmapping.domain.model.row;

import com.cloneccsrobjectmapping.domain.model.variety.Variety;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

public class Row {
    @NotNull(message = "NULL are forbidden.")
    Variety variety;

    @Range(min = 1, max = 20, message = "The number of Seeds is limited to no more than 20 in a Cell.")
    int seedsPerCell;

    public String varietyNumber() {
        return variety.varietyNumber().value();
    }

    public Variety variety() {
        return variety;
    }

    public int seedsPerCell() {
        return seedsPerCell;
    }

    public String seedsPerCellWithUnit() {
        return seedsPerCell + "粒";
    }

    @Override
    public String toString() {
        return "Row{" + "variety=" + variety + ", numberOfSeed=" + seedsPerCell + '}';
    }
}
