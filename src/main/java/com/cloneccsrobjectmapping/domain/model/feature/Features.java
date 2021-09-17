package com.cloneccsrobjectmapping.domain.model.feature;

import java.util.ArrayList;
import java.util.List;

public class Features {
    List<Feature> list;

    @Deprecated
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
        List<String> result = new ArrayList<>();
        for (Feature feature : list) {
            result.add(feature.toString());
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return show();
    }
}
