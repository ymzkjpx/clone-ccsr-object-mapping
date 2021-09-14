package com.cloneccsrobjectmapping.domain.model.variety;

import java.util.Collections;
import java.util.List;

public class Varieties {
    List<Variety> list;

    @Deprecated
    Varieties(){}

    public Varieties(List<Variety> list) {
        this.list = list;
    }

    public static Varieties from(List<Variety> other){
        return new Varieties(other);
    }

    public static Varieties empty(){
        return new Varieties(Collections.emptyList());
    }

    public List<Variety> asList(){
        return list;
    }
}
