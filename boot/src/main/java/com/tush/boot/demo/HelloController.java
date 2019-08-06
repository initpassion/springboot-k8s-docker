/*
 * @(#) HelloController.java 2019-08-06
 *
 * Copyright 2019 NetEase.com, Inc. All rights reserved.
 */

package com.tush.boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tushenghong01
 * @version 2019-08-06
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String home() {
        return "Hello Docker Program";

    }
}
