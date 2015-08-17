package mx.com.sidlors.ibatis.test;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import org.hsqldb.cmdline.SqlFile;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import es.indra.hls.indrasid.business.mec.dao.services.EmployeeDAO;

public class DAOEmployee {

	private File file;
	private  SqlFile sqlFile;
	private  Connection conn;
	private EmployeeDAO dao;

	@BeforeClass
	public static void before() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		
		Class.forName("org.hsqldb.jdbc.JDBCDriver").newInstance();
		 
		

	}

	@Before
	public void setUp() throws Exception {
		dao = new EmployeeDAO();
		file=new File("src/main/resources/db/scriptDB.sql");
		sqlFile = new SqlFile(file);
		conn = DriverManager.getConnection("jdbc:hsqldb:mem:test","SA","");
		try {
			sqlFile.setConnection(conn);
			sqlFile.execute();
			conn.commit();
		} finally {
			conn.close();
		}

	}

	@Test
	public void testCreate() throws IOException, SQLException {

		dao.createEmployee();
	}

	@Test
	public void testRead() throws IOException, SQLException {

		dao.readEmployee();
	}

}
