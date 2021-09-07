package com.cloneccsrobjectmapping.domain.specification;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class DateOfSeed {
    LocalDateTime value;

    @Deprecated
    DateOfSeed(){}

    public DateOfSeed(LocalDateTime value) {
        this.value = value;
    }

    public LocalDateTime value() {
        return value;
    }

    public String show(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy/MM/dd");
        return simpleDateFormat.format(value);
    }

    @Override
    public String toString() {
        return "DateOfSeed{" + "value=" + value + '}';
    }
}
