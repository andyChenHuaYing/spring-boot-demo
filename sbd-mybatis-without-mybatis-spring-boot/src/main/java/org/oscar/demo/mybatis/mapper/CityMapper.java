package org.oscar.demo.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.oscar.demo.mybatis.model.City;

/**
 * Description:
 * 通过Mybatis自带@Mapper注解，并且处于@SpringBootApplication标注的类同级或者子集包中。
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */
public interface CityMapper {

    @Select("select * from city where state = #{state}")
    City findCityByState(@Param("state") String state);
}