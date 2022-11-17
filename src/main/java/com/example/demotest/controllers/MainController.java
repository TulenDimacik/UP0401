package com.example.demotest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String CalcutorGet(@RequestParam(value="number1",required = false)float number1,
                                @RequestParam(value = "number2",required = false)float number2,
                                @RequestParam(value = "sign",required = false)String sign,
                                Model model){
        model.addAttribute("result",Mathematica(number1,number2,sign));
        return "home";
    }
    @PostMapping("/")
    public String CalcutorPost(@RequestParam(value="number1",required = false)float number1,
                                @RequestParam(value = "number2",required = false)float number2,
                                @RequestParam(value = "sign",required = false)String sign,
                                Model model){
        model.addAttribute("result",Mathematica(number1,number2,sign));
        return "home";
    }
    public float Mathematica(float number1, float number2, String sign )
    {
        float result =0;
        switch (sign){
            case"+":
               result = number1 + number2;
                break;
            case"-":
                result = number1 - number2;
                break;
            case"/":
                result = number1 / number2;
                break;
            case"*":
                result = number1 * number2;
                break;
        }
        return result;
    }

}

