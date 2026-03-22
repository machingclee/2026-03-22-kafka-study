package com.machingclee.kafka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerRedirectController {

    @GetMapping("/")
    public String redirectRoot() {
        // Redirect to SpringDoc's swagger-ui with the proper config URL
        return "redirect:/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config";
    }
}

