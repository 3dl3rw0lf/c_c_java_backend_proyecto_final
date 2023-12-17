/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codoacodo.estadisticas_f1.controllers;

import com.codoacodo.estadisticas_f1.dao.PilotoDAO;
import com.codoacodo.estadisticas_f1.dto.Piloto;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author xang_
 */

@WebServlet("/api/listadoPilotoController")
public class ListadoPilotoController extends HttpServlet{
  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//crear la instancia de ProductoDAO
		PilotoDAO dao = new PilotoDAO();
		
		//invocar al metodo listarProductos()
		List<Piloto> listado = dao.ListPilots();
		
		//grabar el listado en el request para que lo vea la siguiente pagina
		req.setAttribute("listado", listado);
		
		//ir a la siguiente pagina
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
}
