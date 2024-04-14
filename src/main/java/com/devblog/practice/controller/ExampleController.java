package com.devblog.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleController {

    @RequestMapping(value = "/example.do", method = RequestMethod.GET)
    public ModelAndView example() {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("example");

        return mv;
    }

//    @RequestMapping(value = "example.do", method = RequestMethod.GET)
//    public String example() {
//
//        return "example";
//    }
}
