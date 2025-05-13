package com.data.demo01_spring_mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {

//    @RequestMapping(value = "products", method = RequestMethod.GET)
    @GetMapping("/findAll")
    public ModelAndView getAll() {
        //ModelAndView, ModelView, Model
        ModelAndView modelAndView = new ModelAndView("product");
        modelAndView.addObject("data","KS23B");
        return modelAndView;
    }
}
