package com.game.indie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(){
        return "home";
    }

    @PostMapping("/")
    public String postHome(){
        return "home";
    }
}
