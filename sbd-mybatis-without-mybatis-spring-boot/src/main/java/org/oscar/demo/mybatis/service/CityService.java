package org.oscar.demo.mybatis.service;

import org.oscar.demo.mybatis.mapper.CityMapper;
import org.oscar.demo.mybatis.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 16/11/16
 * Version: 1.0-SNAPSHOT
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public City findCityByState(String state) {
        return cityMapper.findCityByState(state);
    }
}
