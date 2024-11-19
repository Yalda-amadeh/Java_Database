package javaDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ORM {
	private static final String URL = "jdbc:h2:tcp://localhost:9092/~/testdb";
	private static final String USER = "sa";
	private static final String PASSWORD = "";

	public static void main(String[] args) throws SQLException {
		String country = "US";
		String sql = """
				
				SELECT * FROM COUNTRIES,DEPARTMENTS WHERE COUNTRY_ID = ? """;
		
		List<Departments> department = new ArrayList<>();
		try(
				Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
				PreparedStatement prepareStatment = connection.prepareStatement(sql);
				){
			System.out.println("Connection Successfully");
			prepareStatment.setString(1,country);
			try(ResultSet resultset = prepareStatment.executeQuery()){
				while (resultset.next()) {

					Departments dep = new Departments();
					dep.setId(resultset.getString("DEPARTMENT_ID"));
					dep.setDepartmentname(resultset.getString("DEPARTMENT_NAME"));
					dep.setLocation(resultset.getString("LOCATION_ID"));
					
					Countries coun =new Countries();
					coun.setCountryId(resultset.getString("COUNTRY_ID"));
					coun.setCountryname(resultset.getString("COUNTRY_NAME"));
					coun.setRegion(resultset.getString("REGION_ID"));
					
					dep.setCountry(coun);
                	department.add(dep);	
					
				}
				department.forEach( System.out::println );
			}
	}

}}
