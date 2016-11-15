package org.oscar.demo.mybatis.anno.auto.scanner.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.oscar.demo.mybatis.anno.model.City;

/**
 * Description:
 *      通过MapperScan注解扫描自动注册的Mapper
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */
public interface MapperScannerMapper {

    @Select("select * from city where state = #{state}")
    City findCityByState(@Param("state") String state);
}
