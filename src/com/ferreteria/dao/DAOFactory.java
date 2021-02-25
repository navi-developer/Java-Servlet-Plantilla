package com.ferreteria.dao;

import com.ferreteria.interfaces.ClienteDAO;

public abstract class DAOFactory {
	
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int DB2 = 3;
    public static final int SQLSERVER = 4;
    public static final int XML = 5;
    
    public abstract ClienteDAO getClienteDAO();
    
    public static DAOFactory getDAOFactory(int whichFactory){
        switch(whichFactory){
       	case MYSQL:
       		return new MySqlDAOFactory();
        	case XML:
        		return null;
        	    //return new XmlDAOFactory();
        	case ORACLE:
        		return null;
        	    //return new OracleDAOFactory();
        	case DB2:
        		return null;
        	    //return new Db2DAOFactory();
        	case SQLSERVER:
        		return null;
        	    //return new SqlServerDAOFactory();
        	default:
        	    return null;
        }
     }

}
