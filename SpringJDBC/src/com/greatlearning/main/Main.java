package com.greatlearning.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.greatlearning.entity.Employee;

public class Main {
	
	static JdbcTemplate jdbcTemplateObj;
	static SimpleDriverDataSource dataSourceObj;

	//db configuration
	static String USERNAME="root";
	static String PASSWORD="";
	static String URL="jdbc:mysql://localhost:3306/springJdbc";

	public static SimpleDriverDataSource getDatabaseConnection() {
		dataSourceObj = new SimpleDriverDataSource();
		try {
			dataSourceObj.setDriver(new com.mysql.cj.jdbc.Driver());
			dataSourceObj.setUsername(USERNAME);
			dataSourceObj.setPassword(PASSWORD);
			dataSourceObj.setUrl(URL);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return dataSourceObj;
	}

	public static void main(String[] args) {
		
		jdbcTemplateObj = new JdbcTemplate(getDatabaseConnection());
		
		if(jdbcTemplateObj!=null) {
			
			//SQL insert operation
			String sqlInsertQuery = "insert into employee(name,email,address,phoneno) values(?,?,?,?)";
			for(int i=0;i<5;i++) {
				jdbcTemplateObj.update(sqlInsertQuery,"employee"+i,"employee"+i+"@gmail.com","surat","1234567895");
			}
			
			//SQL update operation
			String sqlUpdateQuery = "update employee set email=? where name=?";
			jdbcTemplateObj.update(sqlUpdateQuery,"admin@gmail.com","employee2");
			
			//SQL read operation
			String sqlSelectQuery = "SELECT name, email, address, phoneNo FROM Employee";
			
			List listEmployee = jdbcTemplateObj.query(sqlSelectQuery,new RowMapper() {

				@Override
				public Object mapRow(ResultSet result, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					Employee employee = new Employee();
					employee.setName(result.getString("name"));
					employee.setEmail(result.getString("email"));
					employee.setAddress(result.getString("address"));
					employee.setPhoneNo(result.getString("phoneNo"));
					return employee;
				}
			});

			for(Object emp : listEmployee) {
				System.out.println(emp.toString());
			}
			
			//SQL delete operation
			String sqlDeleteQuery = "delete from employee where name=?";
			jdbcTemplateObj.update(sqlDeleteQuery,"employee1");
			
		} else {
			System.out.println("please check your connetion, unable to connect to the database");
		}
		
	}

}
