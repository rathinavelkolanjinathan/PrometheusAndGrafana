package com.micrometer.api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrometheusController {
    @GetMapping("/message")
    public String getMessage() {
        return "Working...!!";
    }
}
