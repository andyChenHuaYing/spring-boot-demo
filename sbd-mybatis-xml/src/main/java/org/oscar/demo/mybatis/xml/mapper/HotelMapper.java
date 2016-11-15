package org.oscar.demo.mybatis.xml.mapper;

import org.oscar.demo.mybatis.xml.model.Hotel;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 15/11/16
 * Version: 1.0-SNAPSHOT
 */
public interface HotelMapper {
    Hotel selectByCityId(int city_id);
}
