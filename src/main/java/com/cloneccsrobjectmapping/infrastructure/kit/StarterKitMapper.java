package com.cloneccsrobjectmapping.infrastructure.kit;

import com.cloneccsrobjectmapping.domain.model.feature.Features;
import com.cloneccsrobjectmapping.domain.model.kit.SingleStarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;
import com.cloneccsrobjectmapping.domain.model.row.Row;
import com.cloneccsrobjectmapping.domain.model.row.Rows;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface StarterKitMapper {
    List<StarterKit> findStarterKitList(RowBounds rowBounds);
    SingleStarterKit test();
    void register(@Param("starterKit") StarterKit starterKit);
}
