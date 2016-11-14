package org.oscar.demo.tomcat.jsp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 14/11/16
 * Version: 1.0-SNAPSHOT
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 注意参数，如果捕获到的异常不是参数指定的异常或其子类，则同样会抛异常。
     * @param exception 代码中抛出的异常
     * @return 返回的提示信息，可以是错误界面也可以是JSON格式的数据
     */
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {Exception.class})
    public MyRestResponse handleRuntimeException(Exception exception) {
        return new MyRestResponse("Some data that you want to send bck to the client and the exception message" +
                exception.getMessage());
    }
}
