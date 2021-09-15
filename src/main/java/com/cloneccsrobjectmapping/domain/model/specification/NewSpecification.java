package com.cloneccsrobjectmapping.domain.model.specification;

import com.cloneccsrobjectmapping.domain.model.feature.Features;
import com.cloneccsrobjectmapping.domain.model.row.Row;
import com.cloneccsrobjectmapping.domain.model.row.Rows;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class NewSpecification {
    @Valid
    DateOfSeed dateOfSeed = DateOfSeed.today();
    Covered covered = Covered.NON_COVERED;

    @NotNull(message = "必須")
    CaseType type = CaseType.プラスチック製;

    @NotNull
    Features features;
    @Valid
    Rows rows = new Rows();

    private NewSpecification(DateOfSeed dateOfSeed, Covered covered, CaseType type, Features features, Rows rows) {
        this.dateOfSeed = dateOfSeed;
        this.covered = covered;
        this.type = type;
        this.features = features;
        this.rows = rows;
    }

    private NewSpecification() {}

    public CaseType type() {
        return type;
    }

    public Covered covered() {
        return covered;
    }

    public String when() {
        return dateOfSeed.when();
    }

    public boolean hasCover() {
        return covered.isCovered();
    }

    public Features features() {
        return features;
    }

    public boolean hasFeatures() {
        return features.hasFeature();
    }

    public List<Row> rows() {
        return rows.asList();
    }

    public NewSpecification addRow() {
        Rows result = rows.addRow();
        return withRows(result);
    }

    public NewSpecification removeRow(int index) {
        Rows result = rows.removeRow(index);
        return withRows(result);
    }

    private NewSpecification withRows(Rows rows) {
        return new NewSpecification(this.dateOfSeed, this.covered, this.type, this.features, rows);
    }

    @Override
    public String toString() {
        return "Specification{" +
                "dateOfSeed=" + dateOfSeed +
                ", covered=" + covered +
                ", type=" + type +
                ", features=" + features +
                ", rows=" + rows +
                '}';
    }
}
