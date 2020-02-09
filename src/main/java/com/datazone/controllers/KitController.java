package com.datazone.controllers;

import com.datazone.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.KIT)
public class KitController {

    @GetMapping("")
    public String goKit(){
        return "kit";
    }
}
