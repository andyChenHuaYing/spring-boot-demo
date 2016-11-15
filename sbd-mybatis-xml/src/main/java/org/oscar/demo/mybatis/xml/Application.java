package org.oscar.demo.mybatis.xml;

import org.mybatis.spring.annotation.MapperScan;
import org.oscar.demo.mybatis.xml.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */
@SpringBootApplication
@MapperScan(basePackages = "org.oscar.demo.mybatis.xml.mapper")
public class Application implements CommandLineRunner{

    @Autowired
    private HotelMapper hotelMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(this.hotelMapper.selectByCityId(1));
    }
}
