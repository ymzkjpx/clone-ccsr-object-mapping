package com.cloneccsrobjectmapping.infrastructure.kit;

import com.cloneccsrobjectmapping.application.kit.StarterKitRepository;
import com.cloneccsrobjectmapping.domain.model.kit.KitListSize;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StarterKitDatasource implements StarterKitRepository {
    StarterKitMapper starterKitMapper;

    public StarterKitDatasource(StarterKitMapper starterKitMapper) {
        this.starterKitMapper = starterKitMapper;
    }

    @Override
    public StarterKitList findStarterKitList(){
        List<StarterKit> list = starterKitMapper.findStarterKitList(new RowBounds(0, KitListSize.MAX_BOUNDS));
        if (list == null) return StarterKitList.empty();
        return StarterKitList.from(list);
    }
}
