package com.emp.controller;

import java.io.IOException;

import java.util.List;

import com.emp.dao.EmployeeDAO;
import com.emp.dto.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewAllEmployee")
public class ViewAllEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDAO dao;

	@Override
	public void init() throws ServletException {
		dao = new EmployeeDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Employee> emplist = dao.getEmpList();
		request.setAttribute("allEmp", emplist);
		
		RequestDispatcher rs = request.getRequestDispatcher("ViewList.jsp");
		rs.forward(request, response);
	}

}
