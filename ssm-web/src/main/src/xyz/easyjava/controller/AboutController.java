package xyz.easyjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiaojun on 2020/3/30.
 */

@RequestMapping(value = "/about")
@Controller
public class AboutController {

    @RequestMapping(method = RequestMethod.GET)
    public String view(){
        return "about";
    }


    public void test(){
        System.out.println("haha");
    }


}
