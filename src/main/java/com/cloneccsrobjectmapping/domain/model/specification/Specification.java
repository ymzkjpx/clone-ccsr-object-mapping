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
    CaseType caseType = CaseType.木製;

    @NotNull(message = "NULL are forbidden.")
    Covered covered = Covered.COVERED;

    @NotNull(message = "NULL are forbidden.")
    Features features;

    @Valid
    Rows rows = new Rows();

    @Deprecated
    Specification() {
    }

    public Specification(DateOfSeed dateOfSeed, CaseType caseType, Covered covered, Features features, Rows rows) {
        this.dateOfSeed = dateOfSeed;
        this.caseType = caseType;
        this.covered = covered;
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

    public Features features() {
        return features;
    }

    public Rows rows() {
        return rows;
    }

    public String when() {
        return dateOfSeed().when();
    }

    public List<Row> asList() {
        return rows.asList();
    }

    public Specification withRows(Rows rows) {
        return new Specification(this.dateOfSeed, this.caseType, this.covered, this.features, rows);
    }

    public boolean hasCovered(){
        return covered.isCovered();
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
