package com.data.demo01_spring_mvc.controller;

import com.data.demo01_spring_mvc.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/numbers")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping
    public ModelAndView getAll() {
        //ModelAndView, ModelView, Model
        ModelAndView modelAndView = new ModelAndView("number");

        int total = numberService.getTotal(4, 7);
        modelAndView.addObject("total", total);

        return modelAndView;
    }
}
