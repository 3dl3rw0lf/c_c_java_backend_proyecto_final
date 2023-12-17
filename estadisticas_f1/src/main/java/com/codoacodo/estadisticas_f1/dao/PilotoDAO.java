/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codoacodo.estadisticas_f1.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

import com.codoacodo.estadisticas_f1.connection.ConnectionManager;
import com.codoacodo.estadisticas_f1.dto.Piloto;


/**
 *
 * @author xang_
 */
public class PilotoDAO {
    /*READ  pilots from BBDD*/
    public List<Piloto> ListPilots(){
        String request = "SELECT * FROM PILOT;";
        
        /*connection*/
        Connection conn = ConnectionManager.getConnection();
        
        List<Piloto> list = new ArrayList<>();
        
        //Statement
		try {
			Statement st = conn.createStatement();
			
			//resultset
			ResultSet rs = st.executeQuery(request);
			
			//VIENE UN SOLO REGISTRO!!!
			
			while(rs.next()) {//
				// rs > sacando los datos
				Long pilotId = rs.getLong(1);//tomar la primer columna
				String pilotName = rs.getString(2);
				String pilotImg_src = rs.getString(3);
				String pilotAlt_img = rs.getString(4);
				String pilotFlag = rs.getString(5);
				String pilotCountry = rs.getString(6);
				String pilotBadge = rs.getString(7);
                                int pilotTitles = rs.getInt(8);
				
				//campos crear un objeto????
				Piloto pilotFromDb = new Piloto(pilotId, pilotName, pilotImg_src, pilotAlt_img,  pilotFlag, pilotCountry, pilotBadge, pilotTitles);
				
				//agrego a la lista 
				list.add(pilotFromDb);
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
