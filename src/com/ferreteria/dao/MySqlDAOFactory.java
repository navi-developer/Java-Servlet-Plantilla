package com.ferreteria.dao;

import com.ferreteria.interfaces.ClienteDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public ClienteDAO getClienteDAO() {
		// TODO Auto-generated method stub
		return new MysqlClienteDAO();
	}

}
