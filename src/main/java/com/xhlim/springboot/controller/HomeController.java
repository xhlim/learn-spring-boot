package com.xhlim.springboot.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhlim@outlook.com
 * @create 2018-03-16
 */
@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(String param) {
        String result = "home";
        if (StringUtils.isNotBlank(param)) {
            result += " " + param;
        }
        return result;
    }
}
