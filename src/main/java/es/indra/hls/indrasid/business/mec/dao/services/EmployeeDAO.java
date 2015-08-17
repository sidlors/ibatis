package es.indra.hls.indrasid.business.mec.dao.services;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EmployeeDAO {
	
	
	public void createEmployee() throws IOException, SQLException {
		
		Reader rd = Resources.getResourceAsReader("./ibatis/SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		System.out.println("Going to insert record.....");
		Employee em = new Employee("Zara", "Ali", 5000);
		smc.insert("Employee.insert", em);
		System.out.println("Record Inserted Successfully ");
	}
	
	public void readEmployee() throws IOException, SQLException{
	      Reader rd = Resources.getResourceAsReader("ibatis/SqlMapConfig.xml");
	      SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

	      /* This would read all records from the Employee table. */
	      System.out.println("Going to read records.....");
	      List<Employee> ems = (List<Employee>)smc.queryForList("Employee.getAll", null);
	      Employee em = null;
			
	      for (Employee e : ems) {
	         System.out.print("  " + e.getId());
	         System.out.print("  " + e.getFirst_name());
	         System.out.print("  " + e.getLast_name());
	         System.out.print("  " + e.getSalary());
	         em = e; 
	         System.out.println("");
	      }    
			
	      System.out.println("Records Read Successfully ");
	   }
	
}