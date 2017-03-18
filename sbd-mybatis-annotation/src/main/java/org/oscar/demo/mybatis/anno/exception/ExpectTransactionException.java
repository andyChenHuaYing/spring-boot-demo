package org.oscar.demo.mybatis.anno.exception;

import org.springframework.transaction.TransactionException;

/**
 * Description:
 * <p>
 * Author: oscar
 * Create Date: 18/03/17
 * Version: 1.0-SNAPSHOT
 */
public class ExpectTransactionException extends TransactionException {

    public ExpectTransactionException(String msg) {
        super(msg);
    }
}
