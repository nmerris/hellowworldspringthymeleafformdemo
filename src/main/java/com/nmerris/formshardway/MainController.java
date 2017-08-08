package com.nmerris.formshardway;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/loadform")
    public String loadFormPage() {
        return "formtemplate";
    }


    @RequestMapping("/processform")
    public String loadFromThePage(@RequestParam("login") String loginCallbackVar, Model model) {
        model.addAttribute("loginval", loginCallbackVar);
        return "confirm";
    }

}
