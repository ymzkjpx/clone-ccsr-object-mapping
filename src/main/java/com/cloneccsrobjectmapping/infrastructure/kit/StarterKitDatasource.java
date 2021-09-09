package com.cloneccsrobjectmapping.infrastructure.kit;

import com.cloneccsrobjectmapping.application.kit.StarterKitRepository;
import com.cloneccsrobjectmapping.domain.model.kit.SingleStarterKiList;
import com.cloneccsrobjectmapping.domain.model.kit.SingleStarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StarterKitDatasource implements StarterKitRepository {
    StarterKitMapper starterKitMapper;

    public StarterKitDatasource(StarterKitMapper starterKitMapper) {
        this.starterKitMapper = starterKitMapper;
    }

    public StarterKitList findAll(){
        return null;
    }

    @Override
    public SingleStarterKiList findAllSingle() {
        List<SingleStarterKit> result = starterKitMapper.findAllSingle();
        return SingleStarterKiList.from(result);
    }
}
