package org.oscar.demo.mybatis.anno.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.oscar.demo.mybatis.anno.config.MyBatis;
import org.oscar.demo.mybatis.anno.model.City;

import java.util.List;

/**
 * Description:
 *      通过Mybatis自带@Mapper注解，并且处于@SpringBootApplication标注的类同级或者子集包中。
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */
@MyBatis
public interface CityMapper {

    @Select("select * from city where state = #{state}")
    City findAllCityByState(@Param("state") String state);

    @Select("select * from city")
    List<City> findAllCity();

    @Insert("insert into city(name, state, country) values (#{name},#{state},#{country})")
    int insert(City city);
}