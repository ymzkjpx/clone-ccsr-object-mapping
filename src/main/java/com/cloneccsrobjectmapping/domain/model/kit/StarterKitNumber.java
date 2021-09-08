package com.cloneccsrobjectmapping.domain.model.kit;

import com.cloneccsrobjectmapping.domain.type.Identify;

import javax.validation.constraints.Pattern;

public class StarterKitNumber {

    @Pattern(regexp = "^KIT-[A-Z0-9]{4,}-[A-Z0-9]{4,}")
    String value;
    
    @Deprecated
    StarterKitNumber(){}

    public StarterKitNumber(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
    
    static String format = "KIT-%s-%s";
    public static StarterKitNumber numbering(){
        String uuid = new StarterKitNumberManager(format).nextNumber();
        return new StarterKitNumber(uuid);
    }

    @Override
    public String toString() {
        return "StarterKitNumber{" + "value='" + value + '\'' + '}';
    }
}
