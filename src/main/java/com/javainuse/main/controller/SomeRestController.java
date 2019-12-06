package com.javainuse.main.controller;

import com.javainuse.main.Util;
import com.javainuse.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class SomeRestController {

    private Util util;

    @Autowired
    public SomeRestController(Util util) {
        this.util = util;
    }

    @RequestMapping("/product")
    public Product getDiscount(@RequestBody Product partialProduct) {
        return util.execute(partialProduct);
    }

}
