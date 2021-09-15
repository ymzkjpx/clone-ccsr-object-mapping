package com.cloneccsrobjectmapping.presentation.web.challenge;

import java.util.Arrays;
import java.util.List;

public class SampleClass {
    String str = "Hello.";
    List<String> list = Arrays.asList("This ","is ","SampleClass. ");
    MyFruits fruits = MyFruits.Apple;

    public enum MyFruits{
        Apple, Orange;
    }

    private SampleClass(){}

    public SampleClass(String str, List<String> list, MyFruits fruits) {
        this.str = str;
        this.list = list;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "str='" + str + '\'' +
                ", list=" + list +
                ", fruits=" + fruits +
                '}';
    }
}
