package com.cloneccsrobjectmapping.domain.model.feature;

import java.util.List;
import java.util.stream.Collectors;

public class Features {
    List<Feature> list;

    @Deprecated
    Features() {
    }

    public Features(List<Feature> list) {
        this.list = list;
    }

    public List<Feature> asList() {
        return list;
    }

    private String show() {
        List<String> result = list.stream().map(v -> v.toString()).collect(Collectors.toList());
        return result.toString();
    }

    @Override
    public String toString() {
        return show();
    }
}
