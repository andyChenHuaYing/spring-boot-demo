package org.oscar.demo.log;

import org.oscar.demo.log.exclude.path.ExcludeLogService;
import org.oscar.demo.log.include.path.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 17/11/16
 * Version: 1.0-SNAPSHOT
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @Autowired
    private LogService logService;

    @Autowired
    private ExcludeLogService excludeLogService;

    @Autowired
    private Environment environment;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        logService.outputLog();
        excludeLogService.outputLog();
        LOGGER.error("Read property 'custom.key' from environment: {}", environment.resolvePlaceholders("${custom.key: default value}"));
    }
}
