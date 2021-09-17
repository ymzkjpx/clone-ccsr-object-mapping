package com.cloneccsrobjectmapping.domain.model.specification;

import com.cloneccsrobjectmapping.domain.model.feature.Features;
import com.cloneccsrobjectmapping.domain.model.row.Row;
import com.cloneccsrobjectmapping.domain.model.row.Rows;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Specification {
    @Valid
    DateOfSeed dateOfSeed = DateOfSeed.today();

    @NotNull(message = "NULL are forbidden.")
    Covered covered = Covered.NON_COVERED;

    @NotNull(message = "NULL are forbidden.")
    CaseType caseType = CaseType.プラスチック製;

    @NotNull(message = "NULL are forbidden.")
    Features features;

    @Valid
    Rows rows = new Rows();

    private Specification() {
    }

    private Specification(DateOfSeed dateOfSeed, Covered covered, CaseType caseType, Features features, Rows rows) {
        this.dateOfSeed = dateOfSeed;
        this.covered = covered;
        this.caseType = caseType;
        this.features = features;
        this.rows = rows;
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

    public String coveredOfJapaneseName() {
        return covered.japaneseName();
    }

    public Features features() {
        return features;
    }

    public String showFeatures() {
        return features.toString();
    }

    public List<Row> rows() {
        return rows.asList();
    }

    public String when() {
        return dateOfSeed.when();
    }

    private Specification withRows(Rows rows) {
        return new Specification(this.dateOfSeed, this.covered, this.caseType, this.features, rows);
    }

    public boolean hasCovered() {
        return covered.isCovered();
    }

    public boolean hasFeatures() {
        return features.hasFeature();
    }

    public Specification addRow() {
        Rows result = rows.addRow();
        return withRows(result);
    }

    public Specification removeRow(int index) {
        Rows result = rows.removeRow(index);
        return withRows(result);
    }


    @Override
    public String toString() {
        return "Specification{" + "dateOfSeed=" + dateOfSeed + ", caseType=" + caseType + ", covered=" + covered +
                ", features=" + features + ", rows=" + rows + '}';
    }
}
