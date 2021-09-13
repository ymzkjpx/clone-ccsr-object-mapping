package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.specification.CaseType;
import com.cloneccsrobjectmapping.domain.model.specification.Covered;
import com.cloneccsrobjectmapping.domain.model.specification.DateOfSeed;

public class SingleStarterKit {
    StarterKitNumber starterKitNumber = StarterKitNumber.numbering();
    DateOfSeed dateOfSeed;
    Covered covered;
    CaseType caseType;

    @Deprecated
    SingleStarterKit(){}

    public SingleStarterKit(StarterKitNumber starterKitNumber, DateOfSeed dateOfSeed, Covered covered, CaseType caseType) {
        this.starterKitNumber = starterKitNumber;
        this.dateOfSeed = dateOfSeed;
        this.covered = covered;
        this.caseType = caseType;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public DateOfSeed dateOfSeed() {
        return dateOfSeed;
    }

}
