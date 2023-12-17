/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codoacodo.estadisticas_f1.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author xang_
 */
    

public class ConnectionManager {

	public static Connection getConnection() {
		String url = "jdbc:mysql://127.0.0.1:3306/codo";
		String username = "root";
		String password = "Wolf1980";
		
		String driverName = "com.mysql.cj.jdbc.Driver";

		//control errores
		Connection con = null;
		try {
			Class.forName(driverName);//carga en memoria el Driver
			con = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			e.printStackTrace();//muestra la excepción y el error
		}
		return con;
	}
	
	public static void main(String[] args) {
		Connection con = ConnectionManager.getConnection();//f5
		if(con != null) {
			System.out.println("Conexion ok");
		}else {
			System.err.println("Conexion fail");
		}
	}
}
