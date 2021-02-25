package com.ferreteria.service;

import java.util.List;

import com.ferreteria.dao.DAOFactory;
import com.ferreteria.entity.Cliente;
import com.ferreteria.interfaces.ClienteDAO;
import com.ferreteria.util.Constantes;

public class ClienteService {
	
	 //Paso 1: indicar origen de datos mysql
	 DAOFactory fabrica=DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	 //PAso 2: indicar con que DAO se va a trabajar
	 ClienteDAO objDoc=fabrica.getClienteDAO();
	 
	 public List<Cliente> allCliente() {
		 return objDoc.listClientes();
	 }
}
