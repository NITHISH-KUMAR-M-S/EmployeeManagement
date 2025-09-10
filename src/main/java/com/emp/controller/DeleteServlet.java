package com.emp.controller;

import java.io.IOException;

import com.emp.dao.EmployeeDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//Hello


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	EmployeeDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao = new EmployeeDAO();
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("empid");
		
		boolean isDeleted = dao.deleteEmp(eid);
		
		if(isDeleted) {
			response.sendRedirect("ViewAllEmployee"+"?msg:"+"Deleted"+"Successfully.");
		}else {
			response.sendRedirect("ViewAllEmployee"+"?msg:"+"Falied"+"to"+"delete.");	
		}
	}


}
