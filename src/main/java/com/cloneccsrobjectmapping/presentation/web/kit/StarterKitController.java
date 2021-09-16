package com.cloneccsrobjectmapping.presentation.web.kit;

import com.cloneccsrobjectmapping.application.kit.StarterKitQueryService;
import com.cloneccsrobjectmapping.application.kit.StarterKitRegisterService;
import com.cloneccsrobjectmapping.application.variety.VarietyQueryService;
import com.cloneccsrobjectmapping.domain.model.feature.Feature;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKit;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;
import com.cloneccsrobjectmapping.domain.model.row.validation.AddRow;
import com.cloneccsrobjectmapping.domain.model.specification.CaseType;
import com.cloneccsrobjectmapping.domain.model.specification.Specification;
import com.cloneccsrobjectmapping.domain.model.variety.Varieties;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * ハーブ栽培キット管理画面
 */
@Controller("ハーブ栽培キット管理画面")
@RequestMapping("/kit")
public class StarterKitController {
    StarterKitQueryService starterKitQueryService;
    StarterKitRegisterService starterKitRegisterService;
    VarietyQueryService varietyQueryService;

    public StarterKitController(StarterKitQueryService starterKitQueryService, StarterKitRegisterService starterKitRegisterService, VarietyQueryService varietyQueryService) {
        this.starterKitQueryService = starterKitQueryService;
        this.starterKitRegisterService = starterKitRegisterService;
        this.varietyQueryService = varietyQueryService;
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

    @ModelAttribute("allVarieties")
    Varieties allVarieties() {
        return varietyQueryService.allVarieties();
    }

    @GetMapping
    String listAll(@ModelAttribute("specification") Specification specification) {
        return "kit/listAndForm";
    }

    @PostMapping(params = "save")
    String register(@ModelAttribute("specification") @Validated Specification specification, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "kit/listAndForm";
        }
        StarterKit starterKit = StarterKit.from(specification);
        starterKitRegisterService.register(starterKit);
        return "redirect:/kit";
    }

    @PostMapping(params = "addRow")
    String addRow(@ModelAttribute(
            "specification") @Validated(AddRow.class) Specification specification, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "kit/listAndForm";
        Specification result = specification.addRow();
        model.addAttribute("specification", result);
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
