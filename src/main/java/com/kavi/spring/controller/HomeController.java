package com.kavi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by eannamal on 1/9/17.
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String login() {
        return "login";
    }
}
