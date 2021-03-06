package com.cloneccsrobjectmapping.domain.model.specification;

public enum Covered {
    COVERED("ๆใ"), NON_COVERED("็กใ");

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
