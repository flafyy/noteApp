package com.ani.note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {

    @RequestMapping("/lo")
    public String log() {
        return "login";
    }
}
