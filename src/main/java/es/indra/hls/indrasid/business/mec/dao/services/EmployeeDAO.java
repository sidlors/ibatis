package es.indra.hls.indrasid.business.mec.dao.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO extends AbstractDAO {

	public void createEmployee() throws IOException, SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		System.out.println("Going to insert record.....");
		Employee em = new Employee("Zara", "Ali", 5000);
		smc.insert("Employee.insert", em);
		System.out.println("Record Inserted Successfully ");
	}

	public void readEmployee() throws IOException, SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		/* This would read all records from the Employee table. */
		System.out.println("Going to read records.....");
		List<Employee> ems = smc.queryForList("Employee.getAll", null);
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

	public EmployeeDAO() {
		try {
			connect();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}