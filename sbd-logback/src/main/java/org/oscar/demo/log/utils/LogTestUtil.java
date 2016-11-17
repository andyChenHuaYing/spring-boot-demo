package org.oscar.demo.log.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 17/11/16
 * Version: 1.0-SNAPSHOT
 */
public class LogTestUtil {

    public static void outputLog(Class<?> clazz) {
        Logger LOGGER = LoggerFactory.getLogger(clazz);
        LOGGER.trace("TRACE级别 {}", clazz.getName());
        LOGGER.debug("DEBUGGER级别 {}", clazz.getName());
        LOGGER.info("INFO级别 {}", clazz.getName());
        LOGGER.warn("WARN级别 {}", clazz.getName());
        LOGGER.error("ERROR级别 {}", clazz.getName());

    }
}
