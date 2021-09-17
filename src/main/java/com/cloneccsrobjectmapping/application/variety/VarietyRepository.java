package com.cloneccsrobjectmapping.application.variety;

import com.cloneccsrobjectmapping.domain.model.variety.Varieties;

import org.springframework.stereotype.Repository;

@Repository
public interface VarietyRepository {
    Varieties allVarietiesList();
}
