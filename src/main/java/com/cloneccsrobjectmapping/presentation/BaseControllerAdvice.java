package com.cloneccsrobjectmapping.presentation;

import com.cloneccsrobjectmapping.domain.model.specification.Covered;
import com.cloneccsrobjectmapping.presentation._support.EditorForCovered;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice(basePackageClasses = BaseControllerAdvice.class)
public class BaseControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.initDirectFieldAccess();
        binder.setAllowedFields(""); //どのフィールドも許可しない

        binder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
        binder.registerCustomEditor(Covered.class, new EditorForCovered());
    }
}
