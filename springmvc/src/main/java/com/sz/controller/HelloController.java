package com.sz.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController  implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       ModelAndView modelAndView=new ModelAndView();
       modelAndView.addObject("girl","慧慧wqeqw");
       modelAndView.setViewName("girl");
        return modelAndView;
    }

}
