package com.cloneccsrobjectmapping.presentation.api.kit;

import com.cloneccsrobjectmapping.application.kit.StarterKitQueryService;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kit")
public class StarterKitApiController {

    StarterKitQueryService starterKitQueryService;

    public StarterKitApiController(StarterKitQueryService starterKitQueryService) {
        this.starterKitQueryService = starterKitQueryService;
    }

    @RequestMapping(value = "/kitList", method = RequestMethod.GET)
    StarterKitList allKitList(){
        return starterKitQueryService.findStarterKitList();
    }
}
