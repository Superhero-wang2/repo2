package com.sz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ByeController {
    @RequestMapping("/bye")
    public String bye(Model model){
        model.addAttribute("model","哈哈1");
        return "bye";
    }
}
