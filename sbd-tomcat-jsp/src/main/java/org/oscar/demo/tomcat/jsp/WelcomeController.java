package org.oscar.demo.tomcat.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 14/11/16
 * Version: 1.0-SNAPSHOT
 */
@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello Jsp";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }


    @RequestMapping("/fail")
    public String fail() {
        throw new MyException("Oh dear!");
    }

    /**
     * None RuntimeException
     */
    @RequestMapping("/fail2")
    public String fail2() {
        throw new IllegalStateException();
    }




}
