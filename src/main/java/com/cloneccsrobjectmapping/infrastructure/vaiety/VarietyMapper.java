package com.cloneccsrobjectmapping.infrastructure.vaiety;

import com.cloneccsrobjectmapping.domain.model.variety.Variety;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VarietyMapper {
    List<Variety> allVarietiesList();
}
