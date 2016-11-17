package org.oscar.demo.mybatis.java.config.springboot.datasource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 16/11/16
 * Version: 1.0-SNAPSHOT
 */

@RunWith(SpringRunner.class)
public class DataSourceConfigurationTest {

    @Autowired
    private DataSource dataSource;

    @org.junit.Test
    public void dataSource() throws Exception {
        System.out.println(dataSource);
    }

}