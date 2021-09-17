package com.cloneccsrobjectmapping.application.kit;

import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;

import org.springframework.stereotype.Service;

@Service
public class StarterKitQueryService {
    StarterKitRepository starterKitRepository;

    public StarterKitQueryService(StarterKitRepository starterKitRepository) {
        this.starterKitRepository = starterKitRepository;
    }

    /**
     * 栽培キット一覧を取得する
     */
    public StarterKitList findStarterKitList() {
        return starterKitRepository.findStarterKitList();
    }
}
