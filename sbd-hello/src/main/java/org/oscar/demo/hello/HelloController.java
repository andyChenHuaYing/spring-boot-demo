package org.oscar.demo.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: oscar
 * Create Date: 14/11/16
 * Description: HelloController
 * Version: 1.0-SNAPSHOT
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello/{username}")
    public String hello(@PathVariable("username") String username){
        return "Hello, " + username;
    }
}
