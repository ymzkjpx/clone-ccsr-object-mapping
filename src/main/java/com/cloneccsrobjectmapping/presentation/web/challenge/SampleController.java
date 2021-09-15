package com.cloneccsrobjectmapping.presentation.web.challenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class SampleController {

    @GetMapping
    String view(@ModelAttribute("sampleClass")SampleClass sampleClass){
        System.out.println(sampleClass);
        return "sample/test";
    }
}
