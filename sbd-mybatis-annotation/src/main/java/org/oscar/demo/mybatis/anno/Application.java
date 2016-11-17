package org.oscar.demo.mybatis.anno;

import org.mybatis.spring.annotation.MapperScan;
import org.oscar.demo.mybatis.anno.auto.scanner.mapper.MapperScannerMapper;
import org.oscar.demo.mybatis.anno.mapper.CityMapper;
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
@MapperScan(basePackages = "org.oscar.demo.mybatis.anno.auto.scanner.mapper")
@SpringBootApplication
public class Application implements CommandLineRunner{

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
        System.out.println(cityMapper.findCityByState("CA"));
        System.out.println(mapperScannerMapper.findCityByState("CA"));
    }
}