package com.cloneccsrobjectmapping.domain.model.row;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Rows {
    @NotNull @Min(value = 1, message = "Between 1~3")
    @Max(value = 1, message = "Between 1~3")
    List<@Valid Row> list;

    @Deprecated
    Rows() {
    }

    public Rows(List<Row> list) {
        this.list = list;
    }

    public List<Row> asList() {
        return list;
    }

    public Rows addRow() {
        list.add(new Row());
        return new Rows(new ArrayList<>(list));
    }

    public Rows removeRow(int index){
        list.remove(index);
        return new Rows(new ArrayList<>(list));
    }

    private boolean canRemove(int index){

    }

    @Override
    public String toString() {
        return "Rows{" + "list=" + list + '}';
    }
}
