package com.javainuse.main;

import org.drools.core.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class SomeRestController {

    private Util util;

    @Autowired
    public SomeRestController(Util util) {
        this.util = util;
    }

    //returns all rules at http://localhost:8080/products
    @RequestMapping("/products")
    public List<String> getAllDiscounts() {
        List<String> l = new ArrayList<>();
        Rule[] rules = util.aPackage.getRules();
        for(Rule s : rules){
            l.add(s.getName());
        }
        return l;
    }

}
