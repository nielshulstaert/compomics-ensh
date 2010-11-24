package com.compomics.ensh.exception;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 10-Dec-2007<br/>
 * Time: 12:37:57<br/>
 */
public class EnshException extends Exception {

    /**
     * {@inheritDoc}
     */
    public EnshException(){
        super();
    }

    /**
     * {@inheritDoc}
     */
    public EnshException(String message){
        super(message);
    }

    /**
     * {@inheritDoc}
     */
    public EnshException(String message, Throwable cause){
        super(message, cause);
    }

    /**
     * {@inheritDoc}
     */
    public EnshException(Throwable cause){
        super(cause);
    }

}

