package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.feature.Features;
import com.cloneccsrobjectmapping.domain.model.row.Rows;
import com.cloneccsrobjectmapping.domain.model.specification.Covered;
import com.cloneccsrobjectmapping.domain.model.specification.DateOfSeed;

public class SingleStarterKit {
    StarterKitNumber starterKitNumber = StarterKitNumber.numbering();
    DateOfSeed dateOfSeed;
    Covered covered;
    Rows rows;
    Features features;

    @Deprecated
    SingleStarterKit(){}

    public SingleStarterKit(StarterKitNumber starterKitNumber, DateOfSeed dateOfSeed, Rows rows, Features features) {
        this.starterKitNumber = starterKitNumber;
        this.dateOfSeed = dateOfSeed;
        this.rows = rows;
        this.features = features;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public DateOfSeed dateOfSeed() {
        return dateOfSeed;
    }

}
