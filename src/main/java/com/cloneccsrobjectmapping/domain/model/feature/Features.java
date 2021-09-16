package com.cloneccsrobjectmapping.domain.model.feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Features {
    List<Feature> list;

    public Features() {
    }

    private Features(List<Feature> list) {
        this.list = list;
    }

    public List<Feature> asList() {
        return list;
    }

    public static Features from(List<Feature> other){
        return new Features(other);
    }

    public boolean hasFeature(){
        return (list.size() > 0);
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
