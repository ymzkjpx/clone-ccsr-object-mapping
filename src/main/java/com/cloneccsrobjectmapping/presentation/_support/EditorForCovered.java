package com.cloneccsrobjectmapping.presentation._support;

import com.cloneccsrobjectmapping.domain.model.specification.Covered;

import java.beans.PropertyEditorSupport;
import java.util.Set;

public class EditorForCovered extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        return getValue().toString();
    }

    @Override
    public void setAsText(String text) {
        setValue(from(text));
    }

    private Covered from(String text) {
        String[] values = text.split(",");
        Set<String> set = Set.of(values);

        if (set.contains("checked")) return Covered.COVERED;
        if (set.contains("unchecked")) return Covered.NON_COVERED;

        throw new IllegalArgumentException("不正な値:" + text);
    }
}
