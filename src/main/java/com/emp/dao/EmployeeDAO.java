package com.emp.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.dto.Employee;
import com.emp.util.DbConnection;

public class EmployeeDAO {

	public boolean saveEmployee(Employee e) {

		String save = "INSERT INTO empdb VALUES(?,?,?,?,?,?)";

		try (Connection con = DbConnection.getConnect(); PreparedStatement ps = con.prepareStatement(save);) {

			ps.setString(1, e.geteId());
			ps.setString(2, e.getEname());
			ps.setString(3, e.getEmail());
			ps.setLong(4, e.getPhone());
			ps.setDouble(5, e.getSalary());
			ps.setString(6, e.getCompany());

			int count = ps.executeUpdate();
			return count > 0;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}
	

	public List<Employee> getEmpList() {

		List<Employee> eList = new ArrayList<Employee>();

		String allEmp = "SELECT * FROM empdb";

		try (Connection con = DbConnection.getConnect(); PreparedStatement ps = con.prepareStatement(allEmp);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.seteId(rs.getString(1));
				emp.setEname(rs.getString(2));
				emp.setEmail(rs.getString(3));
				emp.setPhone(rs.getLong(4));
				emp.setSalary(rs.getDouble(5));
				emp.setCompany(rs.getString(6));
				eList.add(emp);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return eList;
	}
	

	public boolean deleteEmp(String id) {

		String del = "DELETE FROM empdb WHERE eid=?";

		try (Connection con = DbConnection.getConnect(); PreparedStatement ps = con.prepareStatement(del);) {

			ps.setString(1, id);
			int count = ps.executeUpdate();
			
			return count > 0;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;

	}
	
	
	public Employee getEmployeeById(String id) {
		
		String emp="SELECT * FROM empdb WHERE eid=?";
		Employee e = new Employee();
		
		try (Connection con = DbConnection.getConnect(); PreparedStatement ps = con.prepareStatement(emp);) {

			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				e.seteId(rs.getString(1));
				e.setEname(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPhone(rs.getLong(4));
				e.setSalary(rs.getDouble(5));
				e.setCompany(rs.getString(6));
				return e;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return null;
	}
	
	
	public boolean updateEmployee(Employee e) {
		
		String update = "UPDATE empdb SET ename=?, email=?, phone=?, salary=?, company=? WHERE eid=?";
		
		try (Connection con = DbConnection.getConnect(); PreparedStatement ps = con.prepareStatement(update);) {

			ps.setString(1, e.getEname());
			ps.setString(2, e.getEmail());
			ps.setLong(3, e.getPhone());
			ps.setDouble(4, e.getSalary());
			ps.setString(5, e.getCompany());
			ps.setString(6, e.geteId());

			int count = ps.executeUpdate();
			return count > 0;

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
		
	}
	
	
}
