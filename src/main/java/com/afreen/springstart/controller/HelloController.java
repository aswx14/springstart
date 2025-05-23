package com.afreen.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HelloController {
    @GetMapping(value = "/")
    public String hello(Model model) {
        model.addAttribute("name", "World");
        return "greeting";}
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name",required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
