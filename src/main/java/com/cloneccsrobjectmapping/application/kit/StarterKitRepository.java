package com.cloneccsrobjectmapping.application.kit;

import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;

import org.springframework.stereotype.Repository;

@Repository
public interface StarterKitRepository {
    StarterKitList findStarterKitList();
    void register(StarterKit starterKit);
}
