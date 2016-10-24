package com.ani.note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LogController {

    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String log(Map<String, Object> model, @RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            model.put("error", "Не правильный логин и пароль попробуйте еще раз");
        }
        return "login";
    }
}
