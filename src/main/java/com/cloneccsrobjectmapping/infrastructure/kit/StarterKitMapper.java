package com.cloneccsrobjectmapping.infrastructure.kit;

import com.cloneccsrobjectmapping.domain.model.kit.SingleStarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface StarterKitMapper {
    List<StarterKit> findStarterKitList(RowBounds rowBounds);
    SingleStarterKit test();
    void register(StarterKit starterKit);
}
