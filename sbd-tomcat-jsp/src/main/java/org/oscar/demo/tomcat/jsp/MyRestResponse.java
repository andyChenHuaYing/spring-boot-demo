package org.oscar.demo.tomcat.jsp;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 14/11/16
 * Version: 1.0-SNAPSHOT
 */
public class MyRestResponse {

    private String message;

    public MyRestResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
