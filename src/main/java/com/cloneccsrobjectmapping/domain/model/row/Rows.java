package com.cloneccsrobjectmapping.domain.model.row;

import com.cloneccsrobjectmapping.domain.model.row.validation.AddRow;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Rows {
    @NotNull(message = "必須")
    @Size(min = 1, message = "少なくとも１列が必要")
    @Size(max = 3 - 1, message = "多くて3列まで", groups = {AddRow.class})
    List<@Valid Row> list = new ArrayList<>();

    public Rows() {
    }

    private Rows(List<Row> list) {
        this.list = list;
    }

    public List<Row> asList() {
        return list;
    }

    public Rows addRow() {
        list.add(new Row());
        return new Rows(new ArrayList<>(list));
    }

    public Rows removeRow(int index) {
        list.remove(index);
        return new Rows(new ArrayList<>(list));
    }

    @Override
    public String toString() {
        return "Rows{" + "list=" + list + '}';
    }
}
