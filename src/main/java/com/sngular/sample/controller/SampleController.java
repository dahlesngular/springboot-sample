package com.sngular.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/samples")
public class SampleController {

    @GetMapping
    public String ping(){
        return "Ping";
    }
}
