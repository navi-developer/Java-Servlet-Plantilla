package com.ferreteria.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ferreteria.entity.Cliente;
import com.ferreteria.service.ClienteService;

/**
 * Servlet implementation class ServletCliente
 */
@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ClienteService serCliente = new ClienteService();
	
    public ServletCliente() {
        super();
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String operacion = request.getParameter("operacion");
    	if(operacion.equals("listar"))
    		listarClientes(request,response);
    }

	private void listarClientes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Cliente>data=serCliente.allCliente();
		request.setAttribute("clientes", data);
		request.getRequestDispatcher("/index.jsp").forward(request,response);
		
	}

}
