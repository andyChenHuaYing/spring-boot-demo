package org.oscar.demo.mybatis.java.config;

import org.mybatis.spring.annotation.MapperScan;
import org.oscar.demo.mybatis.java.config.service.HotelService;
import org.oscar.demo.mybatis.java.config.springboot.mybatis.Mybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 16/11/16
 * Version: 1.0-SNAPSHOT
 */
@SpringBootApplication
@MapperScan(basePackages = {"org.oscar.demo.mybatis.java.config"}, annotationClass = Mybatis.class)
@EnableTransactionManagement
public class Application implements CommandLineRunner {

    // 其中 dataSource 框架会自动为我们注入

    @Autowired
    private PlatformTransactionManager platformTransactionManager;

    @Autowired
    private HotelService hotelService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        try {
            hotelService.testTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("===========>> " + hotelService.selectHotelCount());
        System.out.println("===========>> " + platformTransactionManager.getClass().getName());
    }
}
