package com.ferreteria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ferreteria.entity.Cliente;
import com.ferreteria.interfaces.ClienteDAO;
import com.ferreteria.util.MysqlDBConexion;

public class MysqlClienteDAO implements ClienteDAO {

	@Override
	public List<Cliente> listClientes() {
		List<Cliente> data = new ArrayList<Cliente>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "select * from tb_cliente";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Cliente d = new Cliente();
				d.setCod(rs.getInt(1));
				d.setNom(rs.getString(2));
				d.setDni(rs.getString(3));
				d.setDir(rs.getString(4));
				data.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (cn != null)
					cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return data;
	}

}
