package org.oscar.demo.mybatis.anno.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.oscar.demo.mybatis.anno.config.MyBatis;
import org.oscar.demo.mybatis.anno.exception.ExpectTransactionException;
import org.oscar.demo.mybatis.anno.mapper.CityMapper;
import org.oscar.demo.mybatis.anno.mapper.MapperScannerMapper;
import org.oscar.demo.mybatis.anno.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */
@SuppressWarnings({"unused", "unchecked"})
@SpringBootApplication
@MapperScan(basePackages = "org.oscar.demo.mybatis.anno.mapper", annotationClass = MyBatis.class)
public class Application implements CommandLineRunner {

    private final CityMapper cityMapper;

    private final MapperScannerMapper mapperScannerMapper;

    @Autowired
    public Application(CityMapper cityMapper, MapperScannerMapper mapperScannerMapper) {
        this.cityMapper = cityMapper;
        this.mapperScannerMapper = mapperScannerMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        insertTest();
//        injectTest();

    }

    /**
     * 测试h2database，没有事务管理下，方法遇到异常不会停止
     */
    private void insertTest() {
        try {

            for (int i = 0; i < 10; i++) {

                if (i == 5) {
                    throw new ExpectTransactionException("throw transaction exception by manue");
                }

                City city = new City();
                city.setId((long) i);
                city.setName("name:" + i);
                city.setState("state:" + i);
                city.setCountry("country:" + i);

                this.cityMapper.insert(city);


            }
        } catch (ExpectTransactionException ignored) {
        } finally {
            System.out.println(Arrays.toString(this.cityMapper.findAllCity().toArray(new City[0])));
        }

    }

    private void injectTest() {
        System.out.println(cityMapper.findAllCity());
        System.out.println(cityMapper.findAllCityByState("CA"));
        System.out.println(mapperScannerMapper.findCityByState("CA"));
    }
}