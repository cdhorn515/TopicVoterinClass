package com.cdhorn.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopicController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }
}