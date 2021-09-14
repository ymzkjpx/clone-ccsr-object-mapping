package com.cloneccsrobjectmapping.presentation.web.kit;

import com.cloneccsrobjectmapping.application.kit.StarterKitQueryService;
import com.cloneccsrobjectmapping.domain.model.feature.Feature;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;
import com.cloneccsrobjectmapping.domain.model.specification.CaseType;
import com.cloneccsrobjectmapping.domain.model.specification.Specification;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ハーブ栽培キット管理画面
 */
@Controller("ハーブ栽培キット管理画面")
@RequestMapping("/kit")
public class StarterKitController {
    StarterKitQueryService starterKitQueryService;

    public StarterKitController(StarterKitQueryService starterKitQueryService) {
        this.starterKitQueryService = starterKitQueryService;
    }

    @ModelAttribute("starterKitList")
    StarterKitList startKitList() {
        return starterKitQueryService.findStarterKitList();
    }

    @ModelAttribute("allFeatures")
    Feature[] allFeatures() {
        return Feature.values();
    }

    @ModelAttribute("allCaseTypes")
    CaseType[] allCaseTypes() {
        return CaseType.values();
    }

    @GetMapping
    String listAll(@ModelAttribute("specification") Specification specification, Model model){
        model.addAttribute("specification", specification);
        return "kit/listAndForm";
    }

    @InitBinder
    void initBinder(WebDataBinder binder) {
        binder.setAllowedFields(
                "dateOfSeed.value",
                "covered",
                "type",
                "features.list",
                "rows.list*"
        );
    }
}
