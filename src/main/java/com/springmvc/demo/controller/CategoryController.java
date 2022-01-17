package com.springmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "categories")
//http:localhost:8080/categories
public class CategoryController {
    //return name of "jsp file"
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCategories (ModelMap modelMap) {
        //data sent to jsp => ModelMap
        //send data from Controller to View
        modelMap.addAttribute("name", "Hoang");
        modelMap.addAttribute("age", 20);
        System.out.println("haha");
        return "category";
    }
}
