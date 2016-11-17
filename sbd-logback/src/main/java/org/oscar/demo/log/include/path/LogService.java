package org.oscar.demo.log.include.path;

import org.oscar.demo.log.utils.LogTestUtil;
import org.springframework.stereotype.Service;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 17/11/16
 * Version: 1.0-SNAPSHOT
 */
@Service
public class LogService {

    public void outputLog() {
        LogTestUtil.outputLog(this.getClass());
    }

}
