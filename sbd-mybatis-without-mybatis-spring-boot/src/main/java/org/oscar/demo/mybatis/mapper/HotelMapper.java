package org.oscar.demo.mybatis.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.oscar.demo.mybatis.model.Hotel;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */
public interface HotelMapper {
    Hotel selectByCityId(int city_id);

    @Insert("insert into hotel values (#{city}, #{name}, #{address}, #{zip})")
    int addHotel(Hotel hotel);

    @Select("select count(1) from hotel")
    int selectHotelCount();
}
