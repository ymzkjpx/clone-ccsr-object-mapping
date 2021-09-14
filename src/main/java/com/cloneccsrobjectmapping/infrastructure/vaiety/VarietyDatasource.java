package com.cloneccsrobjectmapping.infrastructure.vaiety;

import com.cloneccsrobjectmapping.application.variety.VarietyRepository;
import com.cloneccsrobjectmapping.domain.model.variety.Varieties;
import com.cloneccsrobjectmapping.domain.model.variety.Variety;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class VarietyDatasource implements VarietyRepository {
    VarietyMapper varietyMapper;

    public VarietyDatasource(VarietyMapper varietyMapper) {
        this.varietyMapper = varietyMapper;
    }

    @Override
    public Varieties allVarietiesList(){
        List<Variety> result = varietyMapper.allVarietiesList();
        if(Objects.isNull(result)) return Varieties.empty();
        return Varieties.from(result);
    }

}
