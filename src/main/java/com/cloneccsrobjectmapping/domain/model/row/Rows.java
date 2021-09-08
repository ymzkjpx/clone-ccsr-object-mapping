package com.cloneccsrobjectmapping.domain.model.row;

import java.util.List;

public class Rows {
    List<Row> list;

    @Deprecated
    Rows(){}

    public Rows(List<Row> list) {
        this.list = list;
    }

    public List<Row> asList(){
        return list;
    }

    @Override
    public String toString() {
        return "Rows{" + "list=" + list + '}';
    }
}
