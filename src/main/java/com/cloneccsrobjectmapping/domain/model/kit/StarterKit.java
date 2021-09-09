package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.specification.Specification;

public class StarterKit {
    StarterKitNumber starterKitNumber;
    Specification specification;

    @Deprecated
    StarterKit() {
    }

    private StarterKit(StarterKitNumber starterKitNumber, Specification specification) {
        this.starterKitNumber = starterKitNumber;
        this.specification = specification;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public Specification specification() {
        return specification;
    }

    public static StarterKit form(Specification other) {
        return new StarterKit(StarterKitNumber.numbering(), other);
    }

    @Override
    public String toString() {
        return "StarterKit{" +
                "starterKitNumber=" + starterKitNumber +
                ", specification=" + specification +
                '}';
    }
}
