package org.launchcode.icecream.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="")
public class appController {

    @RequestMapping(value="/logout")
    public String logout() {
        return "/logout";

    }
}
