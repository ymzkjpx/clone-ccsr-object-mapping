package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.row.Rows;
import com.cloneccsrobjectmapping.domain.model.specification.DateOfSeed;

public class SingleStarterKit {
    StarterKitNumber starterKitNumber = StarterKitNumber.numbering();
    DateOfSeed dateOfSeed;
    Rows rows;

    @Deprecated
    SingleStarterKit(){}

    public SingleStarterKit(StarterKitNumber starterKitNumber, DateOfSeed dateOfSeed, Rows rows) {
        this.starterKitNumber = starterKitNumber;
        this.dateOfSeed = dateOfSeed;
        this.rows = rows;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public DateOfSeed dateOfSeed() {
        return dateOfSeed;
    }

}
