package com.cloneccsrobjectmapping.domain.model.specification;

import com.cloneccsrobjectmapping.domain.model.feature.Features;
import com.cloneccsrobjectmapping.domain.model.row.Rows;

public class Specification {
    DateOfSeed dateOfSeed;
    CaseType caseType;
    Covered covered;
    Features features;
    Rows rows;

    @Deprecated
    Specification(){}

    public Specification(DateOfSeed dateOfSeed, CaseType caseType, Covered covered, Features features, Rows rows) {
        this.dateOfSeed = dateOfSeed;
        this.caseType   = caseType;
        this.covered    = covered;
        this.features   = features;
        this.rows       = rows;
    }

    public DateOfSeed dateOfSeed() {
        return dateOfSeed;
    }

    public CaseType caseType() {
        return caseType;
    }

    public Covered covered() {
        return covered;
    }

    public Features features() {
        return features;
    }

    public Rows rows() {
        return rows;
    }

    @Override
    public String toString() {
        return "Specification{" + "dateOfSeed=" + dateOfSeed + ", caseType=" + caseType + ", covered=" + covered +
               ", features=" + features + ", rows=" + rows + '}';
    }
}
