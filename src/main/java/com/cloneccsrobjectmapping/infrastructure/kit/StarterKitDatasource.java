package com.cloneccsrobjectmapping.infrastructure.kit;

import com.cloneccsrobjectmapping.application.kit.StarterKitRepository;
import com.cloneccsrobjectmapping.domain.model.kit.SingleStarterKit;
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
        SingleStarterKit singleStarterKit = starterKitMapper.test();
        System.out.println(singleStarterKit);
        List<StarterKit> list = starterKitMapper.findStarterKitList(new RowBounds(0,1));
        if (list == null) return StarterKitList.empty();
        return StarterKitList.from(list);
    }
}
