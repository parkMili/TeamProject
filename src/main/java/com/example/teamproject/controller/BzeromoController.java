package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BzeromoController {
    private String[]lunch = {"부대찌개", "마라탕", "햄버거", "짜장면", "짬뽕"};

    @GetMapping("/bzeromo")
    public String getLunch() {
        String ans = "굶어야할듯요";

        return ans;
    }
    
}
