package com.blackcode.spring_boot_auth_mysql.controller;


import com.blackcode.spring_boot_auth_mysql.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHomePage(Model model) {
        return "home";
    }
}
