package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.specification.DateOfSeed;

public class SingleStarterKit {
    StarterKitNumber starterKitNumber;
    DateOfSeed dateOfSeed;

    @Deprecated
    SingleStarterKit(){}

    public SingleStarterKit(StarterKitNumber starterKitNumber, DateOfSeed dateOfSeed) {
        this.starterKitNumber = starterKitNumber;
        this.dateOfSeed = dateOfSeed;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public DateOfSeed dateOfSeed() {
        return dateOfSeed;
    }

    @Override
    public String toString() {
        return "SingleStarterKit{" +
                "starterKitNumber=" + starterKitNumber +
                ", dateOfSeed=" + dateOfSeed +
                '}';
    }
}
