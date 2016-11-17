package org.oscar.demo.mybatis.java.config.mapper;


import org.apache.ibatis.annotations.Insert;
import org.oscar.demo.mybatis.java.config.model.Hotel;
import org.oscar.demo.mybatis.java.config.springboot.mybatis.Mybatis;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */
@Mybatis
public interface HotelMapper {
    Hotel selectByCityId(int city_id);

    @Insert("insert into hotel values (#{city}, #{name}, #{address}, #{zip})")
    int addHotel(Hotel hotel);

//    @Select("select count(1) from hotel")
    int selectHotelCount();
}
