package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.specification.DateOfSeed;
import com.cloneccsrobjectmapping.domain.model.variety.Varieties;

public class SingleStarterKit {
    StarterKitNumber starterKitNumber = StarterKitNumber.numbering();
    DateOfSeed dateOfSeed;
    Varieties varieties;

    @Deprecated
    SingleStarterKit(){}

    public SingleStarterKit(StarterKitNumber starterKitNumber, DateOfSeed dateOfSeed, Varieties varieties) {
        this.starterKitNumber = starterKitNumber;
        this.dateOfSeed = dateOfSeed;
        this.varieties = varieties;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public DateOfSeed dateOfSeed() {
        return dateOfSeed;
    }

    public Varieties variety() {
        return varieties;
    }

    @Override
    public String toString() {
        return "SingleStarterKit{" +
                "starterKitNumber=" + starterKitNumber +
                ", dateOfSeed=" + dateOfSeed +
                ", variety=" + varieties +
                '}';
    }
}
