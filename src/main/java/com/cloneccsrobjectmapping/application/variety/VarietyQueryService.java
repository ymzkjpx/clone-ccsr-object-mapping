package com.cloneccsrobjectmapping.application.variety;

import com.cloneccsrobjectmapping.domain.model.variety.Varieties;

import org.springframework.stereotype.Service;

@Service
public class VarietyQueryService {
    VarietyRepository varietyRepository;

    public VarietyQueryService(VarietyRepository varietyRepository) {
        this.varietyRepository = varietyRepository;
    }

    public Varieties allVarieties(){
        return varietyRepository.allVarietiesList();
    }
}
