package com.cloneccsrobjectmapping.presentation;

import com.cloneccsrobjectmapping.domain.model.specification.NewSpecification;
import com.cloneccsrobjectmapping.domain.model.specification.Specification;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TopController {

    @GetMapping
    String top(){
        return "redirect:/kit";
    }
}
