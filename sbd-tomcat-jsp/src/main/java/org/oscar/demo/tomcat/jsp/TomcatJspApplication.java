package org.oscar.demo.tomcat.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 14/11/16
 * Version: 1.0-SNAPSHOT
 */

@SpringBootApplication
public class TomcatJspApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(builder);
    }

    public static void main(String[] args) {
        SpringApplication.run(TomcatJspApplication.class, args);
    }
}
