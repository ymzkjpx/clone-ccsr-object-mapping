package com.cloneccsrobjectmapping.application.kit;

import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;

import org.springframework.stereotype.Service;

@Service
public class StarterKitRegisterService {

    StarterKitRepository starterKitRepository;

    public StarterKitRegisterService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    public void register(StarterKit starterKit){
        starterKitRepository.register(starterKit);
    }

    
}
