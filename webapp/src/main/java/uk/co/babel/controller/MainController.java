package uk.co.babel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Kuba on 21/05/2015.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String mainPage(){
        System.out.println("mainPage");

        return "mainPage";
    }

}
