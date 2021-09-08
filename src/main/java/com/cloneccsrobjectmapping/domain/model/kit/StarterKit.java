package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.model.specification.Specification;

public class StarterKit {
    StarterKitNumber starterKitNumber;
    Specification specification;
    int rowOrder;

    @Deprecated
    StarterKit(){}

    public StarterKit(Specification specification, int rowOrder) {
        this.starterKitNumber = StarterKitNumber.numbering();
        this.specification = specification;
        this.rowOrder      = rowOrder;
    }

    public StarterKitNumber starterKitNumber() {
        return starterKitNumber;
    }

    public Specification specification() {
        return specification;
    }

    public int rowOrder() {
        return rowOrder;
    }


    @Override
    public String toString() {
        return "StarterKit{" + "starterKitNumber=" + starterKitNumber + ", specification=" + specification +
               ", rowOrder=" + rowOrder + '}';
    }
}
