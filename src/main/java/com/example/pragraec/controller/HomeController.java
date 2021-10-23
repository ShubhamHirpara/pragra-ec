package com.example.pragraec.controller;

import com.example.pragraec.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final CustomerService customerService;

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("title","Welcome To Java");
        model.addAttribute("customer",customerService.getAllCustomer());
        return "index";
    }

}
