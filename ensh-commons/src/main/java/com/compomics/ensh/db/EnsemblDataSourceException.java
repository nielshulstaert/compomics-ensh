package com.compomics.ensh.db;

/**
 * Created by IntelliJ IDEA.
 * User: Michael Mueller
 * Date: 29-Jul-2009
 * Time: 14:16:07
 */
public class EnsemblDataSourceException extends Exception {

    /**
     * {@inheritDoc}
     */
    public EnsemblDataSourceException(){
        super();
    }

    /**
     * {@inheritDoc}
     */
    public EnsemblDataSourceException(String message){
        super(message);
    }

    /**
     * {@inheritDoc}
     */
    public EnsemblDataSourceException(String message, Throwable cause){
        super(message, cause);
    }

    /**
     * {@inheritDoc}
     */
    public EnsemblDataSourceException(Throwable cause){
        super(cause);
    }

}
