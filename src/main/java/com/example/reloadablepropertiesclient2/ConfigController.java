package com.example.reloadablepropertiesclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${reload.name}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
