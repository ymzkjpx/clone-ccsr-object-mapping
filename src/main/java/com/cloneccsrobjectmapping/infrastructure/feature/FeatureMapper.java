package com.cloneccsrobjectmapping.infrastructure.feature;

import com.cloneccsrobjectmapping.domain.model.feature.Feature;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitNumber;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FeatureMapper {
    void registerFeature(@Param("starterKitNumber") StarterKitNumber starterKitNumber, @Param("featureList") List<Feature> featureList);
}
