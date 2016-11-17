package org.oscar.demo.mybatis.java.config.service;

import org.oscar.demo.mybatis.java.config.mapper.HotelMapper;
import org.oscar.demo.mybatis.java.config.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 16/11/16
 * Version: 1.0-SNAPSHOT
 */
@Service
@Transactional
public class HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    /**
     * 测试事务是否起作用
     */
    public void testTransaction() {

        for (int i = 0; i < 10; i++) {
            this.hotelMapper.addHotel(new Hotel(i, "GeLin,No:" + (i + 1), "YuHuaTai east road, No: " + (i + 1), "400" + (i + 2)));
        }

        //主动抛异常，观察前面插入的十条数据有没有回滚
        throw new RuntimeException("Test transaction.");
    }

    public int selectHotelCount() {
        return this.hotelMapper.selectHotelCount();
    }
}
