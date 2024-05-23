package dev.agcs.agcsbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgcsController {

    @GetMapping("/auth")
    public String login() {
        return "This is login page.";
    }

    // only redirects when successfull login
    @GetMapping("/")
    public String home() {
        return "This is home page.";
    }

    @GetMapping("/services")
    public String services() {
        return "This is services page.";
    }
}
