package com.cloneccsrobjectmapping.domain.model.feature;

import java.util.List;

public class Features {
    List<Feature> list;

    @Deprecated
    Features(){}

    public Features(List<Feature> list) {
        this.list = list;
    }

    public List<Feature> asList(){
        return list;
    }

    @Override
    public String toString() {
        return "Features{" +
                "list=" + list +
                '}';
    }
}
