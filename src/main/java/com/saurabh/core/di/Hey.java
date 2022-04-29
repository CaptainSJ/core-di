package com.saurabh.core.di;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hey {

    @RequestMapping("/hey")
    public String hey() {
        return "Hey there!!";
    }
}
