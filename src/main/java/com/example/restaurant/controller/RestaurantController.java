package com.example.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantController {

    /*@GetMapping("/")
    public String home(@RequestParam(defaultValue = "World") String name, ModelMap modelMap){
        modelMap.put("name",name);
        return "Pages/home";
    }*/

    /*@GetMapping("/")
    public String commencer(){
        return "Pages/commencer";
    }*/

    @GetMapping("/")
    public String deuxiemeEtape(){
        return "Pages/deuxiemeetape";
    }


}
