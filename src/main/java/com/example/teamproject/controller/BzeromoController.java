package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BzeromoController {
    private int num;
    private String[]lunch = {"부대찌개", "마라탕", "햄버거", "짜장면", "짬뽕"};

    @GetMapping("/bzeromo")
    public @ResponseBody String getLunch() {
        String ans = "굶어야할듯요";
        num = (int)(Math.random() * 100);

        if(num < 5 && num >=0)
            ans = lunch[num];

        return ans;
    }
    
}
