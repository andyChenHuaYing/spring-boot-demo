package org.oscar.demo.mybatis.service;

import org.oscar.demo.mybatis.mapper.HotelMapper;
import org.oscar.demo.mybatis.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 16/11/16
 * Version: 1.0-SNAPSHOT
 */
@Service
public class HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    /**
     * 测试事务是否起作用
     */
    public void addHotel() throws SQLException {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                throw new SQLException("Interrupt sql insert");
            } else {
                this.hotelMapper.addHotel(new Hotel(i, "GeLin,No:" + (i + 1), "YuHuaTai east road, No: " + (i + 1), "400" + (i + 2)));
            }

        }

    }

    public int selectHotelCount() {
        return this.hotelMapper.selectHotelCount();
    }
}
