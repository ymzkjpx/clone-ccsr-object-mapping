package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.specification.DateOfSeed;
import com.cloneccsrobjectmapping.domain.model.variety.Variety;
import com.cloneccsrobjectmapping.domain.model.variety.VarietyName;

public class SingleStarterKit {
    StarterKitNumber starterKitNumber;
    Variety variety;
    DateOfSeed dateOfSeed;
    VarietyName varietyName;

    @Deprecated
    SingleStarterKit(){}

    public SingleStarterKit(StarterKitNumber starterKitNumber, Variety variety, DateOfSeed dateOfSeed, VarietyName varietyName) {
        this.starterKitNumber = starterKitNumber;
        this.variety = variety;
        this.dateOfSeed = dateOfSeed;
        this.varietyName = varietyName;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public Variety variety() {
        return variety;
    }

    public DateOfSeed dateOfSeed() {
        return dateOfSeed;
    }

    public VarietyName varietyName() {
        return varietyName;
    }

    @Override
    public String toString() {
        return "SingleStarterKit{" +
                "starterKitNumber=" + starterKitNumber +
                ", variety=" + variety +
                ", dateOfSeed=" + dateOfSeed +
                ", varietyName=" + varietyName +
                '}';
    }
}
