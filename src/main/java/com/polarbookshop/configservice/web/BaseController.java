package com.polarbookshop.configservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/ping")
    public String checkhealth() {
        return "PONG";
    }
}
