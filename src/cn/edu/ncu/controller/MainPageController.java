package cn.edu.ncu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainPageController {

    @RequestMapping("/index")
    public String jump(){
        return "index";
    }


}
