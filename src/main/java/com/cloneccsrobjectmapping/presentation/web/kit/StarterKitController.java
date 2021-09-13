package com.cloneccsrobjectmapping.presentation.web.kit;

import com.cloneccsrobjectmapping.application.kit.StarterKitQueryService;
import com.cloneccsrobjectmapping.domain.model.kit.StarterKitList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    String listAll(Model model){
        StarterKitList kitList = starterKitQueryService.findStarterKitList();
        model.addAttribute("kitList", kitList);
        return "kit/listAndForm";
    }

}
