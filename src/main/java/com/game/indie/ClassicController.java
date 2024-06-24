package com.game.indie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassicController {
    @GetMapping("/classic")
    @RequestMapping(value="/classic")
    public String getClassicMode(){
        return "classic";
    }
}
