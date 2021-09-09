package com.cloneccsrobjectmapping.infrastructure.kit;

import com.cloneccsrobjectmapping.domain.model.kit.SingleStarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StarterKitMapper {
//    List<StarterKit> findAllKits();
    List<SingleStarterKit> findAllSingle();
}
