package com.ani.note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.Map;

@Controller
public class HomeController {

    @Inject
    private String name;

    @RequestMapping("/")
    private String showIndex(Map<String, Object> model) {
        model.put("name", name);
        return "home";
    }
}
