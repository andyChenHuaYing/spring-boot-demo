package org.oscar.demo.mybatis.java.config.springboot.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 16/11/16
 * Version: 1.0-SNAPSHOT
 */
@Configuration
public class DataSourceConfiguration {

    @Value("${hikaricp.url}")
    private String url;

    @Value("${hikaricp.username}")
    private String username;

    @Value("${hikaricp.password}")
    private String password;

    @Value("${hikaricp.jdbc.driverClassName}")
    private String driverClassName;

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);
        hikariConfig.setJdbcUrl(url);
        return new HikariDataSource(hikariConfig);
    }
}
