package com.cloneccsrobjectmapping.application.kit;

import com.cloneccsrobjectmapping.domain.model.kit.SingleStarterKiList;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;

import org.springframework.stereotype.Service;

@Service
public class StarterKitQueryService {
    StarterKitRepository starterKitRepository;

    public StarterKitQueryService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    public StarterKitList findAll(){
        return starterKitRepository.findAll();
    }

    public SingleStarterKiList findAllSingle(){
        return starterKitRepository.findAllSingle();
    }
}
