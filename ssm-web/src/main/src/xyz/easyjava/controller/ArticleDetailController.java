package xyz.easyjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiaojun on 2020/3/30.
 */

@Controller
@RequestMapping(value = "/article/detail")
public class ArticleDetailController {

    @RequestMapping(method = RequestMethod.GET)
    public String view(){
        return "article_detail";
    }

}
