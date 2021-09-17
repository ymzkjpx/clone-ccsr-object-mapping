package com.cloneccsrobjectmapping.infrastructure.kit;

import com.cloneccsrobjectmapping.application.kit.StarterKitRepository;
import com.cloneccsrobjectmapping.domain.model.kit.KitListSize;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;
import com.cloneccsrobjectmapping.infrastructure.feature.FeatureMapper;
import com.cloneccsrobjectmapping.infrastructure.row.RowMapper;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StarterKitDatasource implements StarterKitRepository {
    StarterKitMapper starterKitMapper;
    RowMapper rowMapper;
    FeatureMapper featureMapper;

    public StarterKitDatasource(StarterKitMapper starterKitMapper, RowMapper rowMapper, FeatureMapper featureMapper) {
        this.starterKitMapper = starterKitMapper;
        this.rowMapper = rowMapper;
        this.featureMapper = featureMapper;
    }

    @Override
    public StarterKitList findStarterKitList() {
        List<StarterKit> list = starterKitMapper.findStarterKitList(new RowBounds(0, KitListSize.MAX_BOUNDS));
        if (list == null) return StarterKitList.empty();
        return StarterKitList.from(list);
    }

    @Override
    @Transactional
    public void register(StarterKit starterKit) {
        System.out.println(starterKit);
        starterKitMapper.register(starterKit);
        rowMapper.registerRows(starterKit.starterKitNumber(), starterKit.specification().rows());
        if (starterKit.specification().hasFeatures()) {
            featureMapper.registerFeature(starterKit.starterKitNumber(), starterKit.specification().features().asList());
        }
    }
}
