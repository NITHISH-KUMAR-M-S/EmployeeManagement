package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.emp.dao.EmployeeDAO;
import com.emp.dto.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	EmployeeDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao = new EmployeeDAO();
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		
		String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		String email = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phone"));
		double salary = Double.parseDouble(request.getParameter("salary"));
		String company = request.getParameter("cname");
		
		Employee e = new Employee(eid, ename, email, phone, salary, company);

		boolean isUpdated = dao.updateEmployee(e);
		
		if(isUpdated) {
//			out.println("Updated Sucessfully.");
			response.sendRedirect("ViewAllEmployee?msg=updateded+successfully");
		}else {
//			out.println("Falied to Update");
			response.sendRedirect("EditDetails.jsp?msg=falied+to+update");
		}
		
	}


}
