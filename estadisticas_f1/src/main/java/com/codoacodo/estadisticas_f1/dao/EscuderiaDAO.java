/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codoacodo.estadisticas_f1.dao;

import com.codoacodo.estadisticas_f1.connection.ConnectionManager;
import com.codoacodo.estadisticas_f1.dto.Escuderia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xang_
 */


public class EscuderiaDAO {
     /*READ  pilots from BBDD*/
    public List<Escuderia> ListTeam(){
        String request = "SELECT * FROM TEAM;";
        
        /*connection*/
        Connection conn = ConnectionManager.getConnection();
        
        List<Escuderia> list = new ArrayList<>();
        
        //Statement
		try {
			Statement st = conn.createStatement();
			
			//resultset
			ResultSet rs = st.executeQuery(request);
			
			//VIENE UN SOLO REGISTRO!!!
			
			while(rs.next()) {//
				// rs > sacando los datos
				Long idEscuderia = rs.getLong(1);//tomar la primer columna
				String nombreEscuderia = rs.getString(2);
				String img_Escuderia = rs.getString(3);
				int titulosEscuderia = rs.getInt(4);
				
				//campos crear un objeto????
				Escuderia escuderiaFromDb = new Escuderia( idEscuderia, nombreEscuderia, img_Escuderia, titulosEscuderia);
				
				//agrego a la lista 
				list.add(escuderiaFromDb);
			}			
			
			//cierro la conexion
			conn.close();
		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}
		return list;
    }
}
