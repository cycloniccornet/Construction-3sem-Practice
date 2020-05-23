package com.example.eksamens.velser.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/javascript")
    public String Javascript() {
        return "javascript";
    }

    @GetMapping("/Ajax")
    public String Ajax() {
        return "ajax";
    }

    @GetMapping("/Jquery")
    public String JQUERY() {
        return "jquery";
    }

    @GetMapping("/Html5Formv")
    public String Html5FormValidation() {
        return "html5formv";
    }


}
