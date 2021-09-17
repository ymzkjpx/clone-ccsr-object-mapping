package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.specification.Specification;

public class StarterKit {
    StarterKitNumber starterKitNumber = StarterKitNumber.numbering();
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

    public static StarterKit from(Specification other) {
        return new StarterKit(StarterKitNumber.numbering(), other);
    }

    public String when(){
        return specification.when();
    }

    @Override
    public String toString() {
        return "StarterKit{" +
                "starterKitNumber=" + starterKitNumber +
                ", specification=" + specification +
                '}';
    }
}
