package com.cloneccsrobjectmapping.domain.model.kit;

import java.util.Collections;
import java.util.List;

public class StarterKitList {
    List<StarterKit> list;

    @Deprecated
    StarterKitList(){}

    private StarterKitList(List<StarterKit> list) {
        this.list = list;
    }

    public List<StarterKit> asList(){
        return list;
    }

    public static StarterKitList from(List<StarterKit> list){
        return new StarterKitList(list);
    }

    public static StarterKitList empty(){
        return new StarterKitList(Collections.emptyList());
    }

    @Override
    public String toString() {
        return "StarterKitList{" +
                "list=" + list +
                '}';
    }
}
