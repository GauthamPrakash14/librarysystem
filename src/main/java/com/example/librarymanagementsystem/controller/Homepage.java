package com.example.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homepage {
    @RequestMapping("/home")
    public String home(){
        return "index.html";
    }

    @RequestMapping("/book")
    @ResponseBody
    public String book(){
        return "Here is the list of books";
    }

    @RequestMapping("/users")
    @ResponseBody
    public String users(){
        return "Here are the list of users from the dynamic changes check if new changes are in";
    }
}
