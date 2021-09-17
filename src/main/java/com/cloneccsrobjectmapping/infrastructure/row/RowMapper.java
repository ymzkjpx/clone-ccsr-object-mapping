package com.cloneccsrobjectmapping.infrastructure.row;

import com.cloneccsrobjectmapping.domain.model.kit.StarterKitNumber;
import com.cloneccsrobjectmapping.domain.model.row.Row;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RowMapper {
    void registerRows(@Param("starterKitNumber")StarterKitNumber starterKitNumber, @Param("rowList") List<Row> rowList);
}
