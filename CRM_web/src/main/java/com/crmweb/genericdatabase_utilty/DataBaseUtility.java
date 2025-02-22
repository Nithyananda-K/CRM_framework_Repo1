package com.crmweb.genericdatabase_utilty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {

	Connection con;
	public void getDbconnection(String url, String username, String password) throws SQLException {
		try {
			Driver driver = new Driver();                      //object created for mysql driver
			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}

	public void getDbconnection() throws SQLException {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void closeDbconnection() throws SQLException {

		try {
			con.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public ResultSet executeConSelectQuery(String query) throws Throwable {
		ResultSet result = null;
		try {
			Statement stat = con.createStatement();
			result = stat.executeQuery(query);
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}

	public int executeNonselectquery(String query) {
		int result = 0;
		try {
			Statement stat = con.createStatement();
			result = stat.executeUpdate(query);
		} catch (Exception e) {
			e.getMessage();
		}
		return result; // return integer value
	}
}
