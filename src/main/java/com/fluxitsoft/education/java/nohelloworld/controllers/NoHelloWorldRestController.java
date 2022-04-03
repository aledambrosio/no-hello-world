package com.fluxitsoft.education.java.nohelloworld.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/")
@ResponseBody
@ResponseStatus
public class NoHelloWorldRestController {

    @Value("${pod-name}")
    private String podName;

    @GetMapping("/no-hello")
    public String get() {
        return String.format("NO hello world! - Pod name %s: ", podName);
    }
}
