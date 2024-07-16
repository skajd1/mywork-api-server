package com.myworkapiserver;


import org.springframework.web.bind.annotation.*;


@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }


}
