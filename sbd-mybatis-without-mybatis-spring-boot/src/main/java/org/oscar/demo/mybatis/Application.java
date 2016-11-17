package org.oscar.demo.mybatis;

import org.oscar.demo.mybatis.service.CityService;
import org.oscar.demo.mybatis.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private CityService cityService;

    @Autowired
    private HotelService hotelService;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) {
        System.out.println(cityService.findCityByState("CA"));
        testTransaction();
    }

    private void testTransaction() {
        try {
            this.hotelService.addHotel();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            System.out.println("======>>" + this.hotelService.selectHotelCount());
        }
    }


}
