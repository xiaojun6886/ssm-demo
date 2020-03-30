package xyz.easyjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaojun on 2020/3/30.
 */
@Controller
@RequestMapping(value = "/article")
public class ArticleController {

    @GetMapping
    public String view(){
        return "article";
    }
}
