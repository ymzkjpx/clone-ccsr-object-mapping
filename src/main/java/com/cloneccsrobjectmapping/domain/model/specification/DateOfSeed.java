package com.cloneccsrobjectmapping.domain.model.specification;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotNull;

public class DateOfSeed {
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull(message = "NULL are forbidden.")
    LocalDate value;

    @Deprecated
    DateOfSeed() {
    }

    public DateOfSeed(LocalDate value) {
        this.value = value;
    }

    public LocalDate value(){
        return value;
    }

    public DateOfSeed today() {
        return new DateOfSeed(LocalDate.now());
    }

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public String when() {
        return value.format(formatter);
    }

    @Override
    public String toString() {
        return "DateOfSeed{" + "value=" + value + '}';
    }
}
