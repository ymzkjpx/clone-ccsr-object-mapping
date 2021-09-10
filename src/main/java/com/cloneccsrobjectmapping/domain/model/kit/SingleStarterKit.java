package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.specification.DateOfSeed;
import com.cloneccsrobjectmapping.domain.model.variety.Varieties;

public class SingleStarterKit {
    StarterKitNumber starterKitNumber = StarterKitNumber.numbering();
    DateOfSeed dateOfSeed;
    Varieties varieties;

    @Deprecated
    SingleStarterKit(){}

    public SingleStarterKit(StarterKitNumber starterKitNumber, DateOfSeed dateOfSeed) {
        this.starterKitNumber = starterKitNumber;
        this.dateOfSeed = dateOfSeed;
        this.varieties = null;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public DateOfSeed dateOfSeed() {
        return dateOfSeed;
    }

}
