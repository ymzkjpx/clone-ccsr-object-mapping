package com.cloneccsrobjectmapping.domain.variety;

import java.util.List;

public class Varieties {
    List<Variety> list;

    @Deprecated
    Varieties(){}

    public Varieties(List<Variety> list) {
        this.list = list;
    }

    public List<Variety> asList(){
        return list;
    }
}
