package com.sz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("skill")
   public String Test(Model model){
        model.addAttribute("skill","王士振");
        return  "test";
    }
@RequestMapping("skill2")
    public String Test2(Model model){
        model.addAttribute("skill",55);
        return "redirect:/jsp/test2.jsp?skill=55";
}

}
