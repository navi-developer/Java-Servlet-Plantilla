package com.ferreteria.util;

import java.sql.Connection;

public class TestConexion {

	@SuppressWarnings("static-access")
	public static void main(String[]args){
		Connection cn=new MysqlDBConexion().getConexion();
		System.out.println(cn);
	}

}
