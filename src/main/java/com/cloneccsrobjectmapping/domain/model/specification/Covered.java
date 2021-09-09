package com.cloneccsrobjectmapping.domain.model.specification;

public enum Covered {
    WITH
    ,WITHOUT;

    public boolean isCovered(){
        return this.equals(WITH);
    }
}
