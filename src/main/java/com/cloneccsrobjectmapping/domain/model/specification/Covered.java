package com.cloneccsrobjectmapping.domain.model.specification;

public enum Covered {
    COVERED
    ,NON_COVERED;

    public boolean isCovered(){
        return this.equals(COVERED);
    }
}
