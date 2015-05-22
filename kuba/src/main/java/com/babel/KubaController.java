package com.babel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kuba on 21/05/2015.
 */

@Controller
public class KubaController {

    @RequestMapping("/index")
    public String kuba() {
        System.out.println("Kuba Controller fire up");


        return "indexPage";
    }
}
