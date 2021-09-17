package com.cloneccsrobjectmapping.domain.model.specification;

public enum Covered {
    COVERED("有り"), NON_COVERED("無し");

    private String japaneseName;

    Covered(String japaneseName) {
        this.japaneseName = japaneseName;
    }

    public String japaneseName() {
        return japaneseName;
    }

    public boolean isCovered() {
        return this.equals(COVERED);
    }
}
