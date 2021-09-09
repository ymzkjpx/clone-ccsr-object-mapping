package com.cloneccsrobjectmapping.domain.model.kit;

import java.util.Collections;
import java.util.List;

public class SingleStarterKiList {
    List<SingleStarterKit> list;

    @Deprecated
    SingleStarterKiList(){}

    public SingleStarterKiList(List<SingleStarterKit> list) {
        this.list = list;
    }

    public static SingleStarterKiList from(List<SingleStarterKit> list){
        return new SingleStarterKiList(list);
    }

    public List<SingleStarterKit> asList(){
        return list;
    }

    public static SingleStarterKiList empty(){
        return new SingleStarterKiList(Collections.emptyList());
    }
}
